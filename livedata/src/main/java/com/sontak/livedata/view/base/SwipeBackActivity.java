package com.sontak.livedata.view.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sontak.livedata.R;

import cn.bingoogolapple.swipebacklayout.BGASwipeBackHelper;

/**
 * @package: com.sontak.livedata.ui.base
 * @author: Lei
 * @date: 2018-01-01 10:15
 * @version: V1.0.0
 * @description:侧滑基类
 */
public class SwipeBackActivity extends AppCompatActivity implements BGASwipeBackHelper.Delegate {

    protected BGASwipeBackHelper mSwipeBackHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initSwipeBackFinish();
        super.onCreate(savedInstanceState);
    }

    private void initSwipeBackFinish() {
        mSwipeBackHelper = new BGASwipeBackHelper(this, this);
        mSwipeBackHelper.setSwipeBackEnable(true);
        mSwipeBackHelper.setIsOnlyTrackingLeftEdge(true);
        mSwipeBackHelper.setIsWeChatStyle(false);
        mSwipeBackHelper.setShadowResId(R.drawable.bga_sbl_shadow);
        mSwipeBackHelper.setIsNeedShowShadow(true);
        mSwipeBackHelper.setIsShadowAlphaGradient(true);
    }

    /**
     * 是否支持滑动返回。这里在父类中默认返回 true 来支持滑动返回，如果某个界面不想支持滑动返回则重写该方法返回 false 即可
     *
     * @return
     */
    @Override
    public boolean isSupportSwipeBack() {
        return false;
    }

    /**
     * 正在滑动返回
     *
     * @param slideOffset 从 0 到 1
     */
    @Override
    public void onSwipeBackLayoutSlide(float slideOffset) {

    }

    /**
     * 没达到滑动返回的阈值，取消滑动返回动作，回到默认状态
     */
    @Override
    public void onSwipeBackLayoutCancel() {

    }

    /**
     * 滑动返回执行完毕，销毁当前 Activity
     */
    @Override
    public void onSwipeBackLayoutExecuted() {
        mSwipeBackHelper.swipeBackward();
    }
}
