/*
 * Class Name: TokenCache
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.util;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

public class TokenCache {

    public static final String TOKEN_KEY = "open:bmp:token:";
    private static final Cache<String, String> TOKEN_CACHE = CacheBuilder.newBuilder().expireAfterWrite(100, TimeUnit.MINUTES).build();

    public static String get(String key) {
        return TOKEN_CACHE.getIfPresent(key);
    }

    public static void set(String key, String value) {
        TOKEN_CACHE.put(key, value);
    }
}
