package com.sontak.livedata.repository;

import android.arch.lifecycle.LiveData;

import com.sontak.livedata.database.InfoDao;
import com.sontak.livedata.database.NewsBean;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @package: com.sontak.livedata.repository
 * @author: Lei
 * @date: 2018-01-01 22:28
 * @version: V1.0.0
 * @description:
 */
public class InfoRepository {

    private InfoDao mInfoDao;

    @Inject
    public InfoRepository(@Named("InfoDao") InfoDao infoDao) {
        mInfoDao = infoDao;
    }

    public LiveData<List<NewsBean>> loadNewsInfo() {
        updateInfo();
        return mInfoDao.getAll();
    }

    private void updateInfo() {
    }
}
