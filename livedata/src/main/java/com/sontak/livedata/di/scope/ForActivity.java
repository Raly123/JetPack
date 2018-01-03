package com.sontak.livedata.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @package: com.sontak.livedata.di.scope
 * @author: Lei
 * @date: 2018-01-01 23:11
 * @version: V1.0.0
 * @description:
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ForActivity {
}
