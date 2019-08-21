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
        <#if xcBaseInfo.townOpinion??>
            #townOpinion {
                background: url(data:image/png;base64,${xcBaseInfo.townOpinion}) no-repeat center;
                background-size: 150px 150px;
            }
        </#if>
        <#if xcBaseInfo.proviceReviewOpinion??>
            #proviceReviewOpinion {
                background: url(data:image/png;base64,${xcBaseInfo.proviceReviewOpinion}) no-repeat center;
                background-size: 150px 150px;
            }
        </#if>
        <#if xcBaseInfo.proviceAuditOpinion??>
            #proviceAuditOpinion {
                background: url(data:image/png;base64,${xcBaseInfo.proviceAuditOpinion}) no-repeat center;
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
                    <td width="14%"></td>
                    <td width="10%"></td>
                    <td width="10%"></td>
                    <td width="16%"></td>
                    <td width="19%"></td>
                    <td width="15%"></td>
                </thead>
                <tbody>
                    <tr>
                        <td colspan="7" style="height: 30px;text-align: center;vertical-align: middle">
                            <span style="font-size: 25px;font-weight: bolder">
                                西充县城乡居民社会养老保险信息变更登记表
                            </span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" style="height: 30px"></td>
                        <td colspan="3" align="center">登记日期：　${xcBaseInfo.createTimeStr!"　　年 　月 　日"}</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">姓　　名</td>
                        <td style="border: 1px solid black">${xcBaseInfo.name}</td>
                        <td style="border: 1px solid black">性　别</td>
                        <td style="border: 1px solid black">${xcBaseInfo.sex}</td>
                        <td style="border: 1px solid black">身份证号码</td>
                        <td colspan="2" style="border: 1px solid black">${xcBaseInfo.idcard}</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">户籍所在地</td>
                        <td colspan="3" style="border: 1px solid black">${xcBaseInfo.adress}</td>
                        <td style="border: 1px solid black">联系电话</td>
                        <td colspan="2" style="border: 1px solid black">${xcBaseInfo.telphone}</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black"><b>变更事项</b></td>
                        <td colspan="3" style="border: 1px solid black"><b>变更前</b></td>
                        <td colspan="2" style="border: 1px solid black"><b>变更后</b></td>
                        <td style="border: 1px solid black"><b>备注</b></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">姓　　名</td>
                        <td colspan="3" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">身份证号码</td>
                        <td colspan="3" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">户籍地址</td>
                        <td colspan="3" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">银行账号</td>
                        <td colspan="3" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">缴费档次</td>
                        <td colspan="3" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">特殊参保群体</td>
                        <td colspan="3" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">其　　他</td>
                        <td colspan="3" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" style="height: 40px;font-size: 16px;border-left: 1px solid black;
                            border-top: 1px solid black;border-bottom: 1px solid black">声明：以上填写内容真实无误。</td>
                        <td colspan="3" align="center" style="font-size: 16px;border-right: 1px solid black;
                            border-top: 1px solid black;border-bottom: 1px solid black">申请人签字：${xcBaseInfo.name!"　　　"}</td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" valign="top" style="height: 20px;font-size: 15px;
                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            乡镇人力资源和社会保障服务中心意见：
                        </td>
                        <td colspan="3" align="left" valign="top" style="font-size: 15px;
                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            县居保局业务股室复核意见：
                        </td>
                    </tr>
                    <tr>
                        <td id="townOpinion" colspan="4" align="center" valign="middle"
                            style="height: 180px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <#if xcBaseInfo.proviceReviewOpinion??>
                                <b>情况属实，同意上报</b>
                            </#if>
                        </td>
                        <td id="proviceReviewOpinion" colspan="3" align="center" valign="middle"
                            style="height: 180px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <#if xcBaseInfo.proviceReviewOpinion??>
                                <b>同意变更，复核通过</b>
                            </#if>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" valign="bottom" style="height: 20px;font-size: 15px;
                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            经办人：${xcBaseInfo.handler!"　　　"}　　　${xcBaseInfo.handleDateStr!"　　年 　月 　日"}
                        </td>
                        <td colspan="3" align="left" valign="bottom" style="font-size: 15px;
                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            复核人：${xcBaseInfo.reviewer!"　　　"}　　　${xcBaseInfo.reviewDateStr!"　　年 　月 　日"}
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" valign="top" style="height: 20px;font-size: 15px;
                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            乡（镇）人力资源和社会保障服务中心意见：
                        </td>
                        <td colspan="3" align="left" valign="top" style="font-size: 15px;
                            border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            县城乡居民社会养老保险局复核意见：
                        </td>
                    </tr>
                    <tr>
                        <td id="proviceAuditOpinion" colspan="4" align="center" valign="middle"
                            style="height: 180px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <#if xcBaseInfo.proviceAuditOpinion??>
                            </#if>
                        </td>
                        <td id="proviceOpinion" colspan="3" align="center" valign="middle"
                            style="font-weight: bold;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <#if xcBaseInfo.proviceOpinion??>
                            </#if>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" valign="bottom" style="height: 20px;font-size: 15px;
                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            稽核人：${xcBaseInfo.cooperator!"　　　"}　　　${xcBaseInfo.cooperateDateStr!"　　年 　月 　日"}
                        </td>
                        <td colspan="3" align="left" valign="bottom" style="font-size: 15px;
                            border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            审批人：${xcBaseInfo.reviewer!"　　　"}　　　${xcBaseInfo.reviewDateStr!"　　年 　月 　日"}
                        </td>
                    </tr>
                    <tr>
                        <td colspan="7" align="left" valign="top">
                            　　<b>填表说明：</b>1、本表由参保人员或代办人填写申报，并提供真实有效的身份证件；2、发生信息变更的参保人员需携带相关证件及相关证明办理变更手续，证件或证明材料不完整、不真实的不予办理；3、姓名、身份证号码、性别等个人信息发生变化的，在本表第一栏应填写变更前的相应信息。
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>