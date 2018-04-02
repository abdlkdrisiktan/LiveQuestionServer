package com.mobiversite.live.question.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Video")
public class Video {

    @Id
    private String id;
    private String url;
    private String status;
    private int videoLength;
    private int tempValue;

    public int getTempValue() {
        return tempValue;
    }

    public void setTempValue(int tempValue) {
        this.tempValue = tempValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }

    public Video() {
    }

    public Video(String id, String url, String status, int videoLength, int tempValue) {
        this.id = id;
        this.url = url;
        this.status = status;
        this.videoLength = videoLength;
        this.tempValue = tempValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
