/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.service;

import com.lu.cms.model.CmsSetting;

/**
 *
 * @author huanlu
 */
public interface CmsSettingService {

    int deleteByPrimaryKey(Integer settingId);

    int insert(CmsSetting record);

    int insertSelective(CmsSetting record);

    CmsSetting selectByPrimaryKey(Integer settingId);

    int updateByPrimaryKeySelective(CmsSetting record);

    int updateByPrimaryKey(CmsSetting record);
}
