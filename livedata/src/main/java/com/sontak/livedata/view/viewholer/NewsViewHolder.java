package com.sontak.livedata.view.viewholer;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.sontak.livedata.R;
import com.sontak.livedata.database.NewsBean;

/**
 * @package: com.sontak.livedata.view.viewholer
 * @author: Lei
 * @date: 2018-01-01 22:33
 * @version: V1.0.0
 * @description:
 */
public class NewsViewHolder extends BaseViewHolder<NewsBean> {

    ImageView imageView;
    TextView title;
    TextView content;

    public NewsViewHolder(ViewGroup itemView) {
        super(itemView, R.layout.item_news);
        imageView = $(R.id.imageView);
        title = $(R.id.textView);
        content = $(R.id.textView2);
    }

    @Override
    public void setData(NewsBean newsBean) {
        Glide.with(getContext())
                .load(newsBean.getPicUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .centerCrop()
                .into(imageView);
        title.setText(newsBean.getTitle());
        content.setText(newsBean.getCtime());
    }
}
