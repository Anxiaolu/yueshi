/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.test;

import cn.edu.sdut.softlab.model.Movie;
import cn.edu.sdut.softlab.repository.MovieRepository;
import cn.edu.sdut.softlab.service.MovieService;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author huanlu
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath*:spring-*.xml"})
//public class searchTest {
//    
//    @Autowired
//    MovieRepository movieRepository;
//    
//    @Test
//    public void testsearch(){
//        for (Movie movie : movieRepository.findAll()) {
//            System.out.println(movie.toString());
//        }
//    }
//}
