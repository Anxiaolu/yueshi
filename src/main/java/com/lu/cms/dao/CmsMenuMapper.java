package com.lu.cms.dao;

import com.lu.cms.model.CmsMenu;
import java.util.List;

public interface CmsMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(CmsMenu record);

    int insertSelective(CmsMenu record);

    CmsMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(CmsMenu record);

    int updateByPrimaryKey(CmsMenu record);
    
    List<CmsMenu> selectAll();
}