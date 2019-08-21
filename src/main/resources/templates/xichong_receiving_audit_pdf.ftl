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
                    <td width="16%"></td>
                    <td width="12%"></td>
                    <td width="4%"></td>
                    <td width="8%"></td>
                    <td width="8%"></td>
                    <td width="4%"></td>
                    <td width="12%"></td>
                    <td width="20%"></td>
                </thead>
                <tbody>
                    <tr>
                        <td colspan="9" style="text-align: center;vertical-align: bottom">
                            <span style="font-size: 25px;font-weight: bold">
                                西充县城乡居民社会养老保险参保登记表
                            </span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3"></td>
                        <td colspan="3">填表日期：</td>
                        <td colspan="3">&nbsp;&nbsp;&emsp;&emsp;&emsp;年&emsp;&emsp;月&emsp;&emsp;日</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">参保人姓名</td>
                        <td style="border: 1px solid black">${endowmentInsurance.name}</td>
                        <td style="border: 1px solid black">性&emsp;别</td>
                        <td colspan="2" style="border: 1px solid black">
                            <#if endowmentInsurance.gender == 1>
                                男
                            <#elseif endowmentInsurance.gender == 0>
                                女
                            </#if>
                        </td>
                        <td colspan="2" style="border: 1px solid black">年&emsp;龄</td>
                        <td style="border: 1px solid black">${endowmentInsurance.nation}</td>
                        <td rowspan="5" style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">身份证号码</td>
                        <td colspan="2" style="border: 1px solid black">${endowmentInsurance.identityNumber}</td>
                        <td colspan="2" style="border: 1px solid black">缴费年限</td>
                        <td colspan="3" style="border: 1px solid black">&nbsp;&nbsp;&emsp;&emsp;年</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">领取账号</td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black">联系电话</td>
                        <td colspan="3" style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">户籍地地址</td>
                        <td colspan="7" style="border: 1px solid black;text-align: left">

                        </td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black">领取方式</td>
                        <td colspan="7" style="border: 1px solid black">
                            □直接领取基础养老金&emsp;&emsp;&emsp;&emsp;□参保到龄领取养老金
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 15px;border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black;text-align: left">本人声明：</td>
                        <td colspan="5" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black;text-align: left">村(社区)委会意见：</td>
                        <td colspan="2" style="border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black;text-align: left">乡(镇)人设服务中心意见</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 80px;border-left: 1px solid black;border-right: 1px solid black;text-align: left;vertical-align: top">本人所申报内容真实无误，未参加或领取职工社保等其他养老待遇，若重复领取，将依法退回。</td>
                        <td colspan="5" style="border-left: 1px solid black;border-right: 1px solid black;font-size: 18px">情况属实！</td>
                        <td colspan="2" style="border-left: 1px solid black;border-right: 1px solid black;font-size: 18px">符合条件，同意上报！</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 20px;border-left: 1px solid black;border-right: 1px solid black;text-align: left;vertical-align: top">参保人：</td>
                        <td colspan="5" style="border-left: 1px solid black;border-right: 1px solid black;text-align: left">村（社区）协办员：</td>
                        <td colspan="2" style="border-left: 1px solid black;border-right: 1px solid black;text-align: left">乡镇经办人员：</td>
                    </tr>
                    <tr>
                        <td colspan="2" style="height: 20px;border-left: 1px solid black;border-right: 1px solid black;border-bottom: 1px solid black;text-align: right"> 年 月 日</td>
                        <td colspan="5" style="border-left: 1px solid black;border-right: 1px solid black;border-bottom: 1px solid black;text-align: right"> 年 月 日</td>
                        <td colspan="2" style="border-left: 1px solid black;border-right: 1px solid black;border-bottom: 1px solid black;text-align: right"> 年 月 日</td>
                    </tr>
                    <tr>
                        <td rowspan="2" style="border: 1px solid black">个人账户</td>
                        <td style="height: 40px;border: 1px solid black">个人缴费</td>
                        <td colspan="2" style="border: 1px solid black">集体补助</td>
                        <td colspan="2" style="border: 1px solid black">财政补贴</td>
                        <td colspan="2" style="border: 1px solid black">利息</td>
                        <td style="border: 1px solid black">个人账户积累额</td>
                    </tr>
                    <tr>
                        <td style="height: 40px;border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td colspan="2" style="border: 1px solid black"></td>
                        <td style="border: 1px solid black"></td>
                    </tr>
                    <tr>
                        <td rowspan="9" style="border: 1px solid black">
                            县<br/>&nbsp;<br/>居<br/>&nbsp;<br/>保<br/>&nbsp;<br/>局<br/>&nbsp;<br/>意<br/>&nbsp;<br/>见
                        </td>
                        <td colspan="8" style="height: 15px;border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black;text-align: left">县居保局退管股意见：</td>
                    </tr>
                    <tr>
                        <td colspan="8" style="height: 100px;border-left: 1px solid black;border-right: 1px solid black;text-align: left;font-size: 18px;vertical-align: top">
                            &nbsp;&nbsp;&emsp;经审核，该同志符合待遇领取条件，同意从      年   月开始发放养老金。标准为      元/月。其中基础养老金     元/月，个人账户养老金   元/月。
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" style="height: 15px;border-bottom: 1px solid black;border-left: 1px solid black;text-align: left">审核人：</td>
                        <td colspan="5" style="border-bottom: 1px solid black;border-right: 1px solid black;text-align: right"> 年 月 日&nbsp;&nbsp;&emsp;&emsp;</td>
                    </tr>
                    <tr>
                        <td colspan="8" style="height: 15px;border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black;text-align: left">县居保局基金稽核股意见：</td>
                    </tr>
                    <tr>
                        <td colspan="8" style="height: 100px;border-left: 1px solid black;border-right: 1px solid black;text-align: left;font-size: 16px"></td>
                    </tr>
                    <tr>
                        <td colspan="3" style="height: 15px;border-bottom: 1px solid black;border-left: 1px solid black;text-align: left">稽核人：</td>
                        <td colspan="5" style="border-bottom: 1px solid black;border-right: 1px solid black;text-align: right"> 年 月 日&nbsp;&nbsp;&emsp;&emsp;</td>
                    </tr>
                    <tr>
                        <td colspan="8" style="height: 15px;border-top: 1px solid black;border-left: 1px solid black;border-right: 1px solid black;text-align: left">分管领导意见：</td>
                    </tr>
                    <tr>
                        <td colspan="8" style="height: 100px;border-left: 1px solid black;border-right: 1px solid black;text-align: left;font-size: 16px"></td>
                    </tr>
                    <tr>
                        <td colspan="3" style="height: 15px;border-bottom: 1px solid black;border-left: 1px solid black;text-align: left">领导签章：</td>
                        <td colspan="5" style="border-bottom: 1px solid black;border-right: 1px solid black;text-align: right"> 年 月 日&nbsp;&nbsp;&emsp;&emsp;</td>
                    </tr>
                    <tr>
                        <td colspan="9" style="text-align: left">
                            注：1、本表原则上由参保人本人认真填写，也可由亲属或经办人员代填，但本人必须签字、签章或留指纹。<br/>&nbsp;&nbsp;&emsp;2、本表必须规范填写，签章齐全，并附相关附件资料。
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>