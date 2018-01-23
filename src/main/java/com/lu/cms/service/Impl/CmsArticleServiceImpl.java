/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.Impl;

import com.github.pagehelper.PageHelper;
import com.lu.cms.dao.CmsArticleMapper;
import com.lu.cms.model.CmsArticle;
import com.lu.cms.service.CmsArticleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class CmsArticleServiceImpl implements CmsArticleService {

    @Autowired
    private CmsArticleMapper cmsArticleDao;
    
    private PageHelper pageHelper;

    @Override
    public int deleteByPrimaryKey(Integer articleId) {
        return cmsArticleDao.deleteByPrimaryKey(articleId);
    }

    @Override
    public int insert(CmsArticle record) {
        return cmsArticleDao.insert(record);
    }

    @Override
    public int insertSelective(CmsArticle record) {
        return cmsArticleDao.insertSelective(record);
    }

    @Override
    public CmsArticle selectByPrimaryKey(Integer articleId) {
        return cmsArticleDao.selectByPrimaryKey(articleId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsArticle record) {
        return cmsArticleDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(CmsArticle record) {
        return cmsArticleDao.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(CmsArticle record) {
        return cmsArticleDao.updateByPrimaryKey(record);
    }

    @Override
    public List<CmsArticle> selectAll(int pageNum, int pageSize) {
        pageHelper.startPage(pageNum, pageSize);
        return cmsArticleDao.selectAll();
    }

    @Override
    public int countArticle(String categoryName,String TagName){
        if(!(categoryName == null ||  categoryName.isEmpty()))
        {
            return cmsArticleDao.countArticleByCategory(categoryName);
        }
        if (!(TagName == null || TagName.isEmpty())) {
            return  cmsArticleDao.countArticleByTag(TagName);
        }
        return cmsArticleDao.countArticle();
    }

    @Override
    public List<CmsArticle> selectByCategoryName(int pageNum, int pageSize,String categoryName) {
        pageHelper.startPage(pageNum, pageSize);
        return cmsArticleDao.selectByCategoryName(categoryName);
    }

    @Override
    public List<CmsArticle> selectByCommentStatusTimeDesc(Integer CommentStatus) {
        pageHelper.startPage(0, 5);
        return cmsArticleDao.selectByCommentStatusTimeDesc(CommentStatus);
    }

    @Override
    public CmsArticle selectByLastHottest(Integer articleType, Integer articleNum) {
        return cmsArticleDao.selectByLastHottest(articleType, articleNum);
    }

    @Override
    public List<CmsArticle> selectByTagName(int pageNum, int pageSize,String tagName) {
        pageHelper.startPage(pageNum, pageSize);
        return cmsArticleDao.selectByTagName(tagName);
    }
}
