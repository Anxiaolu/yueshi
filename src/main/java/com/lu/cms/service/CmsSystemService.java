/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsSystem;

/**
 *
 * @author huanlu
 */
public interface CmsSystemService {

    int deleteByPrimaryKey(Integer systemId);

    int insert(CmsSystem record);

    int insertSelective(CmsSystem record);

    CmsSystem selectByPrimaryKey(Integer systemId);

    int updateByPrimaryKeySelective(CmsSystem record);

    int updateByPrimaryKey(CmsSystem record);
}
