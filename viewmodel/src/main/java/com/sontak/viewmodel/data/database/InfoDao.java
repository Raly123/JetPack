package com.sontak.viewmodel.data.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * @package: com.sontak.livedata.data.database
 * @author: Lei
 * @date: 2018-01-01 22:19
 * @version: V1.0.0
 * @description:
 */
@Dao
public interface InfoDao {

    @Query("SELECT * FROM newsbean")
    LiveData<List<NewsBean>> getAll();

    @Query("SELECT * FROM newsbean")
    List<NewsBean> getAl();

    @Insert(onConflict = REPLACE)
    void save(NewsBean info);

    @Query("SELECT * FROM newsbean WHERE ctime = :ctime")
    LiveData<NewsBean> load(String ctime);

    @Insert
    void insertAll(List<NewsBean> list);

    @Delete
    void delete(NewsBean list);
}
