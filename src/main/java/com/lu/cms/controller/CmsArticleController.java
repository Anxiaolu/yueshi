/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.CmsArticle;
import com.lu.cms.model.CmsArticleExample;
import com.lu.cms.model.CmsCategory;
import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.CmsCategoryService;
import com.lu.cms.service.CmsMenuService;
import com.lu.cms.service.CmsTopicService;
import java.util.ArrayList;
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
    
    @Autowired
    CmsMenuService cmsMenuService;
    
    @Autowired
    CmsTopicService cmsTopicService;
    
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(){
        System.out.println("com.lu.cms.controller.CmsArticleController.index()" + "111111111");
        ModelAndView mv = new ModelAndView();
        List<CmsCategory> categoryList = cmsCategoryService.selectAll(0, 0);
        mv.addObject("articleCategory", categoryList)
          .addObject("articleNum", cmsArticleService.countArticle())
          .addObject("menuList", cmsMenuService.selectAll())
          .addObject("articleCommentTimeDesc", cmsArticleService.selectByCommentStatusTimeDesc(1))
                .setViewName("article/index");
        return mv;
    }
    
    @RequestMapping(value = "/index_article_list",method = RequestMethod.POST)
    @ResponseBody
    public Object getArticleList(@RequestParam("pageNum")Integer pageNum,
                                @RequestParam("pageSize")Integer pageSize){
        return cmsArticleService.selectAll(pageNum, pageSize);
    }
    
    @RequestMapping(value = "/article_list",method = RequestMethod.POST)
    @ResponseBody
    public Object getArticleList(@RequestParam("pageNum")Integer pageNum,
                                @RequestParam("pageSize")Integer pageSize,
                                @RequestParam("category")String category){
        List<CmsArticleExample> articleExamples = new ArrayList<>();
        if (category.isEmpty()) {
            List<CmsArticle> articles = cmsArticleService.selectAll(pageNum, pageSize);
            for (int i = 0; i < articles.size(); i++) {
                //System.out.println(new CmsArticleExample(articles.get(i),cmsTopicService.selectByPrimaryKey(articles.get(i).getTopicId())));
                articleExamples.add(new CmsArticleExample(articles.get(i),cmsTopicService.selectByPrimaryKey(articles.get(i).getTopicId())));
//                articleExamples.get(i).setTopic(cmsTopicService.selectByPrimaryKey(articles.get(i).getTopicId()));
            }   
            return articleExamples;
        }
        else{
            List<CmsArticle> articles = cmsArticleService.selectByCategoryName(pageNum,pageSize,category);
            for (int i = 0; i < articles.size(); i++) {
                //articleExamples.get(i).setTopic(cmsTopicService.selectByPrimaryKey(articles.get(i).getTopicId()));
            }
            return articleExamples;
        }
    }
    
    @RequestMapping(value = "/count")
    @ResponseBody
    public Integer countArticle(){
        return cmsArticleService.countArticle();
    }
}
