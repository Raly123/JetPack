package com.sontak.livedata.di.component;

import android.content.Context;

import com.sontak.livedata.database.InfoDao;
import com.sontak.livedata.di.module.AppModule;
import com.sontak.livedata.di.module.HttpModule;
import com.sontak.livedata.di.module.InfoModule;
import com.sontak.livedata.network.NewsApi;

import javax.inject.Named;

import dagger.Component;

/**
 * @package: com.sontak.livedata.di.component
 * @author: Lei
 * @date: 2018-01-01 22:43
 * @version: V1.0.0
 * @description:
 */
@Component(modules = {
        AppModule.class,
        HttpModule.class,
        InfoModule.class})
public interface AppComponent {

    @Named("AppContext")
    Context context();

    @Named("InfoDao")
    InfoDao infoDao();

    NewsApi newsApi();
}
