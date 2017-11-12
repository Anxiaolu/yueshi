/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author huanlu
 */
@Entity
@Table(name = "movie")
public class Movie implements Serializable {

    public static final long serialVersionUID = 1L;

    private Integer id;
    private String title;
    private String movieUrl;
    private String majorActor;
    private String content;

    public Movie() {
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @NotNull
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @NotNull
    @Column(name = "movie_url", nullable = true, insertable = true, updatable = true)
    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String videoUrl) {
        this.movieUrl = videoUrl;
    }

    @Basic
    @Column(name = "major_actor", nullable = true, insertable = true, updatable = true, length = 100)
    public String getMajorActor() {
        return majorActor;
    }

    public void setMajorActor(String majorActor) {
        this.majorActor = majorActor;
    }

    @Basic
    @Column(name = "content", nullable = true, insertable = true, updatable = true)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.movieUrl, other.movieUrl)) {
            return false;
        }
        if (!Objects.equals(this.majorActor, other.majorActor)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", title=" + title + ", movieUrl=" + movieUrl + ", majorActor=" + majorActor + ", content=" + content + '}';
    }

}
