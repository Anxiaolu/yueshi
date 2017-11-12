package com.lu.cms.model;

public class CmsSystem {
    private Integer systemId;

    private String name;

    private String code;

    private String description;

    private Long ctime;

    private Long orders;

    public CmsSystem(Integer systemId, String name, String code, String description, Long ctime, Long orders) {
        this.systemId = systemId;
        this.name = name;
        this.code = code;
        this.description = description;
        this.ctime = ctime;
        this.orders = orders;
    }

    public CmsSystem() {
        super();
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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