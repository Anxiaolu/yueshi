package com.lu.cms.dao;

import com.lu.cms.model.CmsArticleCategory;
import java.util.List;

public interface CmsArticleCategoryMapper {
    int deleteByPrimaryKey(Integer articleCategoryId);

    int insert(CmsArticleCategory record);

    int insertSelective(CmsArticleCategory record);

    CmsArticleCategory selectByPrimaryKey(Integer articleCategoryId);

    int updateByPrimaryKeySelective(CmsArticleCategory record);

    int updateByPrimaryKey(CmsArticleCategory record);
    
    List<CmsArticleCategory> selectAll();
    
    List<CmsArticleCategory> selectByCategory(Integer categoryId);
}