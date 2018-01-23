/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.CmsArticle;
import com.lu.cms.model.Example.CmsArticleExample;
import com.lu.cms.model.CmsCategory;
import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.CmsCategoryService;
import com.lu.cms.service.CmsMenuService;
import com.lu.cms.service.CmsTopicService;
import java.util.ArrayList;
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
 * 博客首页的控制类
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

    @Autowired
    CmsMenuService cmsMenuService;

    @Autowired
    CmsTopicService cmsTopicService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        List<CmsCategory> categoryList = cmsCategoryService.selectAll(0, 0);
        mv.addObject("articleCategory", categoryList)
            .addObject("articleNum", cmsArticleService.countArticle(null,null))
            .addObject("menuList", cmsMenuService.selectAll())
            .addObject("articleCommentTimeDesc", cmsArticleService.selectByCommentStatusTimeDesc(1))
            .addObject("hottestArticle", cmsArticleService.selectByLastHottest(1, 1))
            .setViewName("front/article/index");
        return mv;
    }

    @RequestMapping(value = "/article_list", method = RequestMethod.POST)
    @ResponseBody
    public Object getArticleList(@RequestParam("pageNum") Integer pageNum,
            @RequestParam("pageSize") Integer pageSize,
            @RequestParam(name = "category", required = false) String category,
            @RequestParam(name = "tag", required = false) String tag) {
        List<CmsArticleExample> articleExamples = new ArrayList<>();
        List<CmsArticle> articles = new ArrayList<>();
        if (!(category == null || category.isEmpty())) {
            articles = cmsArticleService.selectByCategoryName(pageNum, pageSize, category);
        } else if (!(tag == null || tag.isEmpty())) {
            articles = cmsArticleService.selectByTagName(pageNum, pageSize, tag);
        } else {
            articles = cmsArticleService.selectAll(pageNum, pageSize);
        }
        for (int i = 0; i < articles.size(); i++) {
            articleExamples.add(new CmsArticleExample(articles.get(i), cmsTopicService.selectByPrimaryKey(articles.get(i).getTopicId())));
        }
        return articleExamples;
    }
    
    @RequestMapping(value = "/article_num", method = RequestMethod.POST)
    @ResponseBody
    public Object getArticleNum(@RequestParam(name = "category", defaultValue = "") String category,
                                @RequestParam(name = "tag",defaultValue = "") String tag){
        return cmsArticleService.countArticle(category,tag);
    }
    
    @RequestMapping(value = "/article-content/{articleId}",method = RequestMethod.GET)
    public ModelAndView getArticleShow(@PathVariable("articleId") Integer articleId) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("article", cmsArticleService.selectByPrimaryKey(articleId))
            .setViewName("front/article/article-show");
        return mv;
    }

}
