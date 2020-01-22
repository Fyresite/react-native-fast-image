package com.dylanvann.fastimage;

import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import java.net.URL;

public class FastImageGlideUrl extends GlideUrl {
    FastImageGlideUrl(URL url) {
        super(url);
    }

    FastImageGlideUrl(String url) {
        super(url);
    }

    FastImageGlideUrl(URL url, Headers headers) {
        super(url, headers);
    }

    FastImageGlideUrl(String url, Headers headers) {
        super(url, headers);
    }

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