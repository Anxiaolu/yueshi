/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.CmsComment;
import com.lu.cms.service.CmsCommentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "/comment")
public class CmsCommentController {
    
    @Autowired
    CmsCommentService cmsCommentService;
    
    @RequestMapping(value = "comment-list",method = RequestMethod.GET)
    @ResponseBody
    public Object putComment(@RequestParam(name = "article")Integer articleId){
        List<CmsComment> commentList = cmsCommentService.selectByArticleId(articleId);
        return commentList;
    }
    
    @RequestMapping(value = "create",method = RequestMethod.POST)
    public void createComment(){
        
    }
}
