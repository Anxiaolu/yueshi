/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.repository;

import cn.edu.sdut.softlab.model.Movie;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author huanlu
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

    @Query(value = "select * from movie a where a.title like :title", nativeQuery = true)
    List<Movie> findByLikeName(@Param("title") String title);

    List<Movie> findByTitle(String title);
    
    @Modifying
    @Transactional
    @Query("UPDATE Movie movie SET movie.title =:ctitle, movie.movieUrl =:curl WHERE movie.id =:cid")
    void updateName(@Param("ctitle")String title, 
                    @Param("curl")String url, 
                    @Param("cid")Integer id);

}
