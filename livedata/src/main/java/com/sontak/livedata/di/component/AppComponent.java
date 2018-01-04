package com.sontak.livedata.di.component;

import android.app.Application;
import android.content.Context;

import com.sontak.livedata.BasicApp;
import com.sontak.livedata.data.database.InfoDao;
import com.sontak.livedata.data.network.NewsApi;
import com.sontak.livedata.di.DiConfig;
import com.sontak.livedata.di.module.AppModule;
import com.sontak.livedata.di.module.BuilderActivityModule;
import com.sontak.livedata.di.module.BuilderFragmentModule;
import com.sontak.livedata.di.module.HttpModule;
import com.sontak.livedata.di.module.InfoModule;
import com.sontak.livedata.di.scope.ContextScope;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @package: com.sontak.livedata.di.component
 * @author: Lei
 * @date: 2018-01-01 22:43
 * @version: V1.0.0
 * @description:
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        BuilderActivityModule.class,
        BuilderFragmentModule.class,
        AppModule.class,
        HttpModule.class,
        InfoModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(BasicApp application);

    @ContextScope(DiConfig.CONTEXT_SCOPE_APP)
    Context context();

    @Named("InfoDao")
    InfoDao infoDao();

    NewsApi newsApi();
}
