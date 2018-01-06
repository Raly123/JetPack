package com.sontak.viewmodel.di.scope;

import android.support.annotation.LayoutRes;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @package: com.sontak.livedata.di.scope
 * @author: Lei
 * @date: 2018-01-01 22:07
 * @version: V1.0.0
 * @description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ContentView {
    @LayoutRes int value() default 0;
}
