package com.sontak.frame.binding;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;

/**
 * @package: com.sontak.frame.binding
 * @author: zcsy
 * @date: 2018-01-01 20:42
 * @version: V1.3.0
 * @description:
 */
public class ViewModelBindingConfig {

    @LayoutRes
    private final int mLayoutResource;
    private final int mViewModelVariableName;
    @NonNull
    private final Context mContext;

    public ViewModelBindingConfig(@NonNull Context context, @LayoutRes int layoutResource, int viewModelVariableName) {
        mContext = context;
        mLayoutResource = layoutResource;
        mViewModelVariableName = viewModelVariableName;
    }

    @LayoutRes
    public int getLayoutResource() {
        return mLayoutResource;
    }

    public int getViewModelVariableName() {
        return mViewModelVariableName;
    }

    @NonNull
    public Context getContext() {
        return mContext;
    }
}
