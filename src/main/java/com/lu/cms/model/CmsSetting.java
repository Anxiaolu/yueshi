package com.lu.cms.model;

public class CmsSetting {
    private Integer settingId;

    private String settingKey;

    private String settingValue;

    public CmsSetting(Integer settingId, String settingKey, String settingValue) {
        this.settingId = settingId;
        this.settingKey = settingKey;
        this.settingValue = settingValue;
    }

    public CmsSetting() {
        super();
    }

    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    public String getSettingKey() {
        return settingKey;
    }

    public void setSettingKey(String settingKey) {
        this.settingKey = settingKey == null ? null : settingKey.trim();
    }

    public String getSettingValue() {
        return settingValue;
    }

    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue == null ? null : settingValue.trim();
    }
}