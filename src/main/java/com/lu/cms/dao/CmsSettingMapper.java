package com.lu.cms.dao;

import com.lu.cms.model.CmsSetting;

public interface CmsSettingMapper {
    int deleteByPrimaryKey(Integer settingId);

    int insert(CmsSetting record);

    int insertSelective(CmsSetting record);

    CmsSetting selectByPrimaryKey(Integer settingId);

    int updateByPrimaryKeySelective(CmsSetting record);

    int updateByPrimaryKey(CmsSetting record);
}