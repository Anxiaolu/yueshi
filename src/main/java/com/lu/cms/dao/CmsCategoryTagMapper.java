package com.lu.cms.dao;

import com.lu.cms.model.CmsCategoryTag;

public interface CmsCategoryTagMapper {
    int deleteByPrimaryKey(Integer categoryTagId);

    int insert(CmsCategoryTag record);

    int insertSelective(CmsCategoryTag record);

    CmsCategoryTag selectByPrimaryKey(Integer categoryTagId);

    int updateByPrimaryKeySelective(CmsCategoryTag record);

    int updateByPrimaryKey(CmsCategoryTag record);
}