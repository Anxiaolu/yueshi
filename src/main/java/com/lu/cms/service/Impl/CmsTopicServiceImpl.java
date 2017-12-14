/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.Impl;

import com.lu.cms.dao.CmsTopicMapper;
import com.lu.cms.model.CmsTopic;
import com.lu.cms.service.CmsTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class CmsTopicServiceImpl implements CmsTopicService{

    @Autowired
    CmsTopicMapper cmsTopicMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer topicId) {
        return cmsTopicMapper.deleteByPrimaryKey(topicId);
    }

    @Override
    public int insert(CmsTopic record) {
        return cmsTopicMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsTopic record) {
        return cmsTopicMapper.insertSelective(record);
    }

    @Override
    public CmsTopic selectByPrimaryKey(Integer topicId) {
        return cmsTopicMapper.selectByPrimaryKey(topicId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsTopic record) {
        return cmsTopicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsTopic record) {
        return cmsTopicMapper.updateByPrimaryKey(record);
    }
    
}
