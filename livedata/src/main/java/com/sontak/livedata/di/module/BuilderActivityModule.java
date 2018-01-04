package com.sontak.livedata.di.module;

import com.sontak.livedata.view.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @package: com.sontak.livedata.di.module
 * @author: Lei
 * @date: 2018-01-01 22:13
 * @version: V1.0.0
 * @description:
 */
@Module
public abstract class BuilderActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity mainActivityInjector();


}
