<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>pdfTool</title>
    <style>
        body,td,th {
            font-family: simsun;
            font-size: 14px;
        }
        <#if xcBaseInfo.villageOpinion??>
            #villageOpinion {
                background: url(data:image/png;base64,${xcBaseInfo.villageOpinion}) no-repeat center;
                background-size: 150px 150px;
            }
        </#if>
        <#if xcBaseInfo.townOpinion??>
            #townOpinion {
                background: url(data:image/png;base64,${xcBaseInfo.townOpinion}) no-repeat center;
                background-size: 150px 150px;
            }
        </#if>
        <#if xcBaseInfo.proviceOpinion??>
            #proviceOpinion {
                background: url(data:image/png;base64,${xcBaseInfo.proviceOpinion}) no-repeat center;
                background-size: 150px 150px;
            }
        </#if>
    </style>
</head>
<body>
    <div id="all" style="height: 978px;width: 649px;margin: 0 auto">
        <div>
            <table style="width: 100%;height:100%;text-align: center;border-collapse: collapse" cellspacing="0px" cellpadding="0px">
                <thead>
                    <td width="16%"></td>
                    <td width="18%"></td>
                    <td width="16%"></td>
                    <td width="18%"></td>
                    <td width="14%"></td>
                    <td width="18%"></td>
                </thead>
                <tbody>
                    <tr>
                        <td colspan="6" style="height: 30px;text-align: center;vertical-align: middle">
                            <span style="font-size: 25px;font-weight: bolder">
                                西充县城乡居民社会养老保险参保登记表
                            </span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 30px" align="left">　　档案号：</td>
                        <td>${xcBaseInfo.archivesNumber}</td>
                        <td colspan="1" align="right">登记日期：</td>
                        <td colspan="2">${xcBaseInfo.createTimeStr!"　　年 　月 　日"}</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">姓　　名</td>
                        <td style="border: 1px solid black">${xcBaseInfo.name}</td>
                        <td style="border: 1px solid black">性　　别</td>
                        <td style="border: 1px solid black">${xcBaseInfo.sex}</td>
                        <td style="border: 1px solid black">民　　族</td>
                        <td style="border: 1px solid black">${xcBaseInfo.nation}</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">身份证号码</td>
                        <td colspan="3" style="border: 1px solid black">${xcBaseInfo.idcard}</td>
                        <td style="border: 1px solid black">联系电话</td>
                        <td style="border: 1px solid black">${xcBaseInfo.telphone}</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">户籍所在地</td>
                        <td colspan="3" style="border: 1px solid black">${xcBaseInfo.adress}</td>
                        <td style="border: 1px solid black">户籍性质</td>
                        <td style="border: 1px solid black;font-size: 11px">${xcBaseInfo.registerType}</td>
                    </tr>
                    <tr>
                        <td style="height: 50px;border: 1px solid black">缴费标准</td>
                        <td colspan="5" style="border: 1px solid black;text-align: left">
                            <#if xcBaseInfo.grade == '100'>√<#else>□</#if>100元　
                            <#if xcBaseInfo.grade == '200'>√<#else>□</#if>200元　
                            <#if xcBaseInfo.grade == '300'>√<#else>□</#if>300元 　
                            <#if xcBaseInfo.grade == '400'>√<#else>□</#if>400元 　
                            <#if xcBaseInfo.grade == '500'>√<#else>□</#if>500元 　
                            <#if xcBaseInfo.grade == '600'>√<#else>□</#if>600元 　
                            <#if xcBaseInfo.grade == '700'>√<#else>□</#if>700元
                            <br/>
                            <#if xcBaseInfo.grade == '800'>√<#else>□</#if>800元　
                            <#if xcBaseInfo.grade == '900'>√<#else>□</#if>900元　
                            <#if xcBaseInfo.grade == '1000'>√<#else>□</#if>1000元　
                            <#if xcBaseInfo.grade == '1650'>√<#else>□</#if>1650元　
                            <#if xcBaseInfo.grade == '2000'>√<#else>□</#if>2000元　
                            <#if xcBaseInfo.grade == '3000'>√<#else>□</#if>3000元　
                            <#if xcBaseInfo.grade == '0'>√<#else>□</#if>个人不缴费
                        </td>
                    </tr>
                    <tr>
                        <td style="height: 50px;border: 1px solid black">特殊参保群体</td>
                        <td colspan="5" style="border: 1px solid black;text-align: left">
                            <#if xcBaseInfo.specialInsurance == '低保'>√<#else>□</#if>低保　　　
                            <#if xcBaseInfo.specialInsurance == '独生子女伤残死亡家庭夫妻'>√<#else>□</#if>独生子女伤残死亡家庭夫妻　　　
                            <#if xcBaseInfo.specialInsurance == '未标注脱贫人员'>√<#else>□</#if>未标注脱贫人员
                            <br/>
                            <#if xcBaseInfo.specialInsurance == '一二级重度残疾'>√<#else>□</#if>一二级重度残疾　　　　
                            <#if xcBaseInfo.specialInsurance == '特困人员'>√<#else>□</#if>特困人员　　　　　
                            <#if xcBaseInfo.specialInsurance??
                                &&xcBaseInfo.specialInsurance!='低保'
                                &&xcBaseInfo.specialInsurance!='独生子女伤残死亡家庭夫妻'
                                &&xcBaseInfo.specialInsurance!='未标注脱贫人员'
                                &&xcBaseInfo.specialInsurance!='一二级重度残疾'
                                &&xcBaseInfo.specialInsurance!='特困人员'>√<#else>□</#if>其他
                        </td>
                    </tr>
                    <tr>
                        <td rowspan="3" style="border: 1px solid black">参加其他养<br/>老保险情况</td>
                        <td style="height: 40px;border: 1px solid black">职工社会养老保险</td>
                        <td style="border: 1px solid black"><#if xcBaseInfo.otherInsurance == '职工社会养老保险'>√是 □否<#else>□是 √否</#if></td>
                        <td style="border: 1px solid black">起止时间</td>
                        <td colspan="2" style="border: 1px solid black"><#if xcBaseInfo.otherInsurance == '职工社会养老保险'>${xcBaseInfo.otherInsuranceTime}</#if></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">老农保、中农保</td>
                        <td style="border: 1px solid black"><#if xcBaseInfo.otherInsurance == '老农保' || xcBaseInfo.otherInsurance == '中农保'>√是 □否<#else>□是 √否</#if></td>
                        <td style="border: 1px solid black">起止时间</td>
                        <td colspan="2" style="border: 1px solid black"><#if xcBaseInfo.otherInsurance == '老农保' || xcBaseInfo.otherInsurance == '中农保'>${xcBaseInfo.otherInsuranceTime}</#if></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">其他社会保险</td>
                        <td style="border: 1px solid black"><#if xcBaseInfo.otherInsurance??
                            &&xcBaseInfo.otherInsurance!='职工社会养老保险'
                            &&xcBaseInfo.otherInsurance!='老农保'
                            &&xcBaseInfo.otherInsurance!='中农保'>√是 □否<#else>□是 √否</#if></td>
                        <td style="border: 1px solid black">起止时间</td>
                        <td colspan="2" style="border: 1px solid black"><#if xcBaseInfo.otherInsurance??
                        &&xcBaseInfo.otherInsurance!='职工社会养老保险'
                        &&xcBaseInfo.otherInsurance!='老农保'
                        &&xcBaseInfo.otherInsurance!='中农保'>${xcBaseInfo.otherInsuranceTime}</#if></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">参保缴费账号</td>
                        <td colspan="3" style="border: 1px solid black">${xcBaseInfo.bankAccount}</td>
                        <td style="border: 1px solid black">开户银行</td>
                        <td style="border: 1px solid black">${xcBaseInfo.bank}</td>
                    </tr>
                    <tr>
                        <td colspan="6" style="height: 70px;border: 1px solid black">城乡居民养老保险个人缴费实行<b>税务征收</b>，参保人每年及时按选定的保费标准办税缴费。</td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="top" style="height: 20px;font-size: 15px;
                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            参保人声明：
                        </td>
                        <td colspan="3" align="left" valign="top" style="font-size: 15px;
                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            村（社区）委会申报意见：
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="top" style="font-size: 15px;
                            border-left: 1px solid black;border-right: 1px solid black">
                            　　<b>本人未参加企业职工和机关事业单位养老保险，自愿参加城乡居民养老保险，以上填写内容正确无误。</b>
                        </td>
                        <td id="villageOpinion" colspan="3" align="center" valign="middle"
                            style="height: 180px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <#if xcBaseInfo.villageOpinion??>
                                <b>情况属实，同意上报。</b>
                            </#if>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="bottom" style="height: 20px;font-size: 15px;
                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            参保人：${xcBaseInfo.name!"　　　"}　　　${xcBaseInfo.createTimeStr!"　　年 　月 　日"}
                        </td>
                        <td colspan="3" align="left" valign="bottom" style="font-size: 15px;
                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            协办员：${xcBaseInfo.cooperator!"　　　"}　　　${xcBaseInfo.cooperateDateStr!"　　年 　月 　日"}(签章)
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="top" style="height: 20px;font-size: 15px;
                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            乡（镇）人力资源和社会保障服务中心意见：
                        </td>
                        <td colspan="3" align="left" valign="top" style="font-size: 15px;
                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            县城乡居民社会养老保险局复核意见：
                        </td>
                    </tr>
                    <tr>
                        <td id="townOpinion" colspan="3" align="center" valign="middle"
                            style="height: 180px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <#if xcBaseInfo.townOpinion??>
                                <b>符合参保条件，同意上报。</b>
                            </#if>
                        </td>
                        <td id="proviceOpinion" colspan="3" align="center" valign="middle"
                            style="font-weight: bold;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <#if xcBaseInfo.proviceOpinion??>
                            </#if>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="bottom" style="height: 20px;font-size: 15px;
                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            经办人：${xcBaseInfo.handler!"　　　"}　　　${xcBaseInfo.handleDateStr!"　　年 　月 　日"}(签章)
                        </td>
                        <td colspan="3" align="left" valign="bottom" style="font-size: 15px;
                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            复核人：${xcBaseInfo.reviewer!"　　　"}　　　${xcBaseInfo.reviewDateStr!"　　年 　月 　日"}(签章)
                        </td>
                    </tr>
                    <tr>
                        <td colspan="6" align="left" valign="top">
                            　　<b>填表说明：</b>本表原则上由参保人员填写，若本人无法填写，可由亲属或村（社区）委会经办人员代填，但须本人委托签字、签章或留指纹确认。选择性项目，请在"□"内打"√"。居民身份证、户口簿、特殊参保群体有效证明复印件附后。2012年制度实施时已年满60周岁的，"缴费标准"栏选择100元档次。
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>