/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.Impl;

import com.lu.cms.dao.CmsTagMapper;
import com.lu.cms.model.CmsTag;
import com.lu.cms.service.CmsTagService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class CmsTagServiceImpl implements CmsTagService{

    @Autowired
    CmsTagMapper cmsTagMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer tagId) {
        return cmsTagMapper.deleteByPrimaryKey(tagId);
    }
    
    @Override
    public int insert(CmsTag record) {
        return cmsTagMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsTag record) {
        return cmsTagMapper.insertSelective(record);
    }

    @Override
    public CmsTag selectByPrimaryKey(Integer tagId) {
        return cmsTagMapper.selectByPrimaryKey(tagId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsTag record) {
        return cmsTagMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsTag record) {
        return cmsTagMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<CmsTag> selectAll() {
        return cmsTagMapper.selectAll();
    }
    
}
