/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsTag;

/**
 *
 * @author huanlu
 */
public interface CmsTagService {

    int deleteByPrimaryKey(Integer tagId);

    int insert(CmsTag record);

    int insertSelective(CmsTag record);

    CmsTag selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(CmsTag record);

    int updateByPrimaryKey(CmsTag record);
}
