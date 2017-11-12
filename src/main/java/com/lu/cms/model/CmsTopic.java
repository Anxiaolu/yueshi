package com.lu.cms.model;

public class CmsTopic {
    private Integer topicId;

    private String title;

    private String description;

    private String url;

    private Long ctime;

    public CmsTopic(Integer topicId, String title, String description, String url, Long ctime) {
        this.topicId = topicId;
        this.title = title;
        this.description = description;
        this.url = url;
        this.ctime = ctime;
    }

    public CmsTopic() {
        super();
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
}