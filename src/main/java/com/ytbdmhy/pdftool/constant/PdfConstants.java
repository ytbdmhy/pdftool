package com.ytbdmhy.pdftool.constant;

public class PdfConstants {

    /**
     * 西充县城乡居民社会养老保险参保登记表.pdf
     */
    public static final String INSURED_REGISTRATION = "xichong_insured_registration_pdf.ftl";

    /**
     * 西充县城乡居民社会养老保险补缴申请表.pdf
     */
    public static final String SUP_PAYMENT = "xichong_sup_payment_pdf.ftl";

    /**
     * 西充县城乡居民社会养老保险终止注销登记表.pdf
     */
    public static final String CANCELLATION = "xichong_cancellation_pdf.ftl";

    /**
     * 西充县城乡居民社会养老保险待遇领取审核表.pdf
     */
    public static final String RECEIVING_AUDIT = "xichong_receiving_audit_pdf.ftl";

    /**
     * 西充县城乡居民社会养老保险信息变更登记表.pdf
     */
    public static final String INFORMATION_CHANGE = "xichong_information_change_pdf.ftl";

    public static final String INSURED_REGISTRATION_STR = "<!DOCTYPE html>\n"+
            "<html lang=\"en\">\n"+
            "<head>\n"+
            "    <meta charset=\"utf-8\"/>\n"+
            "    <title>pdfTool</title>\n"+
            "    <style>\n"+
            "        body,td,th {\n"+
            "            font-family: simsun;\n"+
            "            font-size: 14px;\n"+
            "        }\n"+
            "        <#if xcBaseInfo.villageOpinion??>\n"+
            "            #villageOpinion {\n"+
            "                background: url(data:image/png;base64,${xcBaseInfo.villageOpinion}) no-repeat center;\n"+
            "                background-size: 150px 150px;\n"+
            "            }\n"+
            "        </#if>\n"+
            "        <#if xcBaseInfo.townOpinion??>\n"+
            "            #townOpinion {\n"+
            "                background: url(data:image/png;base64,${xcBaseInfo.townOpinion}) no-repeat center;\n"+
            "                background-size: 150px 150px;\n"+
            "            }\n"+
            "        </#if>\n"+
            "        <#if xcBaseInfo.proviceOpinion??>\n"+
            "            #proviceOpinion {\n"+
            "                background: url(data:image/png;base64,${xcBaseInfo.proviceOpinion}) no-repeat center;\n"+
            "                background-size: 150px 150px;\n"+
            "            }\n"+
            "        </#if>\n"+
            "    </style>\n"+
            "</head>\n"+
            "<body>\n"+
            "    <div id=\"all\" style=\"height: 978px;width: 649px;margin: 0 auto\">\n"+
            "        <div>\n"+
            "            <table style=\"width: 100%;height:100%;text-align: center;border-collapse: collapse\" cellspacing=\"0px\" cellpadding=\"0px\">\n"+
            "                <thead>\n"+
            "                    <td width=\"16%\"></td>\n"+
            "                    <td width=\"18%\"></td>\n"+
            "                    <td width=\"16%\"></td>\n"+
            "                    <td width=\"18%\"></td>\n"+
            "                    <td width=\"14%\"></td>\n"+
            "                    <td width=\"18%\"></td>\n"+
            "                </thead>\n"+
            "                <tbody>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"6\" style=\"height: 30px;text-align: center;vertical-align: middle\">\n"+
            "                            <span style=\"font-size: 25px;font-weight: bolder\">\n"+
            "                                西充县城乡居民社会养老保险参保登记表\n"+
            "                            </span>\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"2\" style=\"height: 30px\" align=\"left\">　　档案号：</td>\n"+
            "                        <td>${xcBaseInfo.archivesNumber}</td>\n"+
            "                        <td colspan=\"1\" align=\"right\">登记日期：</td>\n"+
            "                        <td colspan=\"2\">${xcBaseInfo.createTimeStr!\"　　年 　月 　日\"}</td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td style=\"height: 40px;border: 1px solid black\">姓　　名</td>\n"+
            "                        <td style=\"border: 1px solid black\">${xcBaseInfo.name}</td>\n"+
            "                        <td style=\"border: 1px solid black\">性　　别</td>\n"+
            "                        <td style=\"border: 1px solid black\">${xcBaseInfo.sex}</td>\n"+
            "                        <td style=\"border: 1px solid black\">民　　族</td>\n"+
            "                        <td style=\"border: 1px solid black\">${xcBaseInfo.nation}</td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td style=\"height: 40px;border: 1px solid black\">身份证号码</td>\n"+
            "                        <td colspan=\"3\" style=\"border: 1px solid black\">${xcBaseInfo.idcard}</td>\n"+
            "                        <td style=\"border: 1px solid black\">联系电话</td>\n"+
            "                        <td style=\"border: 1px solid black\">${xcBaseInfo.telphone}</td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td style=\"height: 40px;border: 1px solid black\">户籍所在地</td>\n"+
            "                        <td colspan=\"3\" style=\"border: 1px solid black\">${xcBaseInfo.adress}</td>\n"+
            "                        <td style=\"border: 1px solid black\">户籍性质</td>\n"+
            "                        <td style=\"border: 1px solid black;font-size: 11px\">${xcBaseInfo.registerType}</td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td style=\"height: 50px;border: 1px solid black\">缴费标准</td>\n"+
            "                        <td colspan=\"5\" style=\"border: 1px solid black;text-align: left\">\n"+
            "                            <#if xcBaseInfo.grade == '100'>√<#else>□</#if>100元　\n"+
            "                            <#if xcBaseInfo.grade == '200'>√<#else>□</#if>200元　\n"+
            "                            <#if xcBaseInfo.grade == '300'>√<#else>□</#if>300元 　\n"+
            "                            <#if xcBaseInfo.grade == '400'>√<#else>□</#if>400元 　\n"+
            "                            <#if xcBaseInfo.grade == '500'>√<#else>□</#if>500元 　\n"+
            "                            <#if xcBaseInfo.grade == '600'>√<#else>□</#if>600元 　\n"+
            "                            <#if xcBaseInfo.grade == '700'>√<#else>□</#if>700元\n"+
            "                            <br/>\n"+
            "                            <#if xcBaseInfo.grade == '800'>√<#else>□</#if>800元　\n"+
            "                            <#if xcBaseInfo.grade == '900'>√<#else>□</#if>900元　\n"+
            "                            <#if xcBaseInfo.grade == '1000'>√<#else>□</#if>1000元　\n"+
            "                            <#if xcBaseInfo.grade == '1650'>√<#else>□</#if>1650元　\n"+
            "                            <#if xcBaseInfo.grade == '2000'>√<#else>□</#if>2000元　\n"+
            "                            <#if xcBaseInfo.grade == '3000'>√<#else>□</#if>3000元　\n"+
            "                            <#if xcBaseInfo.grade == '0'>√<#else>□</#if>个人不缴费\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td style=\"height: 50px;border: 1px solid black\">特殊参保群体</td>\n"+
            "                        <td colspan=\"5\" style=\"border: 1px solid black;text-align: left\">\n"+
            "                            <#if xcBaseInfo.specialInsurance == '低保'>√<#else>□</#if>低保　　　\n"+
            "                            <#if xcBaseInfo.specialInsurance == '独生子女伤残死亡家庭夫妻'>√<#else>□</#if>独生子女伤残死亡家庭夫妻　　　\n"+
            "                            <#if xcBaseInfo.specialInsurance == '未标注脱贫人员'>√<#else>□</#if>未标注脱贫人员\n"+
            "                            <br/>\n"+
            "                            <#if xcBaseInfo.specialInsurance == '一二级重度残疾'>√<#else>□</#if>一二级重度残疾　　　　\n"+
            "                            <#if xcBaseInfo.specialInsurance == '特困人员'>√<#else>□</#if>特困人员　　　　　\n"+
            "                            <#if xcBaseInfo.specialInsurance??\n"+
            "                                &&xcBaseInfo.specialInsurance!='低保'\n"+
            "                                &&xcBaseInfo.specialInsurance!='独生子女伤残死亡家庭夫妻'\n"+
            "                                &&xcBaseInfo.specialInsurance!='未标注脱贫人员'\n"+
            "                                &&xcBaseInfo.specialInsurance!='一二级重度残疾'\n"+
            "                                &&xcBaseInfo.specialInsurance!='特困人员'>√<#else>□</#if>其他\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td rowspan=\"3\" style=\"border: 1px solid black\">参加其他养<br/>老保险情况</td>\n"+
            "                        <td style=\"height: 40px;border: 1px solid black\">职工社会养老保险</td>\n"+
            "                        <td style=\"border: 1px solid black\"><#if xcBaseInfo.otherInsurance == '职工社会养老保险'>√是 □否<#else>□是 √否</#if></td>\n"+
            "                        <td style=\"border: 1px solid black\">起止时间</td>\n"+
            "                        <td colspan=\"2\" style=\"border: 1px solid black\"><#if xcBaseInfo.otherInsurance == '职工社会养老保险'>${xcBaseInfo.otherInsuranceTime}</#if></td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td style=\"height: 40px;border: 1px solid black\">老农保、中农保</td>\n"+
            "                        <td style=\"border: 1px solid black\"><#if xcBaseInfo.otherInsurance == '老农保' || xcBaseInfo.otherInsurance == '中农保'>√是 □否<#else>□是 √否</#if></td>\n"+
            "                        <td style=\"border: 1px solid black\">起止时间</td>\n"+
            "                        <td colspan=\"2\" style=\"border: 1px solid black\"><#if xcBaseInfo.otherInsurance == '老农保' || xcBaseInfo.otherInsurance == '中农保'>${xcBaseInfo.otherInsuranceTime}</#if></td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td style=\"height: 40px;border: 1px solid black\">其他社会保险</td>\n"+
            "                        <td style=\"border: 1px solid black\"><#if xcBaseInfo.otherInsurance??\n"+
            "                            &&xcBaseInfo.otherInsurance!='职工社会养老保险'\n"+
            "                            &&xcBaseInfo.otherInsurance!='老农保'\n"+
            "                            &&xcBaseInfo.otherInsurance!='中农保'>√是 □否<#else>□是 √否</#if></td>\n"+
            "                        <td style=\"border: 1px solid black\">起止时间</td>\n"+
            "                        <td colspan=\"2\" style=\"border: 1px solid black\"><#if xcBaseInfo.otherInsurance??\n"+
            "                        &&xcBaseInfo.otherInsurance!='职工社会养老保险'\n"+
            "                        &&xcBaseInfo.otherInsurance!='老农保'\n"+
            "                        &&xcBaseInfo.otherInsurance!='中农保'>${xcBaseInfo.otherInsuranceTime}</#if></td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td style=\"height: 40px;border: 1px solid black\">参保缴费账号</td>\n"+
            "                        <td colspan=\"3\" style=\"border: 1px solid black\">${xcBaseInfo.bankAccount}</td>\n"+
            "                        <td style=\"border: 1px solid black\">开户银行</td>\n"+
            "                        <td style=\"border: 1px solid black\">${xcBaseInfo.bank}</td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"6\" style=\"height: 70px;border: 1px solid black\">城乡居民养老保险个人缴费实行<b>税务征收</b>，参保人每年及时按选定的保费标准办税缴费。</td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"top\" style=\"height: 20px;font-size: 15px;\n"+
            "                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            参保人声明：\n"+
            "                        </td>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"top\" style=\"font-size: 15px;\n"+
            "                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            村（社区）委会申报意见：\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"top\" style=\"font-size: 15px;\n"+
            "                            border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            　　<b>本人未参加企业职工和机关事业单位养老保险，自愿参加城乡居民养老保险，以上填写内容正确无误。</b>\n"+
            "                        </td>\n"+
            "                        <td id=\"villageOpinion\" colspan=\"3\" align=\"center\" valign=\"middle\"\n"+
            "                            style=\"height: 180px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            <#if xcBaseInfo.villageOpinion??>\n"+
            "                                <b>情况属实，同意上报。</b>\n"+
            "                            </#if>\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"bottom\" style=\"height: 20px;font-size: 15px;\n"+
            "                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            参保人：${xcBaseInfo.name!\"　　　\"}　　　${xcBaseInfo.createTimeStr!\"　　年 　月 　日\"}\n"+
            "                        </td>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"bottom\" style=\"font-size: 15px;\n"+
            "                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            协办员：${xcBaseInfo.cooperator!\"　　　\"}　　　${xcBaseInfo.cooperateDateStr!\"　　年 　月 　日\"}(签章)\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"top\" style=\"height: 20px;font-size: 15px;\n"+
            "                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            乡（镇）人力资源和社会保障服务中心意见：\n"+
            "                        </td>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"top\" style=\"font-size: 15px;\n"+
            "                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            县城乡居民社会养老保险局复核意见：\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td id=\"townOpinion\" colspan=\"3\" align=\"center\" valign=\"middle\"\n"+
            "                            style=\"height: 180px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            <#if xcBaseInfo.townOpinion??>\n"+
            "                                <b>符合参保条件，同意上报。</b>\n"+
            "                            </#if>\n"+
            "                        </td>\n"+
            "                        <td id=\"proviceOpinion\" colspan=\"3\" align=\"center\" valign=\"middle\"\n"+
            "                            style=\"font-weight: bold;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            <#if xcBaseInfo.proviceOpinion??>\n"+
            "                            </#if>\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"bottom\" style=\"height: 20px;font-size: 15px;\n"+
            "                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            经办人：${xcBaseInfo.handler!\"　　　\"}　　　${xcBaseInfo.handleDateStr!\"　　年 　月 　日\"}(签章)\n"+
            "                        </td>\n"+
            "                        <td colspan=\"3\" align=\"left\" valign=\"bottom\" style=\"font-size: 15px;\n"+
            "                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black\">\n"+
            "                            复核人：${xcBaseInfo.reviewer!\"　　　\"}　　　${xcBaseInfo.reviewDateStr!\"　　年 　月 　日\"}(签章)\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                    <tr>\n"+
            "                        <td colspan=\"6\" align=\"left\" valign=\"top\">\n"+
            "                            　　<b>填表说明：</b>本表原则上由参保人员填写，若本人无法填写，可由亲属或村（社区）委会经办人员代填，但须本人委托签字、签章或留指纹确认。选择性项目，请在\"□\"内打\"√\"。居民身份证、户口簿、特殊参保群体有效证明复印件附后。2012年制度实施时已年满60周岁的，\"缴费标准\"栏选择100元档次。\n"+
            "                        </td>\n"+
            "                    </tr>\n"+
            "                </tbody>\n"+
            "            </table>\n"+
            "        </div>\n"+
            "    </div>\n"+
            "</body>\n"+
            "</html>";
}
