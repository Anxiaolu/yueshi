package com.lu.cms.model;

public class CmsArticleCategory {
    private Integer articleCategoryId;

    private Integer articleId;

    private Integer categoryId;

    public CmsArticleCategory(Integer articleCategoryId, Integer articleId, Integer categoryId) {
        this.articleCategoryId = articleCategoryId;
        this.articleId = articleId;
        this.categoryId = categoryId;
    }

    public CmsArticleCategory() {
        super();
    }

    public Integer getArticleCategoryId() {
        return articleCategoryId;
    }

    public void setArticleCategoryId(Integer articleCategoryId) {
        this.articleCategoryId = articleCategoryId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}