/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsPage;

/**
 *
 * @author huanlu
 */
public interface CmsPageService {

    int deleteByPrimaryKey(Integer pageId);

    int insert(CmsPage record);

    int insertSelective(CmsPage record);

    CmsPage selectByPrimaryKey(Integer pageId);

    int updateByPrimaryKeySelective(CmsPage record);

    int updateByPrimaryKeyWithBLOBs(CmsPage record);

    int updateByPrimaryKey(CmsPage record);
}
