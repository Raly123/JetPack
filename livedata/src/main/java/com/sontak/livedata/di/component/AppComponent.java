package com.sontak.livedata.di.component;

import com.sontak.livedata.di.module.AppModule;
import com.sontak.livedata.di.module.HttpModule;

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
        HttpModule.class})
public interface AppComponent {
}
