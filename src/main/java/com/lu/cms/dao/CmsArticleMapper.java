package com.lu.cms.dao;

import com.lu.cms.model.CmsArticle;
import java.util.List;

public interface CmsArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(CmsArticle record);

    int insertSelective(CmsArticle record);

    CmsArticle selectByPrimaryKey(Integer articleId);
    
    CmsArticle selectByLastHottest(Integer articleType,Integer articleNum);

    int updateByPrimaryKeySelective(CmsArticle record);

    int updateByPrimaryKeyWithBLOBs(CmsArticle record);

    int updateByPrimaryKey(CmsArticle record);
    
    List<CmsArticle> selectAll();
    
    Integer countArticle();
    
    int countArticleByCategory(String categoryName);
    
    int countArticleByTag(String TagName);
    
    List<CmsArticle> selectByCategoryName(String categoryName);
    
    List<CmsArticle> selectByTagName(String tagName);
    
    List<CmsArticle> selectByCommentStatusTimeDesc(Integer CommentStatus);
    
}