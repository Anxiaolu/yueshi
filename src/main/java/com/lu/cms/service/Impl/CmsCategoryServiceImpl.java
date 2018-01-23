/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.Impl;

import com.github.pagehelper.PageHelper;
import com.lu.cms.dao.CmsCategoryMapper;
import com.lu.cms.model.CmsCategory;
import com.lu.cms.service.CmsCategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class CmsCategoryServiceImpl implements CmsCategoryService {

    @Autowired
    private CmsCategoryMapper cmsCategoryMapper;

    private PageHelper pageHelper;

    @Override
    public int deleteByPrimaryKey(Integer categoryId) {
        return cmsCategoryMapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public int insert(CmsCategory record) {
        return cmsCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsCategory record) {
        return cmsCategoryMapper.insertSelective(record);
    }

    @Override
    public CmsCategory selectByPrimaryKey(Integer categoryId) {
        return cmsCategoryMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsCategory record) {
        return cmsCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsCategory record) {
        return cmsCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<CmsCategory> selectAll(int pageNum, int pageSize) {
        if (pageNum != 0 && pageSize != 0) {
            pageHelper.startPage(pageNum, pageSize);
        }
        return cmsCategoryMapper.selectAll();
    }

    @Override
    public CmsCategory selectByCategoryName( String categoryName) {
        return cmsCategoryMapper.selectByCategoryName(categoryName);
    }
}
