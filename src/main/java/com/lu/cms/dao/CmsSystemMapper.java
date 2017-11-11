package com.lu.cms.dao;

import com.lu.cms.model.CmsSystem;

public interface CmsSystemMapper {
    int deleteByPrimaryKey(Integer systemId);

    int insert(CmsSystem record);

    int insertSelective(CmsSystem record);

    CmsSystem selectByPrimaryKey(Integer systemId);

    int updateByPrimaryKeySelective(CmsSystem record);

    int updateByPrimaryKey(CmsSystem record);
}