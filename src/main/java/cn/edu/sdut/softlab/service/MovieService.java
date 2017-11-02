/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.service;

import cn.edu.sdut.softlab.model.Movie;
import cn.edu.sdut.softlab.repository.MovieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    
    public List<Movie> findAll(){
        return movieRepository.findAll();
    }

    public void save(Movie movie) {
        movieRepository.save(movie);
    }
    
    public void updateMovie(Integer id,String title,String url){
        movieRepository.updateName(title,url,id);
    }
    
    /**
     * 模糊查找电影名字
     * @return 
     */
//    public List<Movie> findMovieByLikeTile(String likeTitle){
//        return movieRepository.findByLikeNameLimit(likeTitle);
//    }
}
