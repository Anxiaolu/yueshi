/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsCategory;

/**
 *
 * @author huanlu
 */
public interface CmsCategoryService {

    int deleteByPrimaryKey(Integer categoryId);

    int insert(CmsCategory record);

    int insertSelective(CmsCategory record);

    CmsCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(CmsCategory record);

    int updateByPrimaryKey(CmsCategory record);
}
