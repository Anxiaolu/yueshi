/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.test;

import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author huanlu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-mvc.xml", "classpath*:spring/spring-mybatis.xml" })
@WebAppConfiguration
public class CmsArticleTest {
    
    @Autowired
    protected WebApplicationContext ctx;
    
    @Autowired
    CmsArticleService cmsArticleService;
    
    @Autowired
    UserService userService;
    
//    @Test
//    public void articleInsertTest() {
//        CmsArticle cmsArticle = new CmsArticle();
//        cmsArticle.setArticleId(104);
//        cmsArticle.setTitle("1111111");
//        cmsArticle.setType(new Byte("1"));
//        cmsArticle.setAllowcomments(new Byte("1"));
//        cmsArticle.setStatus(new Byte("1"));
//        cmsArticle.setUserId(1);
//        cmsArticle.setReadnumber(1);
//        cmsArticle.setTop(0);
//        cmsArticle.setCtime(Long.valueOf("1489845594355"));
//        cmsArticle.setOrders(Long.valueOf("1489845594355"));
//        cmsArticleService.insert(cmsArticle);
//    }
//    
//    @Test
//    public void selectTest(){
//        System.out.println("cn.edu.sdut.softlab.test.CmsArticleTest.selectTest()" + cmsArticleService.selectByPrimaryKey(1));
//    }
    
//    @Test
//    public void selectAllUser(){
//        for (User user : userService.selectAllUser()) {
//            System.out.println("cn.edu.sdut.softlab.test.CmsArticleTest.selectAllUser()" + user.toString());
//        }
//    }
}
