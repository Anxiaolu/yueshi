/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.service.CmsArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "/article")
public class CmsArticleController {
    
    @Autowired
    CmsArticleService cmsArticleService;
    
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "article/index";
    }
    
    @RequestMapping(value = "/article_list",method = RequestMethod.POST)
    @ResponseBody
    public Object getArticleList(){
        //return cmsArticleService.selectAll();
        return null;
    }
    
    @RequestMapping(value = "/count")
    public Integer countArticle(){
        return cmsArticleService.countArticle();
    }
}
