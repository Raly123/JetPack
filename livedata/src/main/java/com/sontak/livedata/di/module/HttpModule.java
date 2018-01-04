package com.sontak.livedata.di.module;

import com.sontak.livedata.data.network.NewsApi;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @package: com.sontak.livedata.di.module
 * @author: Lei
 * @date: 2018-01-01 22:44
 * @version: V1.0.0
 * @description:
 */
@Module
public class HttpModule {

    public static final String BASE_URL = "http://api.tianapi.com";

    @Provides
    public OkHttpClient privideOkHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(5 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(5 * 1000, TimeUnit.MILLISECONDS)
                .build();
    }

    @Provides
    public Retrofit provideRetrofit(OkHttpClient okHttpClient) {

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    public NewsApi provideNewsApi(Retrofit retrofit) {
        return retrofit.create(NewsApi.class);
    }
}
