package com.ytbdmhy.pdftool.dao;

import com.ytbdmhy.pdftool.entity.EndowmentInsurance;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EndowmentInsuranceDao {

    EndowmentInsurance selectByPrimaryKey(Integer id);
}
