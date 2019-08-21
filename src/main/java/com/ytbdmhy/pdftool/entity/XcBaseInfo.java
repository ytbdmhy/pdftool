package com.ytbdmhy.pdftool.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class XcBaseInfo implements Serializable {
    private Integer id;

    private String countryName;

    private String townName;

    private String villageName;

    private String groupName;

    private String adress;

    private String registerType;

    private Integer personNum;

    private String idcard;

    private String name;

    private String sex;

    private String nation;

    private Date birthday;

    private String insuranceType;

    private String grade;

    private String archivesNum;

    private String bank;

    private String householdName;

    private String bankAccount;

    private String personType;

    private String retireFlag;

    private String identityType;

    private Date handTime;

    private String handPerson;

    private Date reviewTime;

    private String reviewPerson;

    private Integer isdelete;

    private Integer state;

    private Integer orign;

    private Date createTime;

    private Date updateTime;

    private Integer bakInt;

    private String bakChar;

    private String batchNo;

    private String telphone;

    private String insuredState;

    private Integer isOldRural;

    private String payState;

    private Date insuredDate;

}