/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsCategoryTag;

/**
 *
 * @author huanlu
 */
public interface CmsCategoryTagService {

    int deleteByPrimaryKey(Integer categoryTagId);

    int insert(CmsCategoryTag record);

    int insertSelective(CmsCategoryTag record);

    CmsCategoryTag selectByPrimaryKey(Integer categoryTagId);

    int updateByPrimaryKeySelective(CmsCategoryTag record);

    int updateByPrimaryKey(CmsCategoryTag record);
}
