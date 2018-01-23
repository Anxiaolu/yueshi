/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.CmsArticle;
import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.CmsMenuService;
import com.lu.cms.service.CmsTagService;
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
@RequestMapping("/articleTag")
public class CmsTagController {
    
    @Autowired
    CmsTagService cmsTagService;
    
    @Autowired
    CmsMenuService cmsMenuService;
    
    @Autowired
    CmsArticleService cmsArticleService;
    
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView getTagList(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("tagList", cmsTagService.selectAll())
          .addObject("menuList", cmsMenuService.selectAll())
          .addObject("articleNum", cmsArticleService.countArticle(null,null))
          .addObject("articleCommentTimeDesc", cmsArticleService.selectByCommentStatusTimeDesc(1))
            .setViewName("front/nav/article-tag-show");
        return mv;
    }
    
    @RequestMapping(value = "/articleList/{tag}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView selectArticleByCategory(@RequestParam(name = "pageNum",defaultValue = "0") Integer pageNum,
                                                @RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize,
                                                @PathVariable("tag") String tag) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("articleList", cmsArticleService.selectByTagName(pageNum, pageSize, tag))
                .addObject("menuList", cmsMenuService.selectAll())
                .addObject("articleNum", cmsArticleService.countArticle(null,null))
                .addObject("articleCommentTimeDesc", cmsArticleService.selectByCommentStatusTimeDesc(1))
                .setViewName("front/article/article-list");
        return mv;
    }
}
