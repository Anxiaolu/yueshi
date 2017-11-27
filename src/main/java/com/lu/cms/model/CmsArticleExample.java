/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.model;

/**
 *
 * @author huanlu
 */
public class CmsArticleExample {
    private Integer articleId;

    private CmsTopic topic;

    private String title;

    private String author;

    private String fromurl;

    private String image;

    private String keywords;

    private String description;

    private Byte type;

    private Byte allowcomments;

    private Byte status;

    private User user;

    private Integer readnumber;

    private Integer top;

    private Integer systemId;

    private Long ctime;

    private Long orders;

    private String content;

    public CmsArticleExample() {
    }
    
    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public CmsTopic getTopic() {
        return topic;
    }

    public void setTopic(CmsTopic topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFromurl() {
        return fromurl;
    }

    public void setFromurl(String fromurl) {
        this.fromurl = fromurl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getAllowcomments() {
        return allowcomments;
    }

    public void setAllowcomments(Byte allowcomments) {
        this.allowcomments = allowcomments;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getReadnumber() {
        return readnumber;
    }

    public void setReadnumber(Integer readnumber) {
        this.readnumber = readnumber;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
