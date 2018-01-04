package com.sontak.livedata.di.module;

import android.app.Application;
import android.content.Context;

import com.sontak.livedata.BasicApp;
import com.sontak.livedata.di.DiConfig;
import com.sontak.livedata.di.scope.ContextScope;

import javax.inject.Named;
import javax.inject.Singleton;

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

    @Provides
    @Singleton
    @ContextScope(DiConfig.CONTEXT_SCOPE_APP)
    Context provideAppContext() {
        return BasicApp.getAppContext();
    }

    @Singleton
    @Provides
    Application provideApplication() {
        return BasicApp.getAppContext();
    }
}
