package com.sontak.livedata.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * @package: com.sontak.livedata.data.database
 * @author: Lei
 * @date: 2018-01-01 22:33
 * @version: V1.0.0
 * @description:
 */
@Database(entities = {NewsBean.class}, version = 1)
public abstract class InfoDatabase extends RoomDatabase {

    private static final Object sLock = new Object();

    private static InfoDatabase INSTANCE;

    public abstract InfoDao infoDao();


    public static InfoDatabase getInstance(Context context) {
        synchronized (sLock) {
            if (INSTANCE == null) {
                synchronized (sLock) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            InfoDatabase.class, "newsbean")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
