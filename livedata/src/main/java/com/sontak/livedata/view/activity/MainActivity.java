package com.sontak.livedata.view.activity;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.sontak.livedata.R;
import com.sontak.livedata.data.database.NewsBean;
import com.sontak.livedata.di.scope.ContentView;
import com.sontak.livedata.view.base.BaseActivity;
import com.sontak.livedata.view.viewholer.NewsViewHolder;
import com.sontak.livedata.viewmodel.ProfileViewModel;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @Inject
    ProfileViewModel mViewModel;

    @BindView(R.id.recycler_view)
    EasyRecyclerView mRecyclerView;

    private RecyclerArrayAdapter<NewsBean> mAdapter;

    @Override
    protected void onBindView(Bundle savedInstanceState) {
        super.onBindView(savedInstanceState);
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
