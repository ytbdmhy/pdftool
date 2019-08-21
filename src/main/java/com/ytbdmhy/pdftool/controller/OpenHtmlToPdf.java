package com.ytbdmhy.pdftool.controller;

import com.openhtmltopdf.extend.FSSupplier;
import com.openhtmltopdf.outputdevice.helper.BaseRendererBuilder;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import com.ytbdmhy.pdftool.constant.GeneralConstants;
import com.ytbdmhy.pdftool.constant.PdfConstants;
import com.ytbdmhy.pdftool.entity.XcBaseInfo;
import com.ytbdmhy.pdftool.util.SnowflakeIdWorker;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.StringTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import sun.nio.cs.Surrogate;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Locale;

public class OpenHtmlToPdf {

    public static void main(String[] args) {
        String localPath = "D:\\WorkJavaProject\\pdftool\\src\\main";
        String resourcesUrl = localPath + "/resources/";
        long snowflakeId = new SnowflakeIdWorker(GeneralConstants.SNOW_FLAKE_WORKER_ID, GeneralConstants.SNOW_FLAKE_DATA_CENTER_ID).nextId();
        HashMap param = new HashMap();
        XcBaseInfo xcBaseInfo = new XcBaseInfo();
        xcBaseInfo.setGrade("100");
        param.put("xcBaseInfo", xcBaseInfo);
        String htmlPath = resourcesUrl + snowflakeId + ".html";
        String html = null;
        Writer writer = null;
        try{
//            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(htmlPath), StandardCharsets.UTF_8));
            writer = new FileWriter(htmlPath);

            Configuration configuration = new Configuration();
            configuration.setClassicCompatible(true);
            configuration.setEncoding(Locale.SIMPLIFIED_CHINESE, "UTF-8");

            TemplateLoader templateLoader = new FileTemplateLoader(new File(resourcesUrl + "templates/"));
//            StringTemplateLoader templateLoader = new StringTemplateLoader();
//            templateLoader.putTemplate(PdfConstants.INSURED_REGISTRATION, PdfConstants.INSURED_REGISTRATION_STR);

            configuration.setTemplateLoader(templateLoader);
            Template template = configuration.getTemplate(PdfConstants.INSURED_REGISTRATION);
            template.setEncoding("UTF-8");
            template.process(param, writer);
            html = writer.toString();
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
        try {
            outputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\" + snowflakeId + ".pdf");
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.useFastMode();
            builder.useFont(() -> {
                try {
                    return new FileInputStream("D:\\WorkJavaProject\\pdftool\\src\\main\\resources\\static\\font\\simsun.ttf");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                return null;
            }, "simsun", 400, BaseRendererBuilder.FontStyle.NORMAL, true);

//            builder.withHtmlContent(html, "");
            builder.withFile(new File(htmlPath));
            builder.toStream(outputStream);
            builder.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
