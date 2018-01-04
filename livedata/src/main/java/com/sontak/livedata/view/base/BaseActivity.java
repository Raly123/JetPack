package com.sontak.livedata.view.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.sontak.livedata.di.scope.ContentView;

import dagger.android.AndroidInjection;

/**
 * @package: com.sontak.livedata.view.base
 * @author: Lei
 * @date: 2018-01-01 21:12
 * @version: V1.0.0
 * @description:
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        preBindView(savedInstanceState);
        ContentView contentView = getClass().getAnnotation(ContentView.class);
        if (contentView != null) {
            View view = LayoutInflater.from(this).inflate(contentView.value(), null);
            setContentView(view);
        }
        onBindView(savedInstanceState);
    }

    /**
     * setContentView之前执行
     *
     * @param savedInstanceState
     */
    protected void preBindView(Bundle savedInstanceState) {

    }

    /**
     * setContentView之后执行
     *
     * @param savedInstanceState
     */
    protected void onBindView(Bundle savedInstanceState) {

    }
}
