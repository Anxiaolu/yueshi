/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.CmsCategory;
import com.lu.cms.service.CmsArticleCategoryService;
import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.CmsCategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "/article")
public class CmsArticleController {
    
    @Autowired
    CmsArticleService cmsArticleService;
    
    @Autowired
    CmsCategoryService cmsCategoryService;
    
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        List<CmsCategory> categoryList = cmsCategoryService.selectAll(0, 0);
        mv.addObject("articleCategory", categoryList);
        mv.addObject("articleNum", cmsArticleService.countArticle())
                .setViewName("article/index");
        return mv;
    }
    
    @RequestMapping(value = "/article_list",method = RequestMethod.POST)
    @ResponseBody
    public Object getArticleList(@RequestParam("pageNum")Integer pageNum,
                                @RequestParam("pageSize")Integer pageSize,
                                @RequestParam("category")String category){
        if (category.isEmpty()) {
            return cmsArticleService.selectAll(pageNum, pageSize);
        }
        else{
            return cmsArticleService.selectByCategoryName(pageNum,pageSize,category);
        }
    }
    
    @RequestMapping(value = "/count")
    @ResponseBody
    public Integer countArticle(){
        return cmsArticleService.countArticle();
    }
}
