/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsComment;

/**
 *
 * @author huanlu
 */
public interface CmsCommentService {

    int deleteByPrimaryKey(Integer commentId);

    int insert(CmsComment record);

    int insertSelective(CmsComment record);

    CmsComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(CmsComment record);

    int updateByPrimaryKeyWithBLOBs(CmsComment record);

    int updateByPrimaryKey(CmsComment record);
}
