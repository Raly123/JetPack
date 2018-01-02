package com.sontak.livedata.database;

import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

/**
 * @package: com.sontak.livedata.database
 * @author: Lei
 * @date: 2018-01-01 22:30
 * @version: V1.0.0
 * @description:
 */
@Entity(primaryKeys = {"ctime", "picUrl"})
public class NewsBean {

    @NonNull
    private String ctime;
    private String title;
    private String description;
    @NonNull
    private String picUrl;
    private String url;

    @NonNull
    public String getCtime() {
        return ctime;
    }

    public void setCtime(@NonNull String ctime) {
        this.ctime = ctime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NonNull
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(@NonNull String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
