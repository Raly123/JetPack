package com.sontak.viewmodel.view.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sontak.viewmodel.di.scope.ContentView;

import dagger.android.support.AndroidSupportInjection;

/**
 * @package: com.sontak.livedata.view.base
 * @author: Lei
 * @date: 2018-01-01 22:39
 * @version: V1.0.0
 * @description:
 */
public class BaseFragment extends Fragment {

    private View mRootView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        preBindView(savedInstanceState);
        ContentView contentView = getClass().getAnnotation(ContentView.class);
        if (contentView != null) {
            mRootView = LayoutInflater.from(getContext())
                    .inflate(contentView.value(), container, false);
        }
        onBindView(savedInstanceState);
        return mRootView;
    }

    protected void preBindView(Bundle savedInstanceState) {

    }

    protected void onBindView(Bundle savedInstanceState) {

    }
}
