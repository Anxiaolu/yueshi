package com.lu.cms.dao;

import com.lu.cms.model.CmsPage;

public interface CmsPageMapper {
    int deleteByPrimaryKey(Integer pageId);

    int insert(CmsPage record);

    int insertSelective(CmsPage record);

    CmsPage selectByPrimaryKey(Integer pageId);

    int updateByPrimaryKeySelective(CmsPage record);

    int updateByPrimaryKeyWithBLOBs(CmsPage record);

    int updateByPrimaryKey(CmsPage record);
}