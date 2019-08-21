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
                    <td width="9%"></td>
                    <td width="7%"></td>
                    <td width="18%"></td>
                    <td width="16%"></td>
                    <td width="18%"></td>
                    <td width="14%"></td>
                    <td width="18%"></td>
                </thead>
                <tbody>
                    <tr>
                        <td colspan="7" style="text-align: center;vertical-align: bottom">
                            <span style="font-size: 25px;font-weight: bold">
                                西充县城乡居民社会养老保险终止注销登记表
                            </span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4"></td>
                        <td colspan="1">登记日期：</td>
                        <td colspan="2">&nbsp;&nbsp;&emsp;&emsp;&emsp;年&emsp;&emsp;月&emsp;&emsp;日</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 25px;border: 1px solid black">被终止人姓名</td>
                        <td style="border: 1px solid black">${endowmentInsurance.name}</td>
                        <td style="border: 1px solid black">性&emsp;&emsp;别</td>
                        <td style="border: 1px solid black">
                            <#if endowmentInsurance.gender == 1>
                                男
                            <#elseif endowmentInsurance.gender == 0>
                                女
                            </#if>
                        </td>
                        <td style="border: 1px solid black">出生日期</td>
                        <td style="border: 1px solid black">${endowmentInsurance.nation}</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 25px;border: 1px solid black">身份证号码</td>
                        <td colspan="2" style="border: 1px solid black">${endowmentInsurance.identityNumber}</td>
                        <td style="border: 1px solid black">人员类型</td>
                        <td colspan="2" style="border: 1px solid black">□缴费人员&emsp;□领取人员</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 25px;border: 1px solid black">户籍所在地</td>
                        <td colspan="5" style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td rowspan="5" style="border: 1px solid black">终止<br/>原因</td>
                        <td style="height: 25px;border: 1px solid black">(一)</td>
                        <td colspan="5" style="border: 1px solid black;text-align: left">
                            &nbsp;
                            <#if endowmentInsurance.paymentStandard == '100'>√<#else>□</#if>死亡&emsp;
                            <#if endowmentInsurance.paymentStandard == '200'>√<#else>□</#if>参保其他社会保险&emsp;
                            <#if endowmentInsurance.paymentStandard == '300'>√<#else>□</#if>户籍跨县转出&emsp;&nbsp;
                            <#if endowmentInsurance.paymentStandard == '250'>√<#else>□</#if>出国（境）定居&emsp;&nbsp;
                            <#if endowmentInsurance.paymentStandard == '500'>√<#else>□</#if>其他
                        </td>
                    </tr>
                    <tr>
                        <td rowspan="2" style="border: 1px solid black">(二)</td>
                        <td style="height: 25px;border: 1px solid black">死亡时间</td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black">丧葬形式</td>
                        <td colspan="2" style="border: 1px solid black">□火化&emsp;□土葬</td>
                    </tr>
                    <tr>
                        <td style="height: 25px;border: 1px solid black">停发时间</td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black">追回金额</td>
                        <td colspan="2" style="border: 1px solid black">&nbsp;&nbsp;&emsp;¥：&emsp;&emsp;&emsp;&emsp;元</td>
                    </tr>
                    <tr>
                        <td style="height: 25px;border: 1px solid black">(三)</td>
                        <td style="border: 1px solid black">重复地区及险种</td>
                        <td style="border: 1px solid black"></td>
                        <td style="border: 1px solid black">追回金额</td>
                        <td colspan="2" style="border: 1px solid black">&nbsp;&nbsp;&emsp;¥：&emsp;&emsp;&emsp;&emsp;元</td>
                    </tr>
                    <tr>
                        <td style="height: 25px;border: 1px solid black">(四)</td>
                        <td style="border: 1px solid black">户籍迁往地区</td>
                        <td colspan="4" style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td rowspan="5" colspan="2" style="border: 1px solid black">个人账户结算<br/>（终止结算）</td>
                        <td colspan="5" style="height: 25px;border-top: 1px solid black;border-left: 1px solid black
                                ;border-right: 1px solid black" align="left">
                            ①个人账户余额：___________________元；
                        </td>
                    </tr>
                    <tr>
                        <td colspan="5" style="height: 25px;border-left: 1px solid black;border-right: 1px solid black" align="left">
                            ②一次性抚恤金：______________元，丧葬费：______________元；
                        </td>
                    </tr>
                    <tr>
                        <td colspan="5" style="height: 25px;border-left: 1px solid black;border-right: 1px solid black" align="left">
                            ③应抵扣死亡超期领取待遇______________元（已追回则不抵扣）；
                        </td>
                    </tr>
                    <tr>
                        <td colspan="5" style="height: 25px;border-left: 1px solid black;border-right: 1px solid black
                                ;border-bottom: 1px solid black" align="left">
                            ④应抵扣重复领取其他社会保险待遇______________元（已追回则不抵扣）。
                        </td>
                    </tr>
                    <tr>
                        <td colspan="5" style="height: 25px;border: 1px solid black" align="left">
                            合计发放金额：&nbsp;&nbsp;&emsp;¥：&emsp;&emsp;&emsp;&emsp;元
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 25px;border: 1px solid black">发放账户</td>
                        <td colspan="5" style="border: 1px solid black">□被终止人原账号&emsp;&emsp;□继承人账号：&emsp;&emsp;&emsp;&emsp;。</td>
                    </tr>
                    <tr>
                        <td colspan="7" style="height: 25px;border: 1px solid black">以下为指定受益人或法定继承人（受委托代办人）填写</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 25px;border: 1px solid black">姓&emsp;&emsp;名</td>
                        <td style="border: 1px solid black">${endowmentInsurance.name}</td>
                        <td style="border: 1px solid black">性&emsp;&emsp;别</td>
                        <td style="border: 1px solid black">
                            <#if endowmentInsurance.gender == 1>
                                男
                            <#elseif endowmentInsurance.gender == 0>
                                女
                            </#if>
                        </td>
                        <td style="border: 1px solid black">联系电话</td>
                        <td style="border: 1px solid black">${endowmentInsurance.nation}</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 25px;border: 1px solid black">身份证号码</td>
                        <td colspan="3" style="border: 1px solid black">${endowmentInsurance.name}</td>
                        <td style="border: 1px solid black">与终止人关系</td>
                        <td style="border: 1px solid black">${endowmentInsurance.nation}</td>
                    </tr>
                    <tr>
                        <td colspan="7" style="height: 25px;border: 1px solid black" align="left">
                            &nbsp;&nbsp;声明：以上填写内容准确真实。&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;申请人签字：
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" valign="top" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            乡镇人力资源和社会保障服务中心意见：
                        </td>
                        <td colspan="3" align="left" valign="top" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            县居保局业务股室复核意见：
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="center" valign="top" style="height: 155px;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <strong>情况属实，同意上报。</strong>
                            <#if endowmentInsurance.isVillageSignature == 1>
                                <div style="height: 125px;float: top">
                                    <img id="villageSignature" style="width: 120px;height: 120px;float: top" src="D:/WorkJavaProject/pdftool/src/main/resources/static/image/test.jpg"/>
                                </div>
                            </#if>
                        </td>
                        <td colspan="3" align="center" valign="top" style="font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <strong>符合条件，审核通过。</strong>
                            <#if endowmentInsurance.isVillageSignature == 1>
                                <div style="height: 125px;float: top">
                                    <img id="villageSignature" style="width: 120px;height: 120px;float: top" src="D:/WorkJavaProject/pdftool/src/main/resources/static/image/test.jpg"/>
                                </div>
                            </#if>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" valign="bottom" style="border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            经办人：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;年&emsp;&emsp;&emsp;月&emsp;&emsp;&emsp;日
                        </td>
                        <td colspan="3" align="left" valign="bottom" style="border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            复核人：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;年&emsp;&emsp;&emsp;月&emsp;&emsp;&emsp;日
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" valign="top" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            县居保局基金稽核股意见：
                        </td>
                        <td colspan="3" align="left" valign="top" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            分管领导审批意见：
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="center" valign="top" style="height: 155px;font-weight: bold;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                            <#if endowmentInsurance.isTownSignature == 1>
                                <div style="height: 125px;float: top">
                                    <img id="villageSignature" style="width: 120px;height: 120px;float: top" src="D:/WorkJavaProject/pdftool/src/main/resources/static/image/test.jpg"/>
                                </div>
                            </#if>
                        </td>
                        <td colspan="3" align="center" valign="top" style="font-weight: bold;font-size: 20px;border-left: 1px solid black;border-right: 1px solid black">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4" align="left" valign="bottom" style="border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            稽核人：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;年&emsp;&emsp;&emsp;月&emsp;&emsp;&emsp;日
                        </td>
                        <td colspan="3" align="left" valign="bottom" style="border-bottom: 1px solid black;border-left: 1px solid black;border-right: 1px solid black">
                            领导签章：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;年&emsp;&emsp;&emsp;月&emsp;&emsp;&emsp;日
                        </td>
                    </tr>
                    <tr>
                        <td colspan="7" align="left" valign="top">
                            &nbsp;&nbsp;&emsp;填表说明：1、本表原则上由参保人员或指定受益人或法定继承人填写，也可由亲属或经办人员代填；2、办理该业务需提供相应的证明资料，提供的证件、资料不完整、不真实的不予办理。
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>