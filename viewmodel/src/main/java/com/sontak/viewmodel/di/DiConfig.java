package com.sontak.viewmodel.di;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @package: com.sontak.livedata.di
 * @author: Lei
 * @date: 2018-01-01 22:13
 * @version: V1.0.0
 * @description:
 */
public class DiConfig {

    @Retention(RetentionPolicy.RUNTIME)
    @StringDef(value = {CONTEXT_SCOPE_APP, CONTEXT_SCOPE_ACTIVITY})
    public @interface ContextScope {
    }

    /**
     * 全局Context标签
     */
    public static final String CONTEXT_SCOPE_APP = "application";
    /**
     * Activity Context标签
     */
    public static final String CONTEXT_SCOPE_ACTIVITY = "activity";

    @Retention(RetentionPolicy.RUNTIME)
    @StringDef(value = {CONN_HTTP, CONN_HTTPS})
    public @interface ConnScope {
    }

    /**
     * http链接
     */
    public static final String CONN_HTTP = "http";
    /**
     * https链接
     */
    public static final String CONN_HTTPS = "https";

    @StringDef(value = {TYPE_CLOUD, TYPE_DISK, TYPE_MEMORY})
    public @interface StoreScope {
    }

    public static final String TYPE_DISK = "disk";

    public static final String TYPE_CLOUD = "cloud";

    public static final String TYPE_MEMORY = "memory";
}
