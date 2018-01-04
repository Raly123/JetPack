package com.sontak.livedata.di.module;

import android.content.Context;

import com.sontak.livedata.data.database.InfoDao;
import com.sontak.livedata.data.database.InfoDao_Impl;
import com.sontak.livedata.data.database.InfoDatabase;
import com.sontak.livedata.di.DiConfig;
import com.sontak.livedata.di.scope.ContextScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @package: com.sontak.livedata.di.module
 * @author: Lei
 * @date: 2018-01-01 22:18
 * @version: V1.0.0
 * @description:
 */
@Module
public class InfoModule {

    @Named("InfoDao")
    @Provides
    InfoDao provideInfoDao(@ContextScope(DiConfig.CONTEXT_SCOPE_APP) Context context) {
        return new InfoDao_Impl(InfoDatabase.getInstance(context));
    }
}
