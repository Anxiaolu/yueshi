package com.lu.cms.dao;

import com.lu.cms.model.CmsArticle;

public interface CmsArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(CmsArticle record);

    int insertSelective(CmsArticle record);

    CmsArticle selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(CmsArticle record);

    int updateByPrimaryKeyWithBLOBs(CmsArticle record);

    int updateByPrimaryKey(CmsArticle record);
}