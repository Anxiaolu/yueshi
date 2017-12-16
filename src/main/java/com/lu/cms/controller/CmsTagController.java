    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.CmsMenuService;
import com.lu.cms.service.CmsTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        System.out.print("ssasdasdasd");
        ModelAndView mv = new ModelAndView();
        mv.addObject("tagList", cmsTagService.selectAll())
          .addObject("menuList", cmsMenuService.selectAll())
          .addObject("articleCommentTimeDesc", cmsArticleService.selectByCommentStatusTimeDesc(1))
            .setViewName("front/nav/tag");
        return mv;
    }
}
