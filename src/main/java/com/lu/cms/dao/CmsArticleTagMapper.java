package com.lu.cms.dao;

import com.lu.cms.model.CmsArticleTag;

public interface CmsArticleTagMapper {
    int deleteByPrimaryKey(Integer articleTagId);

    int insert(CmsArticleTag record);

    int insertSelective(CmsArticleTag record);

    CmsArticleTag selectByPrimaryKey(Integer articleTagId);

    int updateByPrimaryKeySelective(CmsArticleTag record);

    int updateByPrimaryKey(CmsArticleTag record);
}