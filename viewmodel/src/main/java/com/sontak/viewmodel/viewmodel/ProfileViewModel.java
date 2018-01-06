package com.sontak.viewmodel.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.sontak.viewmodel.data.database.NewsBean;
import com.sontak.viewmodel.data.repository.InfoRepository;

import java.util.List;

import javax.inject.Inject;

/**
 * @package: com.sontak.livedata.viewmodel
 * @author: Lei
 * @date: 2018-01-01 22:26
 * @version: V1.0.0
 * @description:
 */
public class ProfileViewModel extends ViewModel {

    private InfoRepository mRepository;

    @Inject
    public ProfileViewModel(InfoRepository repository) {
        this.mRepository = repository;
    }

    public LiveData<List<NewsBean>> loadNewsInfo() {
        return mRepository.loadNewsInfo();
    }
}
