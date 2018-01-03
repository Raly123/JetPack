package com.sontak.livedata.di.component;

import com.sontak.livedata.di.scope.ForActivity;
import com.sontak.livedata.view.activity.MainActivity;

import dagger.Component;

/**
 * @package: com.sontak.livedata.di.component
 * @author: Lei
 * @date: 2018-01-01 22:14
 * @version: V1.0.0
 * @description:
 */
@ForActivity
@Component(dependencies = AppComponent.class)
public interface ActivityComponent {

    void inject(MainActivity activity);
}
