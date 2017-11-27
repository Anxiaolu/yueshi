/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.Impl;

import com.lu.cms.dao.CmsMenuMapper;
import com.lu.cms.model.CmsMenu;
import com.lu.cms.service.CmsMenuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class CmsMenuServiceImpl implements CmsMenuService{

    @Autowired
    CmsMenuMapper cmsMenuMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer menuId) {
        return cmsMenuMapper.deleteByPrimaryKey(menuId);
    }

    @Override
    public int insert(CmsMenu record) {
        return cmsMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsMenu record) {
        return cmsMenuMapper.insertSelective(record);
    }

    @Override
    public CmsMenu selectByPrimaryKey(Integer menuId) {
        return cmsMenuMapper.selectByPrimaryKey(menuId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsMenu record) {
        return cmsMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsMenu record) {
        return updateByPrimaryKey(record);
    }

    @Override
    public List<CmsMenu> selectAll() {
        return cmsMenuMapper.selectAll();
    }
    
}
