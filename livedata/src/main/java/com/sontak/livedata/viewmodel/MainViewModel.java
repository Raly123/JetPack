package com.sontak.livedata.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;

/**
 * @package: com.sontak.livedata.viewmodel
 * @author: Lei
 * @date: 2018-01-01 20:44
 * @version: V1.0.0
 * @description:
 */
public class MainViewModel extends ViewModel {

    public MutableLiveData<String> input = new MutableLiveData<>();

    public MainViewModel() {
        input.setValue("Test input...");
    }

    public void onClick() {
        Random random = new Random();
        input.setValue(random.nextInt(100) + "");
    }


    public void aysncOnClick() {
        Observable.interval(3000, TimeUnit.MILLISECONDS)
                .flatMap(new io.reactivex.functions.Function<Long, ObservableSource<String>>() {
                    @Override
                    public ObservableSource<String> apply(Long aLong) throws Exception {
                        Random random = new Random();
                        return Observable.just(random.nextInt(100) + "");
                    }
                }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String random) throws Exception {
                input.setValue(random);
            }
        });
    }

}
