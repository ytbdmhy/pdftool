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
import com.ytbdmhy.pdftool.dao.EndowmentInsuranceDao;
import com.ytbdmhy.pdftool.entity.EndowmentInsurance;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;


@RestController
public class TestController3 {

    @Autowired
    private EndowmentInsuranceDao endowmentInsuranceDao;

    @GetMapping("/getPdf2")
    public String getPdf2(@RequestParam(required = false) String id, HttpServletResponse response) {
        long startTime = System.currentTimeMillis();
        String url = Thread.currentThread().getContextClassLoader().getResource("templates/").getPath().substring(1);
        String ftl = "xiChong_county_table1_pdf.ftl";
        String html = url + "xiChongTable1" + startTime + ".html";
        String pdfName = "西充县城乡居民社会养老保险参保登记表" + startTime + ".pdf";
        Writer out = null;
        HashMap<String, Object> needReplaceMapData = new HashMap<String, Object>();
        EndowmentInsurance endowmentInsurance;
        if (StringUtils.isEmpty(id)) {
            endowmentInsurance = new EndowmentInsurance();
        } else {
            endowmentInsurance = endowmentInsuranceDao.selectByPrimaryKey(Integer.valueOf(id));
        }
//        endowmentInsurance.setId(1);
//        endowmentInsurance.setName("缪颢云");
//        endowmentInsurance.setGender(1);
//        endowmentInsurance.setIdentityNumber("320623199005275293");
//        endowmentInsurance.setIsVillageSignature(0);
//        endowmentInsurance.setIsTownSignature(0);
//        endowmentInsurance.setPaymentStandard("200");
//        endowmentInsurance.setPhone("13818748004");
//        endowmentInsurance.setNation("汉族");
        needReplaceMapData.put("endowmentInsurance", endowmentInsurance);
        PdfWriter writer = null;
        FileInputStream fileInputStream = null;
        OutputStream outputStream = null;
        try {
            response.setContentType("application/force-download");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(pdfName, "UTF-8"));
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(html), "UTF-8"));
            Configuration configuration = new Configuration();
            configuration.setClassicCompatible(true);
            TemplateLoader templateLoader = new FileTemplateLoader(new File(url));
            configuration.setTemplateLoader(templateLoader);
            Template template = configuration.getTemplate(ftl);
            template.setEncoding("UTF-8");
            template.process(needReplaceMapData, out);
        } catch (Exception e1) {
            e1.printStackTrace();
            return "pdf导出异常";
        } finally {
            try {
                out.flush();
                out.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        try {
//            String fontPath = "./src/main/resources/static/font/NotoSansCJKsc-Regular.otf";
            String fontPath = "./src/main/resources/static/font/simsun.ttf";
            ConverterProperties converterProperties = new ConverterProperties();
            DefaultFontProvider fontProvider = new DefaultFontProvider(false, false, false);
            fontProvider.addFont(fontPath);
            converterProperties.setFontProvider(fontProvider);
            outputStream = new BufferedOutputStream(response.getOutputStream());
            writer = new PdfWriter(outputStream);
            PdfDocument pdfDocument = new PdfDocument(writer);
            pdfDocument.setDefaultPageSize(PageSize.A4);
            fileInputStream = new FileInputStream(html);
            Document document = HtmlConverter.convertToDocument(fileInputStream, pdfDocument, converterProperties);
            document.getRenderer().close();
            PdfPage page = pdfDocument.getPage(1);
            page.setMediaBox(new Rectangle(0, 0, 595.0F, 842.0F));
            document.close();
            pdfDocument.close();
            return "pdf导出成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "pdf导出异常";
        } finally {
            try {
                writer.close();
                fileInputStream.close();
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            new File(html).delete();
            System.out.println(System.currentTimeMillis() - startTime + "毫秒");
        }
    }

    @GetMapping("/getPdf3")
    public String getPdf3(@RequestParam(required = false) String id, HttpServletResponse response) {
        long startTime = System.currentTimeMillis();
        String url = Thread.currentThread().getContextClassLoader().getResource("templates/").getPath().substring(1);
        String ftl = "xiChong_county_table3_pdf.ftl";
        String html = url + "xiChongTable2" + startTime + ".html";
        String pdfName = "西充县城乡居民社会养老保险补缴申请表" + startTime + ".pdf";
        Writer out = null;
        HashMap<String, Object> needReplaceMapData = new HashMap<String, Object>();
        EndowmentInsurance endowmentInsurance;
        if (StringUtils.isEmpty(id)) {
            endowmentInsurance = new EndowmentInsurance();
        } else {
            endowmentInsurance = endowmentInsuranceDao.selectByPrimaryKey(Integer.valueOf(id));
        }
//        endowmentInsurance.setId(1);
//        endowmentInsurance.setName("缪颢云");
//        endowmentInsurance.setGender(1);
//        endowmentInsurance.setIdentityNumber("320623199005275293");
//        endowmentInsurance.setIsVillageSignature(0);
//        endowmentInsurance.setIsTownSignature(0);
//        endowmentInsurance.setPaymentStandard("200");
//        endowmentInsurance.setPhone("13818748004");
//        endowmentInsurance.setNation("汉族");
        needReplaceMapData.put("endowmentInsurance", endowmentInsurance);
        PdfWriter writer = null;
        FileInputStream fileInputStream = null;
        OutputStream outputStream = null;
        try {
            response.setContentType("application/force-download");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(pdfName, "UTF-8"));
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(html), "UTF-8"));
            Configuration configuration = new Configuration();
            configuration.setClassicCompatible(true);
            TemplateLoader templateLoader = new FileTemplateLoader(new File(url));
            configuration.setTemplateLoader(templateLoader);
            Template template = configuration.getTemplate(ftl);
            template.setEncoding("UTF-8");
            template.process(needReplaceMapData, out);
        } catch (Exception e1) {
            e1.printStackTrace();
            return "pdf导出异常";
        } finally {
            try {
                out.flush();
                out.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        try {
//            String fontPath = "./src/main/resources/static/font/NotoSansCJKsc-Regular.otf";
            String fontPath = "./src/main/resources/static/font/simsun.ttf";
            ConverterProperties converterProperties = new ConverterProperties();
            DefaultFontProvider fontProvider = new DefaultFontProvider(false, false, false);
            fontProvider.addFont(fontPath);
            converterProperties.setFontProvider(fontProvider);
            outputStream = new BufferedOutputStream(response.getOutputStream());
            writer = new PdfWriter(outputStream);
            PdfDocument pdfDocument = new PdfDocument(writer);
            pdfDocument.setDefaultPageSize(PageSize.A4);
            fileInputStream = new FileInputStream(html);
            Document document = HtmlConverter.convertToDocument(fileInputStream, pdfDocument, converterProperties);
            document.getRenderer().close();
            PdfPage page = pdfDocument.getPage(1);
            page.setMediaBox(new Rectangle(0, 0, 595.0F, 842.0F));
            document.close();
            pdfDocument.close();
            return "pdf导出成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "pdf导出异常";
        } finally {
            try {
                writer.close();
                fileInputStream.close();
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            new File(html).delete();
            System.out.println(System.currentTimeMillis() - startTime + "毫秒");
        }
    }

    @GetMapping("/getPdf4")
    public String getPdf4(@RequestParam(required = false) String id, HttpServletResponse response) {
        long startTime = System.currentTimeMillis();
        String url = Thread.currentThread().getContextClassLoader().getResource("templates/").getPath().substring(1);
        String ftl = "xiChong_county_table4_pdf.ftl";
        String html = url + "xiChongTable4" + startTime + ".html";
        String pdfName = "西充县城乡居民社会养老保险终止注销登记表" + startTime + ".pdf";
        Writer out = null;
        HashMap<String, Object> needReplaceMapData = new HashMap<String, Object>();
        EndowmentInsurance endowmentInsurance;
        if (StringUtils.isEmpty(id)) {
            endowmentInsurance = new EndowmentInsurance();
        } else {
            endowmentInsurance = endowmentInsuranceDao.selectByPrimaryKey(Integer.valueOf(id));
        }
//        endowmentInsurance.setId(1);
//        endowmentInsurance.setName("缪颢云");
//        endowmentInsurance.setGender(1);
//        endowmentInsurance.setIdentityNumber("320623199005275293");
//        endowmentInsurance.setIsVillageSignature(0);
//        endowmentInsurance.setIsTownSignature(0);
//        endowmentInsurance.setPaymentStandard("200");
//        endowmentInsurance.setPhone("13818748004");
//        endowmentInsurance.setNation("汉族");
        needReplaceMapData.put("endowmentInsurance", endowmentInsurance);
        PdfWriter writer = null;
        FileInputStream fileInputStream = null;
        OutputStream outputStream = null;
        try {
            response.setContentType("application/force-download");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(pdfName, "UTF-8"));
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(html), "UTF-8"));
            Configuration configuration = new Configuration();
            configuration.setClassicCompatible(true);
            TemplateLoader templateLoader = new FileTemplateLoader(new File(url));
            configuration.setTemplateLoader(templateLoader);
            Template template = configuration.getTemplate(ftl);
            template.setEncoding("UTF-8");
            template.process(needReplaceMapData, out);
        } catch (Exception e1) {
            e1.printStackTrace();
            return "pdf导出异常";
        } finally {
            try {
                out.flush();
                out.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        try {
//            String fontPath = "./src/main/resources/static/font/NotoSansCJKsc-Regular.otf";
            String fontPath = "./src/main/resources/static/font/simsun.ttf";
            ConverterProperties converterProperties = new ConverterProperties();
            DefaultFontProvider fontProvider = new DefaultFontProvider(false, false, false);
            fontProvider.addFont(fontPath);
            converterProperties.setFontProvider(fontProvider);
            outputStream = new BufferedOutputStream(response.getOutputStream());
            writer = new PdfWriter(outputStream);
            PdfDocument pdfDocument = new PdfDocument(writer);
            pdfDocument.setDefaultPageSize(PageSize.A4);
            fileInputStream = new FileInputStream(html);
            Document document = HtmlConverter.convertToDocument(fileInputStream, pdfDocument, converterProperties);
            document.getRenderer().close();
            PdfPage page = pdfDocument.getPage(1);
            page.setMediaBox(new Rectangle(0, 0, 595.0F, 842.0F));
            document.close();
            pdfDocument.close();
            return "pdf导出成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "pdf导出异常";
        } finally {
            try {
                writer.close();
                fileInputStream.close();
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            new File(html).delete();
            System.out.println(System.currentTimeMillis() - startTime + "毫秒");
        }
    }

    public static void main(String[] args) {
        URL url = Thread.currentThread().getContextClassLoader().getResource("templates/");
        System.out.println(url.getPath());
    }
}

