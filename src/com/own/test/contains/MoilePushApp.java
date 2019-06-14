package com.own.test.contains;

public class MoilePushApp {

    private Integer id;
    private String code;
    private String name;
    private String appKey;
    private Integer dailyLimit;
    private String deviceType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public Integer getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(Integer dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return "MoilePushApp{" + "id=" + id + ", code='" + code + '\'' + ", name='" + name + '\'' + ", appKey='" + appKey + '\'' + ", dailyLimit=" + dailyLimit + ", deviceType='" + deviceType + '\'' + '}';
    }
}
