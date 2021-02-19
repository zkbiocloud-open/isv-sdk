/*
 * Class Name: ModelConvertUtils
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.map.MapUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.zkteco.open.constant.ZKMessageConstants;
import com.zkteco.open.model.base.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModelConvertUtils {

    public static <T> T messageToDto(Message msg, Class<T> clazz) {
        Map<String, Object> params = MessageUtils.getParams(msg);
        return map2PojoByJson(params, clazz);
    }

    public static <T> List<T> messageToList(Message msg, Class<T> clazz) {
        Map<String, Object> params = MessageUtils.getParams(msg);
        if (MapUtil.isEmpty(params)) {
            return new ArrayList<>();
        }
        return list2PojosByJson((List<Map<String, Object>>) params.get(ZKMessageConstants.LIST), clazz);
    }

    public static <T> T resultToDto(Message msg, Class<T> clazz) {
        Map<String, Object> params = MessageUtils.getResults(msg);
        return map2PojoByJson(params, clazz);
    }

    public static <T> List<T> resultToList(Message msg, Class<T> clazz) {
        List<Map<String, Object>> results = (List<Map<String, Object>>) msg.getPayload().get(ZKMessageConstants.RESULTS);
        if (results.isEmpty()) {
            return new ArrayList<>();
        }
        return list2PojosByJson(results, clazz);
    }

    public static <T> List<T> pageResultToList(Message msg, Class<T> clazz) {
        Map<String, Object> results = MessageUtils.getResults(msg);
        if (results.isEmpty()) {
            return new ArrayList<>();
        }
        return list2PojosByJson((List<Map<String, Object>>) results.get(ZKMessageConstants.LIST), clazz);
    }

    public static <E, T> List list2PojosByJson(List<E> list, Class<T> clazz) {
        if (CollectionUtil.isEmpty(list)) {
            return new ArrayList();
        }

        return JSON.parseArray(JSON.toJSONString(list), clazz);
    }

    public static <T> T map2PojoByJson(Map<String, Object> map, Class<T> clazz) {
        return JSON.parseObject(JSON.toJSONString(map), clazz);
    }

    public static <T> T map2PojoByJsonObject(Map<String, Object> map, Class<T> clazz) {
        return JSON.parseObject(JSON.toJSONString(map), clazz);
    }

    public static <T> Map pojo2MapByJson(T javaBean) {
        return JSON.parseObject(JSON.toJSONString(javaBean), Map.class);
    }

    public static <T> Map pojo2MapByJsonObject(T javaBean) {
        return JSONObject.parseObject(JSONObject.toJSONString(javaBean), Map.class);
    }

    public static <T> Map pojo2MapByFeature(T javaBean) {
        return JSONObject.parseObject(JSONObject.toJSONString(javaBean, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullNumberAsZero,
                SerializerFeature.WriteNullBooleanAsFalse), Map.class);
    }
}
