/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.test;

import com.lu.cms.model.CmsArticle;
import com.lu.cms.service.CmsArticleService;
import com.lu.cms.service.UserService;
import java.util.List;
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
//        System.out.println("cn.edu.sdut.softlab.test.CmsArticleTest.selectTest()" + cmsArticleService.selectByPrimaryKey(3));
//    }
    
    @Test
    public void selectAllUser(){
//        List<CmsArticle> articles = cmsArticleService.selectAll(2,10);
//        for (CmsArticle article : articles) {
//            System.out.println("cn.edu.sdut.softlab.test.CmsArticleTest.selectAllUser()" + article.toString());
//        }
        System.out.println("count" + cmsArticleService.countArticle());
    }
}
