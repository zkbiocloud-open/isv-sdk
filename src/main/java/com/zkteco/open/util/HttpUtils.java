/*
 * Class Name: HttpUtils
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.util;

import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.zkteco.open.model.base.Message;

import java.util.*;

public class HttpUtils {

    private static final Integer TIMEOUT = 30000;

    public static Message post(String url, String token, Object body, Integer timeout) {
        return post(url, token, JSON.toJSONString(body), Message.class, timeout);
    }

    public static Message post(String url, Map<String, String> requestHeader, String token, Object body) {
        return post(url, token, requestHeader, JSON.toJSONString(body), Message.class);
    }

    public static <T> T post(String url, String token, Map<String, String> requestHeader, String body, Class<T> clazz) {
        return postByHeader(url, commonHeader(token, requestHeader), body, clazz);
    }

    public static <T> T post(String url, String body, Class<T> clazz, Integer timeout) {
        String result = HttpRequest.post(url).header(handleHeader(commonHeader())).body(body).timeout(timeout).execute().body();
        return JSON.parseObject(result, clazz);
    }

    public static <T> T post(String url, String token, String body, Class<T> clazz, Integer timeout) {
        String result = HttpRequest.post(url).header(handleHeader(commonHeader(token, null))).body(body).timeout(timeout).execute().body();
        return JSON.parseObject(result, clazz);
    }

    public static <T> T postByHeader(String url, Map<String, String> headers, String body, Class<T> clazz) {
        return post(url, handleHeader(headers), body, clazz);
    }

    public static <T> T post(String url, Map<String, List<String>> headers, String body, Class<T> clazz) {
        String result = HttpRequest.post(url).header(headers, true).body(body).timeout(TIMEOUT).execute().body();
        return JSON.parseObject(result, clazz);
    }

    public static <T> T get(String url, Class<T> clazz) {
        String body = HttpRequest.get(url).header(handleHeader(commonHeader()), true).execute().body();
        return JSON.parseObject(body, clazz);
    }

    public static Map<String, List<String>> handleHeader(Map<String, String> params) {
        Map<String, List<String>> headers = new HashMap<>(16);
        Set<Map.Entry<String, String>> entries = params.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            headers.put(entry.getKey(), Arrays.asList(entry.getValue()));
        }
        return headers;
    }

    public static Map<String, String> commonHeader(String token, Map<String, String> requestHeader) {
        Map<String, String> header = commonHeader();
        header.put("Authorization", "Bearer " + token);
        header.putAll(requestHeader);
        return header;
    }

    public static Map<String, String> commonHeader() {
        Map<String, String> header = new HashMap<>(16);
        header.put("Content-Type", "application/json");
        header.put("lang", "zh_CN");
        header.put("tz", "Asia/Shanghai");
        return header;
    }

}
