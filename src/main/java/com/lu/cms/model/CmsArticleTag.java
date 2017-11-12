package com.lu.cms.model;

public class CmsArticleTag {
    private Integer articleTagId;

    private Integer articleId;

    private Integer tagId;

    public CmsArticleTag(Integer articleTagId, Integer articleId, Integer tagId) {
        this.articleTagId = articleTagId;
        this.articleId = articleId;
        this.tagId = tagId;
    }

    public CmsArticleTag() {
        super();
    }

    public Integer getArticleTagId() {
        return articleTagId;
    }

    public void setArticleTagId(Integer articleTagId) {
        this.articleTagId = articleTagId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}