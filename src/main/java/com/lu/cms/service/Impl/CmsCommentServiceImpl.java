/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service.Impl;

import com.lu.cms.dao.CmsCommentMapper;
import com.lu.cms.model.CmsComment;
import com.lu.cms.service.CmsCommentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class CmsCommentServiceImpl implements CmsCommentService {

    @Autowired
    CmsCommentMapper cmsCommentDao;

    @Override
    public int deleteByPrimaryKey(Integer commentId) {
        return cmsCommentDao.deleteByPrimaryKey(commentId);
    }

    @Override
    public int insert(CmsComment record) {
        return cmsCommentDao.insert(record);
    }

    @Override
    public int insertSelective(CmsComment record) {
        return cmsCommentDao.insertSelective(record);
    }

    @Override
    public CmsComment selectByPrimaryKey(Integer commentId) {
        return cmsCommentDao.selectByPrimaryKey(commentId);
    }

    @Override
    public int updateByPrimaryKeySelective(CmsComment record) {
        return cmsCommentDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(CmsComment record) {
        return cmsCommentDao.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(CmsComment record) {
        return cmsCommentDao.updateByPrimaryKey(record);
    }

    @Override
    public List<CmsComment> selectByArticleId(Integer articleId) {
        return cmsCommentDao.selectByArticleId(articleId);
    }

}
