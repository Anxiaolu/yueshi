/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.model;

/**
 * 用于前台数据展示的样例类
 *
 * @author huanlu
 */
public class CmsArticleExample {
    
    private CmsArticle cmsArticle;

    private CmsTopic cmsTopic;

    public CmsArticleExample() {
    }
    
    public CmsArticleExample(CmsArticle cmsArticle, CmsTopic cmsTopic) {
        this.cmsArticle = cmsArticle;
        this.cmsTopic = cmsTopic;
    }

    public CmsArticle getCmsArticle() {
        return cmsArticle;
    }

    public void setCmsArticle(CmsArticle cmsArticle) {
        this.cmsArticle = cmsArticle;
    }
    
    public CmsTopic getCmsTopic() {
        return cmsTopic;
    }

    public void setCmsTopic(CmsTopic cmsTopic) {
        this.cmsTopic = cmsTopic;
    }

    @Override
    public String toString() {
        return "CmsArticleExample{" + "cmsArticle=" + cmsArticle + ", cmsTopic=" + cmsTopic + '}';
    }
    
}
