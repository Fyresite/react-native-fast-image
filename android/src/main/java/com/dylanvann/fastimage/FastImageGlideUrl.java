package com.dylanvann.fastimage;

import com.bumptech.glide.load.model.GlideUrl;

public class FastImageGlideUrl extends GlideUrl {
    @Override
    public String getCacheKey() {
        String url = toStringUrl();
        if (url.contains("?")) {
            return url.substring(0, url.lastIndexOf("?"));
        } else {
            return url;
        }
    }
}