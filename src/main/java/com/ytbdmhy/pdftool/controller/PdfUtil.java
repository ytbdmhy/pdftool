package com.ytbdmhy.pdftool.controller;

import com.openhtmltopdf.outputdevice.helper.BaseRendererBuilder;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import com.openhtmltopdf.util.XRLog;
import com.ytbdmhy.pdftool.pojo.BaseOrgSocialInfo;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class PdfUtil {

    public static byte[] getRightsAndInterestsPdf(BaseOrgSocialInfo baseOrgSocialInfo) {
        String ftlName= "rightsAndInterests.pdf";
        String ftlContent = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\"/>\n" +
                "    <title>pdfTool</title>\n" +
                "    <style>\n" +
                "        body,td,th {\n" +
                "            font-family: simsun;\n" +
                "            font-size: 20px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"all\" style=\"height: 978px;width: 649px;margin: 0 auto\">\n" +
                "    <div>\n" +
                "        <table style=\"width: 100%;height:100%;text-align: center;border-collapse: collapse\" cellspacing=\"0px\" cellpadding=\"0px\">\n" +
                "            <thead>\n" +
                "            <td width=\"50%\"></td>\n" +
                "            <td width=\"50%\"></td>\n" +
                "            </thead>\n" +
                "            <tbody>\n" +
                "            <tr>\n" +
                "                <td colspan=\"2\" style=\"height: 50px;text-align: center;vertical-align: middle\"><b>个人参保信息-权益打印</b></td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td colspan=\"2\" style=\"height: 50px;text-align: left;vertical-align: bottom;padding-left: 5px\">参保信息</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">姓名</td>\n" +
                "                <td style=\"text-align: left;padding-left:5px;border: 1px solid black\">${baseOrgSocialInfo.name}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">民族</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.nation}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">地址</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.adress}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">参保状态</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.insuredState}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">电话</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.telphone}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">人员类别</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.personType}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td colspan=\"2\" style=\"height: 100px;text-align: left;padding-left: 5px;vertical-align: bottom\">领取信息</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">银行卡号</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.bankAccount}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">发放状态</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.grantState}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">最新发放时间</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.lastGrantMonth}</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td style=\"height: 50px;text-align: left;padding-left: 5px;border: 1px solid black\">缴费状态</td>\n" +
                "                <td style=\"text-align: left;padding-left: 5px;border: 1px solid black\">${baseOrgSocialInfo.payState}</td>\n" +
                "            </tr>\n" +
                "            </tbody>\n" +
                "        </table>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
        String html = null;
        Writer writer = null;
        HashMap<String, BaseOrgSocialInfo> param = new HashMap<>();
        param.put("baseOrgSocialInfo", baseOrgSocialInfo);
        try{
            writer = new StringWriter();
            Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
            configuration.setClassicCompatible(true);
            configuration.setEncoding(Locale.SIMPLIFIED_CHINESE, "UTF-8");
            StringTemplateLoader templateLoader = new StringTemplateLoader();
            templateLoader.putTemplate(ftlName, ftlContent);
            configuration.setTemplateLoader(templateLoader);
            Template template = configuration.getTemplate(ftlName);
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
        ByteArrayOutputStream outputStream = null;
        byte[] bytes = null;
        try {
            outputStream = new ByteArrayOutputStream();
            XRLog.setLoggingEnabled(false);
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.useFastMode();
            builder.useFont(() -> PdfUtil.class.getResourceAsStream("/static/font/simsun.ttf"), "simsun", 400, BaseRendererBuilder.FontStyle.NORMAL, true);
            builder.withHtmlContent(html, "");
            builder.toStream(outputStream);
            builder.run();
            bytes = outputStream.toByteArray();
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

        /**
         * 测试用导出byte[]转file
         */
        File pdf = new File("C:\\Users\\Administrator\\Desktop\\test.pdf");
        OutputStream os = null;
        try {
            os = new FileOutputStream(pdf);
            os.write(bytes);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.flush();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return bytes;
    }

    public static void main(String[] args) {
        BaseOrgSocialInfo baseInfo = new BaseOrgSocialInfo();
        baseInfo.setName("缪颢云");
        baseInfo.setNation("汉族");
        baseInfo.setAdress("上海市");
        baseInfo.setInsuredState("正在参保");
        baseInfo.setTelphone("13818748004");
        baseInfo.setPersonType("不是人");
        baseInfo.setBankAccount("1234567890");
        baseInfo.setGrantState("未发放");
        baseInfo.setLastGrantMonth("2019-07");
        baseInfo.setPayState("已缴费");
        System.out.println(Arrays.toString(getRightsAndInterestsPdf(baseInfo)));
    }
}
