package com.lu.cms.dao;

import com.lu.cms.model.CmsTag;

public interface CmsTagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(CmsTag record);

    int insertSelective(CmsTag record);

    CmsTag selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(CmsTag record);

    int updateByPrimaryKey(CmsTag record);
}