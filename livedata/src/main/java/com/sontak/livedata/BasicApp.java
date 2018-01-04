package com.sontak.livedata;

import android.app.Activity;
import android.app.Application;

import com.sontak.livedata.di.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * @package: com.sontak.livedata
 * @author: Lei
 * @date: 2018-01-01 22:10
 * @version: V1.0.0
 * @description:
 */
public class BasicApp extends Application implements HasActivityInjector,
        HasSupportFragmentInjector {

    private static Application mAppContext;

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Inject
    DispatchingAndroidInjector<android.support.v4.app.Fragment> dispatchingFragmentInjector;

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }

    @Override
    public AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return dispatchingFragmentInjector;
    }

    public static Application getAppContext() {
        return mAppContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mAppContext = this;
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }
}
