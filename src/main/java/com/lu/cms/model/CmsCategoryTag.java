package com.lu.cms.model;

public class CmsCategoryTag {
    private Integer categoryTagId;

    private Integer categoryId;

    private Integer tagId;

    public CmsCategoryTag(Integer categoryTagId, Integer categoryId, Integer tagId) {
        this.categoryTagId = categoryTagId;
        this.categoryId = categoryId;
        this.tagId = tagId;
    }

    public CmsCategoryTag() {
        super();
    }

    public Integer getCategoryTagId() {
        return categoryTagId;
    }

    public void setCategoryTagId(Integer categoryTagId) {
        this.categoryTagId = categoryTagId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}