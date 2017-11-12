package com.lu.cms.model;

public class CmsMenu {
    private Integer menuId;

    private Integer pid;

    private String name;

    private String url;

    private String target;

    private Long orders;

    public CmsMenu(Integer menuId, Integer pid, String name, String url, String target, Long orders) {
        this.menuId = menuId;
        this.pid = pid;
        this.name = name;
        this.url = url;
        this.target = target;
        this.orders = orders;
    }

    public CmsMenu() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }
}