/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.CmsArticle;
import com.lu.cms.model.CmsCategory;
import com.lu.cms.service.CmsArticleCategoryService;
import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.CmsCategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "/category")
public class CmsCategoryController {
    
    @Autowired
    CmsArticleCategoryService cmsArticleCategoryService;
    
    @Autowired
    CmsArticleService cmsArticleService;
    
    @Autowired
    CmsCategoryService cmsCategoryService;
    
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List<CmsCategory> getCategorys(){
        return cmsCategoryService.selectAll(0, 0);
    }
    
    @RequestMapping(value = "/articleList/{categoryId}",method = RequestMethod.POST)
    @ResponseBody
    public List<CmsArticle> selectArticleByCategory(@PathVariable("categoryId")String categoryId,
                                            String categoryName){
        return null;
    }
}
