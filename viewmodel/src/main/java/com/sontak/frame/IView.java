package com.sontak.frame;

import android.support.annotation.Nullable;

import com.sontak.frame.binding.ViewModelBindingConfig;

/**
 * @package: com.sontak.frame
 * @author: zcsy
 * @date: 2018-01-01 20:41
 * @version: V1.3.0
 * @description:
 */
public interface IView {

    @Nullable
    ViewModelBindingConfig getViewModelBindingConfig();

    void removeViewModel();

}
