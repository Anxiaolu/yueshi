/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.Impl;

import com.github.pagehelper.PageHelper;
import com.lu.cms.dao.CmsArticleCategoryMapper;
import com.lu.cms.model.CmsArticleCategory;
import com.lu.cms.service.CmsArticleCategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class CmsArticleCategoryServiceImpl implements CmsArticleCategoryService{
    
    @Autowired
    private CmsArticleCategoryMapper cmsArticleCategoryMapper;
    
    private PageHelper pageHelper;

    @Override
    public int deleteByPrimaryKey(Integer articleCategoryId) {
        return cmsArticleCategoryMapper.deleteByPrimaryKey(articleCategoryId);
    }

    @Override
    public int insert(CmsArticleCategory record) {
        return cmsArticleCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(CmsArticleCategory record) {
        return cmsArticleCategoryMapper.insertSelective(record);
    }

    @Override
    public CmsArticleCategory selectByPrimaryKey(Integer articleCategoryId) {
        return cmsArticleCategoryMapper.selectByPrimaryKey(articleCategoryId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsArticleCategory record) {
        return  cmsArticleCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmsArticleCategory record) {
        return cmsArticleCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<CmsArticleCategory> selectAll(int pageNum, int pageSize) {
        pageHelper.startPage(pageNum,pageSize);
        return cmsArticleCategoryMapper.selectAll();
    }

    @Override
    public List<CmsArticleCategory> selectByCategory(Integer categoryId) {
        return cmsArticleCategoryMapper.selectByCategory(categoryId);
    }
    
}
