package com.sontak.livedata.di.module;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @package: com.sontak.livedata.di.module
 * @author: Lei
 * @date: 2018-01-01 22:43
 * @version: V1.0.0
 * @description:
 */
@Module
public class AppModule {

    private final Context mAppContext;

    public AppModule(Context context) {
        this.mAppContext = context;
    }

    @Named("AppContext")
    @Provides
    public Context provideContext() {
        return mAppContext;
    }
}
