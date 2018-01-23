/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.CmsArticle;
import com.lu.cms.service.CmsArticleCategoryService;
import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.CmsCategoryService;
import com.lu.cms.service.CmsMenuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping(value = "/category")
public class CmsCategoryController {

    @Autowired
    CmsArticleCategoryService cmsArticleCategoryService;

    @Autowired
    CmsArticleService cmsArticleService;

    @Autowired
    CmsCategoryService cmsCategoryService;

    @Autowired
    CmsMenuService cmsMenuService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView init() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("categorys", cmsCategoryService.selectAll(0, 0))
            .addObject("menuList", cmsMenuService.selectAll())
            .addObject("articleNum", cmsArticleService.countArticle(null,null))
            .addObject("articleCommentTimeDesc", cmsArticleService.selectByCommentStatusTimeDesc(1))
            .setViewName("front/nav/article-cate-show");
        return mv;
    }

    @RequestMapping(value = "/articleList/{categoryName}", method = RequestMethod.POST)
    public ModelAndView getArticleByCategory(@RequestParam("pageNum") Integer pageNum,
                                                @RequestParam("pageSize") Integer pageSize,
                                                @PathVariable("categoryName") String categoryName) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("articleList", cmsArticleService.selectByCategoryName(0, 0, categoryName))
           .setViewName("front/article/article-list");
        return mv;
    }
    
    @RequestMapping(value = "/articleList/{categoryName}", method = RequestMethod.GET)
    public ModelAndView getArticleByCategory(@PathVariable("categoryName") String categoryName) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("articleList", cmsArticleService.selectByCategoryName(0, 5, categoryName))
                .addObject("menuList", cmsMenuService.selectAll())
                .addObject("articleNum", cmsArticleService.countArticle(null,null))
                .addObject("articleCommentTimeDesc", cmsArticleService.selectByCommentStatusTimeDesc(1))
                .setViewName("front/article/article-list");
        return mv;
    }

    @RequestMapping(value = "/articleList/{categoryId}", method = RequestMethod.POST)
    @ResponseBody
    public List<CmsArticle> selectArticleByCategory(@PathVariable("categoryId") String categoryId) {
        return null;
    }
    
    
}
