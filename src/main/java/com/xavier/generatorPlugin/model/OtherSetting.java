package com.xavier.generatorPlugin.model;

/**
 * @Author: meizhaowei
 * @Create: 2022/7/14 22:06
 * @Description: 其他设置
 */
public class OtherSetting {

    private String author;

    private String ormType; //orm类型，之后需要变成枚举类

    private boolean enableSwagger;

    private boolean enableLombok;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOrmType() {
        return ormType;
    }

    public void setOrmType(String ormType) {
        this.ormType = ormType;
    }

    public boolean isEnableSwagger() {
        return enableSwagger;
    }

    public void setEnableSwagger(boolean enableSwagger) {
        this.enableSwagger = enableSwagger;
    }

    public boolean isEnableLombok() {
        return enableLombok;
    }

    public void setEnableLombok(boolean enableLombok) {
        this.enableLombok = enableLombok;
    }
}
