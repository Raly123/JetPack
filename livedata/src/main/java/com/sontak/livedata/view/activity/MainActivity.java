package com.sontak.livedata.view.activity;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.sontak.livedata.BasicApp;
import com.sontak.livedata.R;
import com.sontak.livedata.database.NewsBean;
import com.sontak.livedata.di.component.DaggerActivityComponent;
import com.sontak.livedata.view.viewholer.NewsViewHolder;
import com.sontak.livedata.viewmodel.ProfileViewModel;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Inject
    ProfileViewModel mViewModel;

    @BindView(R.id.recycler_view)
    EasyRecyclerView mRecyclerView;

    private RecyclerArrayAdapter<NewsBean> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder()
                .appComponent(BasicApp.getComponent())
                .build()
                .inject(this);
        ButterKnife.bind(this);

        mViewModel.loadNewsInfo().observe(this, new Observer<List<NewsBean>>() {
            @Override
            public void onChanged(@Nullable List<NewsBean> newsBeans) {
                mAdapter.clear();
                mAdapter.addAll(newsBeans);
            }
        });

        if (mAdapter == null) {
            mAdapter = new RecyclerArrayAdapter<NewsBean>(this) {
                @Override
                public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
                    return new NewsViewHolder(parent);
                }
            };
        }
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }
}
