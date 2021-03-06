/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsArticle;
import java.util.List;

/**
 *
 * @author huanlu
 */
public interface CmsArticleService {

    int deleteByPrimaryKey(Integer articleId);

    int insert(CmsArticle record);

    int insertSelective(CmsArticle record);

    CmsArticle selectByPrimaryKey(Integer articleId);
    
    CmsArticle selectByLastHottest(Integer articleType,Integer articleNum);

    int updateByPrimaryKeySelective(CmsArticle record);

    int updateByPrimaryKeyWithBLOBs(CmsArticle record);

    int updateByPrimaryKey(CmsArticle record);
    
    List<CmsArticle> selectAll(int pageNum,int pageSize);
    
    int countArticle(String categoryName,String TagName);
    
    List<CmsArticle> selectByCategoryName(int pageNum, int pageSize,String categoryName);
    
    List<CmsArticle> selectByCommentStatusTimeDesc(Integer CommentStatus);
    
    List<CmsArticle> selectByTagName(int pageNum, int pageSize,String tagName);
}
