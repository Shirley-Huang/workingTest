package com.weChat.wxMessageMass.api;

import java.io.Serializable;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/4
 * @Desciption :
 */
public class MediaMessage implements Serializable {


    private String media;

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
}
