package com.lu.cms.dao;

import com.lu.cms.model.CmsTag;
import java.util.List;

public interface CmsTagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(CmsTag record);

    int insertSelective(CmsTag record);

    CmsTag selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(CmsTag record);

    int updateByPrimaryKey(CmsTag record);
    
    List<CmsTag> selectAll();
}