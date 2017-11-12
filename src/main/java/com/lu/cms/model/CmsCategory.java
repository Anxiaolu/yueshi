package com.lu.cms.model;

public class CmsCategory {
    private Integer categoryId;

    private Integer pid;

    private Byte level;

    private String name;

    private String description;

    private String icon;

    private Byte type;

    private String alias;

    private Integer systemId;

    private Long ctime;

    private Long orders;

    public CmsCategory(Integer categoryId, Integer pid, Byte level, String name, String description, String icon, Byte type, String alias, Integer systemId, Long ctime, Long orders) {
        this.categoryId = categoryId;
        this.pid = pid;
        this.level = level;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.type = type;
        this.alias = alias;
        this.systemId = systemId;
        this.ctime = ctime;
        this.orders = orders;
    }

    public CmsCategory() {
        super();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
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
}