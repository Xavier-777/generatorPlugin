package com.xavier.generatorPlugin.model;

/**
 * @Author: meizhaowei
 * @Create: 2022/7/14 22:08
 * @Description: 设置
 */
public class Setting {

    private DataSource dataSource;

    private OtherSetting otherSetting;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public OtherSetting getOtherSetting() {
        return otherSetting;
    }

    public void setOtherSetting(OtherSetting otherSetting) {
        this.otherSetting = otherSetting;
    }
}
