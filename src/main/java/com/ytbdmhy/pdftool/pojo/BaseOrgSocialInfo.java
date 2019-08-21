package com.ytbdmhy.pdftool.pojo;

//import com.example.entity.persBusiness.PayRecordEntity;
//import com.example.entity.persBusiness.PreUpshiftPayEntity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BaseOrgSocialInfo {

    private String name;
    private String nation;
    private String idcard;
    private String townName;
    private String villageName;
    private String groupName;
    private String grade;     //缴费档次
    private String bank;
    private String bankAccount;
    private String registerType; //户口性质
    private String personType; //身份类别
    private String telphone; //手机号
    private String adress;
    private String insuranceType; //参保类型
    // 待遇申请
    private Date birthday;
    private String insuredState;// 参保状态
    private String payState; //缴费状态

    private String newBAccount;
    private String newBank;

    //死亡注销 费用
    private String lastGrantMonth; //停发日期
    private String grantState;    //发放状态

    //领取信息
    private BigDecimal privateAccountTotal; //账户余额
    private BigDecimal presentBenchmark;   //当前月领取标准
    private String rantState;       //发放状态

    //缴费信息
//  private List<PayRecordEntity> payRecordEntity;
}
