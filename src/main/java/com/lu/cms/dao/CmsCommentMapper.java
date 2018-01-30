package com.lu.cms.dao;

import com.lu.cms.model.CmsComment;
import java.util.List;

public interface CmsCommentMapper {

    int deleteByPrimaryKey(Integer commentId);

    int insert(CmsComment record);

    int insertSelective(CmsComment record);

    CmsComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(CmsComment record);

    int updateByPrimaryKeyWithBLOBs(CmsComment record);

    int updateByPrimaryKey(CmsComment record);

    List<CmsComment> selectByArticleId(Integer articleId);
}
