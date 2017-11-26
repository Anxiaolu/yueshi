package com.lu.cms.dao;

import com.lu.cms.model.CmsCategory;
import java.util.List;

public interface CmsCategoryMapper {

    int deleteByPrimaryKey(Integer categoryId);

    int insert(CmsCategory record);

    int insertSelective(CmsCategory record);
    
    CmsCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(CmsCategory record);

    int updateByPrimaryKey(CmsCategory record);

    List<CmsCategory> selectAll();

    CmsCategory selectByCategoryName(String categoryName);
}
