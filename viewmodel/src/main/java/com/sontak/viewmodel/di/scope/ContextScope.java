package com.sontak.viewmodel.di.scope;

import android.support.annotation.NonNull;

import com.sontak.viewmodel.di.DiConfig;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @package:com.zcsy.common.frame.di.scope
 * @author:zcsy
 * @date:2017-11-21 16:48
 * @description:
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ContextScope {
    @NonNull @DiConfig.ContextScope String value() default DiConfig.CONTEXT_SCOPE_APP;
}
