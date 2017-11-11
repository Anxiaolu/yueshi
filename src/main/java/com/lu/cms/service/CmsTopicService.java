/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsTopic;

/**
 *
 * @author huanlu
 */
public interface CmsTopicService {

    int deleteByPrimaryKey(Integer topicId);

    int insert(CmsTopic record);

    int insertSelective(CmsTopic record);

    CmsTopic selectByPrimaryKey(Integer topicId);

    int updateByPrimaryKeySelective(CmsTopic record);

    int updateByPrimaryKey(CmsTopic record);
}
