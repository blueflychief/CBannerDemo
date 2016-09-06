package com.example.administrator.cbannerdemo.util;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.administrator.cbannerdemo.R;

/**
 * Created by LuoShuiquan on 9/6/2016.
 */
public class ImageLoader {
    public static void loadNormalImage(Context mContext, String url, final int defaultId, final ImageView iv, boolean cache) {
        if (TextUtils.isEmpty(url)) {
            iv.setImageResource(defaultId == -1 ? R.drawable.ic_default_adimage : defaultId);
            return;
        }
        Glide.with(mContext)
                .load(url)
                .asBitmap()
                .diskCacheStrategy(cache ? DiskCacheStrategy.SOURCE : DiskCacheStrategy.NONE)
                .placeholder(defaultId == -1 ? R.drawable.ic_default_adimage : defaultId)
                .error(defaultId == -1 ? R.drawable.ic_default_adimage : defaultId)
                .into(iv);
    }
}
