/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.CmsComment;
import com.lu.cms.service.CmsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "/comment")
public class CmsCommentController {
    
//    @Autowired
//    CmsCommentService cmsCommentService;
//    
//    @RequestMapping(value = "putcomment",method = RequestMethod.POST)
//    public void putComment(){
//        cmsCommentService.insert(new CmsComment());
//    }
    
}
