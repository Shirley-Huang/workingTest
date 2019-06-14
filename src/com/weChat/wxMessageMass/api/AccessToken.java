package com.weChat.wxMessageMass.api;

import java.io.Serializable;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/12/29
 * @Desciption :
 */
public class AccessToken implements Serializable {

    private static final long serialVersionUID = 7402852210232575652L;

    private  String token;
    private  long expireInMilliSecond;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpireInMilliSecond() {
        return expireInMilliSecond;
    }

    public void setExpireInMilliSecond(long expireInMilliSecond) {
        this.expireInMilliSecond = expireInMilliSecond;
    }
}
