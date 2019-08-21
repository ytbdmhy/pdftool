<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>pdfTool</title>
    <style>
        body,td,th {
            font-family: simsun;
            /*font-family: Verdana, Arial, Helvetica, sans-serif;*/
            font-size: 14px;
            /*color: #1d1007;*/
            /*line-height:24px*/
        }
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
                        <td colspan="6" style="text-align: center;vertical-align: bottom">
                            <span style="font-size: 25px;font-weight: bold">
                                西充县城乡居民社会养老保险补缴申请表
                            </span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" style="height: 40px"></td>
                        <td colspan="1">登记日期：</td>
                        <td colspan="2">&nbsp;&nbsp;&emsp;&emsp;&emsp;年&emsp;&emsp;月&emsp;&emsp;日</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">姓&emsp;&emsp;名</td>
                        <td style="border: 1px solid black">${endowmentInsurance.name}</td>
                        <td style="border: 1px solid black">性&emsp;&emsp;别</td>
                        <td style="border: 1px solid black">
                            <#if endowmentInsurance.gender == 1>
                                男
                            <#elseif endowmentInsurance.gender == 0>
                                女
                            </#if>
                        </td>
                        <td style="border: 1px solid black">民&emsp;&emsp;族</td>
                        <td style="border: 1px solid black">${endowmentInsurance.nation}</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">身份证号码</td>
                        <td colspan="2" style="border: 1px solid black">${endowmentInsurance.identityNumber}</td>
                        <td style="border: 1px solid black">联系电话</td>
                        <td colspan="2" style="border: 1px solid black">${endowmentInsurance.phone}</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">户籍所在地</td>
                        <td colspan="5" style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td rowspan="3" style="border: 1px solid black">补缴保费</td>
                        <td style="height: 40px;border: 1px solid black">补缴类型</td>
                        <td style="border: 1px solid black">补缴年限</td>
                        <td style="border: 1px solid black">补缴标准</td>
                        <td style="border: 1px solid black">补缴金额</td>
                        <td style="border: 1px solid black">合计</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">一次性补缴</td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">中断补缴</td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">银行账号</td>
                        <td colspan="2" style="border: 1px solid black">${endowmentInsurance.identityNumber}</td>
                        <td style="border: 1px solid black">所属银行</td>
                        <td colspan="2" style="border: 1px solid black">${endowmentInsurance.phone}</td>
                    </tr>
                    <tr>
                        <td colspan="6" style="height: 60px;border-top: 1px solid black;border-left: 1px solid black
                                ;border-right: 1px solid black;font-size: 15px" align="left">
                            &nbsp;&nbsp;&emsp;声明：以上填写内容正确无误，保证在规定时间将应补缴保费存入城乡居民养老保险参保约定的账户，由银行代缴。
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" style="height: 40px;border-left: 1px solid black;border-bottom: 1px solid black"></td>
                        <td colspan="2" style="border-bottom: 1px solid black">参保人签字：</td>
                        <td style="border-bottom: 1px solid black;border-right: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="top" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            乡镇人力资源和社会保障服务中心意见：
                        </td>
                        <td colspan="3" align="left" valign="top" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            县居保局业务股室复核意见：
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="top" style="font-weight: bold;border-left: 1px solid black;border-right: 1px solid black">
                        </td>
                        <td colspan="3" align="center" valign="top" style="height: 185px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            &nbsp;
                            <#if endowmentInsurance.isVillageSignature == 1>
                                <div style="height: 155px;float: top">
                                    <img id="villageSignature" style="width: 150px;height: 150px;float: top" src="D:/WorkJavaProject/pdftool/src/main/resources/static/image/test.jpg"/>
                                </div>
                            </#if>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="bottom" style="border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            经办人：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;年&emsp;&emsp;&emsp;月&emsp;&emsp;&emsp;日
                        </td>
                        <td colspan="3" align="left" valign="bottom" style="border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            复核人：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;年&emsp;&emsp;&emsp;月&emsp;&emsp;&emsp;日
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="top" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            县居保局基金稽核股意见：
                        </td>
                        <td colspan="3" align="left" valign="top" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            分管领导意见：
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="center" valign="top" style="height: 185px;font-weight: bold;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            &nbsp;
                            <#if endowmentInsurance.isTownSignature == 1>
                                <div style="height: 155px;float: top">
                                    <img id="villageSignature" style="width: 150px;height: 150px;float: top" src="D:/WorkJavaProject/pdftool/src/main/resources/static/image/test.jpg"/>
                                </div>
                            </#if>
                        </td>
                        <td colspan="3" align="center" valign="top" style="font-weight: bold;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="left" valign="bottom" style="border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            稽核人：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;年&emsp;&emsp;&emsp;月&emsp;&emsp;&emsp;日
                        </td>
                        <td colspan="3" align="left" valign="bottom" style="border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            领导签字：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;年&emsp;&emsp;&emsp;月&emsp;&emsp;&emsp;日
                        </td>
                    </tr>
                    <tr>
                        <td colspan="6" align="left" valign="top">
                            &nbsp;&nbsp;&emsp;填表说明：本表原则上由参保人员填写，若本人无法填写，可由（村）居委会经办人员代填，但须本人签字、签章或留指纹确认。
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>