package com.sontak.livedata.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sontak.livedata.R;
import com.sontak.livedata.viewmodel.ProfileViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ProfileViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
