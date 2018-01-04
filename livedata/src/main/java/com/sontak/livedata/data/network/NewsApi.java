package com.sontak.livedata.data.network;

import com.sontak.livedata.model.InfoBean;

import retrofit2.http.GET;
import rx.Observable;

/**
 * @package: com.sontak.livedata.data.network
 * @author: Lei
 * @date: 2018-01-01 23:20
 * @version: V1.0.0
 * @description:
 */
public interface NewsApi {
    /**
     * 获取信息
     *
     * @return
     */
    @GET("/startup/?key=7fed97d2186ea83c78d3e4fd0b58ab56&num=30")
    Observable<InfoBean> getNewsInfo();
}
