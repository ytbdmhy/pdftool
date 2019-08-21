package com.ytbdmhy.pdftool.controller;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;

@Service
public class ExportPdfServiceImpl  {

    private void exportPdf(HttpServletResponse response, String ftl, HashMap param) {
        String url = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//        long snowflakeId = new SnowflakeIdWorker(GeneralConstants.SNOW_FLAKE_WORKER_ID, GeneralConstants.SNOW_FLAKE_DATA_CENTER_ID).nextId();
        long snowflakeId = 123145124;
        String htmlPath = url + "templates/" + ftl.substring(0, ftl.indexOf(".ftl")) + snowflakeId + ".html";
        String fontPath = url + "static/font/simsun.ttf";
        try {
            response.setContentType("application/force-download");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(snowflakeId + ".pdf", "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Writer writer = null;
        try{
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(htmlPath), "UTF-8"));
            Configuration configuration = new Configuration();
            configuration.setClassicCompatible(true);
            TemplateLoader templateLoader = new FileTemplateLoader(new File(url + "templates/"));
            configuration.setTemplateLoader(templateLoader);
            Template template = configuration.getTemplate(ftl);
            template.setEncoding("UTF-8");
            template.process(param, writer);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        OutputStream outputStream = null;
        PdfWriter pdfWriter = null;
        InputStream htmlInputStream = null;
        try {
            outputStream = new BufferedOutputStream(response.getOutputStream());
            ConverterProperties converterProperties = new ConverterProperties();
            DefaultFontProvider fontProvider = new DefaultFontProvider(false, false, false);
            fontProvider.addFont(fontPath);
            converterProperties.setFontProvider(fontProvider);
            pdfWriter = new PdfWriter(outputStream);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            pdfDocument.setDefaultPageSize(PageSize.A4);
            htmlInputStream = new FileInputStream(htmlPath);
            Document document = HtmlConverter.convertToDocument(htmlInputStream, pdfDocument, converterProperties);
            document.getRenderer().close();
            PdfPage page = pdfDocument.getPage(1);
            page.setMediaBox(new Rectangle(0, 0, 595.0F, 842.0F));
            document.close();
            pdfDocument.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pdfWriter.flush();
                pdfWriter.close();
                htmlInputStream.close();
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            new File(htmlPath).delete();
        }
    }
}
