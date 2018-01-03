package com.sontak.livedata;

import android.app.Application;

import com.sontak.livedata.di.component.AppComponent;
import com.sontak.livedata.di.component.DaggerAppComponent;
import com.sontak.livedata.di.module.AppModule;

/**
 * @package: com.sontak.livedata
 * @author: Lei
 * @date: 2018-01-01 22:10
 * @version: V1.0.0
 * @description:
 */
public class BasicApp extends Application {


    private static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getComponent() {
        return mAppComponent;
    }
}
