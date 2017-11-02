/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.controller;

import cn.edu.sdut.softlab.model.Movie;
import cn.edu.sdut.softlab.repository.MovieRepository;
import cn.edu.sdut.softlab.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "movie")
public class MovieController {
    
    final static Logger logger = LoggerFactory.getLogger(MovieController.class);
    
    @Autowired
    MovieRepository movieRepository;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String toindex() {
        return "index";
    }
    
//    @RequestMapping(value = "/show",method = RequestMethod.GET)
//    public String showmovie() {
//        return "show";
//    }
    
    @RequestMapping(value = "seemovie/{id}",method = RequestMethod.GET)
    public String showmovie(@PathVariable("id")Integer id,ModelMap modelMap){
        Movie movie  = movieRepository.findOne(id);
        logger.info(movie.toString());
        modelMap.addAttribute("movie",movie);
        return "show";
    }
    
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ResponseBody
    public Object search(@RequestParam("title")String title) {
        return movieRepository.findByTitle(title).get(0);
    }
    
    @RequestMapping(value = "/getmovie",method = RequestMethod.POST)
    @ResponseBody
    public Object getLikeMovieName(@RequestParam(name = "title") String search_title){
        String str = new String("'%" + search_title + "%'");
        return movieRepository.findByLikeName(str);
    }
    
    @RequestMapping(value = "/addmovie",method = RequestMethod.GET)
    public String addMovie(){
        return "addvideo";
    }
    
    @RequestMapping(value = "/addmovie",method = RequestMethod.POST)
    public void addMovie(@ModelAttribute("movie")Movie movie){
        logger.info(movie.toString());
        movieRepository.saveAndFlush(movie);
    }
    
}
