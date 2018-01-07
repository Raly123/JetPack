package com.sontak.livedata.view.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sontak.livedata.R;
import com.sontak.livedata.databinding.ActivityMainBinding;
import com.sontak.livedata.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mViewModel;

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mBinding.setViewModel(mViewModel);
    }
}
