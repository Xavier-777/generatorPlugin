package com.xavier.generatorPlugin.model;

/**
 * @Author: meizhaowei
 * @Create: 2022/7/14 22:09
 * @Description: 编写区
 */
public class EditorPath {

    private String database;

    private String table;

    private String preTable;

    private String sufTable;

    private String entity;

    private String mapperXml;

    private String mapperJava;

    private String service;

    private String serviceImpl;

    private String controller;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getPreTable() {
        return preTable;
    }

    public void setPreTable(String preTable) {
        this.preTable = preTable;
    }

    public String getSufTable() {
        return sufTable;
    }

    public void setSufTable(String sufTable) {
        this.sufTable = sufTable;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getMapperXml() {
        return mapperXml;
    }

    public void setMapperXml(String mapperXml) {
        this.mapperXml = mapperXml;
    }

    public String getMapperJava() {
        return mapperJava;
    }

    public void setMapperJava(String mapperJava) {
        this.mapperJava = mapperJava;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceImpl() {
        return serviceImpl;
    }

    public void setServiceImpl(String serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }
}
