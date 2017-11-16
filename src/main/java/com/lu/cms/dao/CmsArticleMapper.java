package com.lu.cms.dao;

import com.lu.cms.model.CmsArticle;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(CmsArticle record);

    int insertSelective(CmsArticle record);

    CmsArticle selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(CmsArticle record);

    int updateByPrimaryKeyWithBLOBs(CmsArticle record);

    int updateByPrimaryKey(CmsArticle record);
    
    List<CmsArticle> selectAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    
    int countArticle();
}