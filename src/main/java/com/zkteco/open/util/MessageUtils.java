/*
 * Class Name: MessageUtils
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.util;

import com.alibaba.fastjson.JSONObject;
import com.zkteco.open.common.Pagination;
import com.zkteco.open.constant.ZKMessageConstants;
import com.zkteco.open.model.base.Message;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MessageUtils {

    private static final String RANDOM_KEYS = "abcdefghijklmnpqrstuvwxyzABCDEFGHIJKLMNPQRSTUVWXYZ123456789";

    public MessageUtils() {
    }

    public static boolean isSuccess(Message respMsg) {
        return "00000000".equals(respMsg.getCode());
    }

    public static Message addPayload(Message msg, Map<String, Object> payloadMap) {
        Map<String, Object> payload = msg.getPayload();
        if (payload == null) {
            payload = new HashMap();
            msg.setPayload(payload);
        }

        payload.putAll(payloadMap);
        return msg;
    }

    public static Message addPayload(Message msg, String key, Object value) {
        Map<String, Object> map = new HashMap();
        map.put(key, value);
        return addPayload(msg, map);
    }

    public static Message addPayloadParams(Message msg, Map<String, Object> paramMap) {
        Map<String, Object> payload = msg.getPayload();
        if (payload == null) {
            payload = new HashMap();
            msg.setPayload(payload);
        }

        Map<String, Object> params = (Map) payload.get("params");
        if (params == null) {
            params = new HashMap();
            payload.put("params", params);
        }

        params.putAll(paramMap);
        return msg;
    }

    public static Message addPayloadParams(Message msg, String key, Object value) {
        Map<String, Object> map = new HashMap();
        map.put(key, value);
        return addPayloadParams(msg, map);
    }

    public static Message delPayload(Message msg, String key) {
        Map<String, Object> payload = msg.getPayload();
        if (payload != null) {
            payload.remove(key);
        }

        return msg;
    }

    public static Map<String, Object> getResult(Message respMsg) {
        return (Map) Optional.ofNullable(respMsg.getPayload()).orElse(new HashMap()).get("results");
    }

    public static String getPayloadAsStringByKey(Message message, String key) {
        if (null == message) {
            return null;
        } else {
            Object value = Optional.ofNullable(message.getPayload()).filter((payload) -> {
                return Objects.nonNull(payload);
            }).map((payload) -> {
                return payload.get(key);
            }).filter((object) -> {
                return Objects.nonNull(object);
            }).orElse(null);
            return value == null ? null : value.toString();
        }
    }

    public static String getParamsAsStringByKey(Message message, String key) {
        if (null == message) {
            return null;
        } else {
            Object value = Optional.ofNullable(message.getPayload()).filter((payload) -> {
                return Objects.nonNull(payload);
            }).map((payload) -> {
                return (Map) payload.get("params");
            }).filter((params) -> {
                return Objects.nonNull(params);
            }).map((payload) -> {
                return payload.get(key);
            }).filter((object) -> {
                return Objects.nonNull(object);
            }).orElse(null);
            return value == null ? null : value.toString();
        }
    }

    public static Boolean getParamsAsBooleanByKey(Message message, String key) {
        Boolean result = null;
        if (null != message) {
            Map<String, Object> payload = message.getPayload();
            if (payload == null) {
                return null;
            }

            Map<String, Object> params = (Map) payload.get("params");
            if (null != params) {
                Object v = params.get(key);
                if (v instanceof Boolean) {
                    result = (Boolean) v;
                } else if (null != v) {
                    result = Boolean.valueOf(v.toString());
                }
            }
        }

        return result;
    }

    public static Integer getParamsAsIntegerByKey(Message message, String key) {
        Integer value = null;
        if (null != message) {
            Map<String, Object> payload = message.getPayload();
            if (payload == null) {
                return null;
            }

            Map<String, Object> params = (Map) payload.get("params");
            if (null != params) {
                Object v = params.get(key);
                if (v instanceof Integer) {
                    value = (Integer) v;
                } else if (null != v) {
                    try {
                        value = new Integer(v.toString());
                    } catch (NumberFormatException var7) {
                    }
                }
            }
        }

        return value;
    }

    public static List<String> getParamsAsArrayByKey(Message message, String key) {
        if (null == message) {
            return null;
        } else {
            Object value = Optional.ofNullable(message.getPayload()).filter((payload) -> {
                return Objects.nonNull(payload);
            }).map((payload) -> {
                return (Map) payload.get("params");
            }).filter((params) -> {
                return Objects.nonNull(params);
            }).map((payload) -> {
                return payload.get(key);
            }).filter((object) -> {
                return Objects.nonNull(object);
            }).orElse(null);
            return value == null ? null : (List) value;
        }
    }

    public static List getParamsAsArrayObjByKey(Message message, String key) {
        if (null == message) {
            return null;
        } else {
            Object value = Optional.ofNullable(message.getPayload()).filter((payload) -> {
                return Objects.nonNull(payload);
            }).map((payload) -> {
                return (Map) payload.get("params");
            }).filter((params) -> {
                return Objects.nonNull(params);
            }).map((payload) -> {
                return payload.get(key);
            }).filter((object) -> {
                return Objects.nonNull(object);
            }).orElse(null);
            return value == null ? null : (List) value;
        }
    }

    public static Map<String, Object> addPayloadParamsObject(Message msg, Map<String, ?> paramValueMap) {
        Map<String, Object> payload = msg.getPayload();
        if (payload == null) {
            payload = new HashMap();
            msg.setPayload(payload);
        }

        Map<String, Object> params = (Map) payload.get("params");
        if (params == null) {
            params = new HashMap();
            payload.put("params", params);
        }

        params.putAll(paramValueMap);
        return payload;
    }

    public static Map<String, Object> addPayloadInfo(Message msg, Map<String, ?> paramValueMap) {
        Map<String, Object> payload = msg.getPayload();
        if (payload == null) {
            payload = new HashMap();
            msg.setPayload(payload);
        }

        payload.putAll(paramValueMap);
        return payload;
    }

    public static Boolean getPayloadAsBooleanByKey(Message message, String key) {
        Boolean value = null;
        if (null != message) {
            Map<String, Object> payload = message.getPayload();
            if (payload == null) {
                return null;
            }

            Object v = payload.get(key);
            if (v instanceof Boolean) {
                value = (Boolean) v;
            } else if (null != v) {
                value = Boolean.parseBoolean(v.toString());
            }
        }

        return value;
    }

    public static Long getParamsAsLongByKey(Message message, String key) {
        Long value = null;
        if (null != message) {
            Map<String, Object> payload = message.getPayload();
            if (payload == null) {
                return null;
            }

            Map<String, Object> params = (Map) payload.get("params");
            if (null != params) {
                Object v = params.get(key);
                if (v instanceof Long) {
                    value = (Long) v;
                } else if (null != v) {
                    try {
                        value = Long.valueOf(v.toString());
                    } catch (NumberFormatException var7) {
                    }
                }
            }
        }
        return value;
    }

    public static Map<String, Object> getParamsAsMapObjectByKey(Message message, String key) {
        if (null == message) {
            return null;
        } else {
            Object value = Optional.ofNullable(message.getPayload()).filter((payload) -> {
                return Objects.nonNull(payload);
            }).map((payload) -> {
                return (Map) payload.get("params");
            }).filter((params) -> {
                return Objects.nonNull(params);
            }).map((payload) -> {
                return payload.get(key);
            }).filter((object) -> {
                return Objects.nonNull(object);
            }).orElse(null);
            return value == null ? null : (Map) value;
        }
    }

    public static Pagination getPagination(Message message) {
        Map<String, Object> resultsMap = (Map<String, Object>) message.getPayload().get(ZKMessageConstants.RESULTS);
        Map<String, Object> paginationMap = (Map<String, Object>) resultsMap.get(ZKMessageConstants.PAGINATION);
        int total = getTotal(paginationMap);
        int curPage = getCurPage(paginationMap);
        int pageSize = getPageSize(paginationMap);
        return new Pagination(total, curPage, pageSize);
    }

    public static int getTotal(Map<String, Object> paginationMap) {
        return (int) paginationMap.getOrDefault(ZKMessageConstants.TOTAL, 0);
    }

    public static int getCurPage(Map<String, Object> paginationMap) {
        return (int) paginationMap.getOrDefault(ZKMessageConstants.CUR_PAGE, 0);
    }

    public static int getPageSize(Map<String, Object> paginationMap) {
        return (int) paginationMap.getOrDefault(ZKMessageConstants.PAGE_SIZE, 0);
    }

    public static Map<String, Object> getParams(Message reqMsg) {
        return (Map) Optional.ofNullable(reqMsg.getPayload()).orElse(new HashMap()).get(ZKMessageConstants.PARAMS);
    }

    public static Map<String, Object> getResults(Message reqMsg) {
        return (Map) Optional.ofNullable(reqMsg.getPayload()).orElse(new HashMap()).get(ZKMessageConstants.RESULTS);
    }

    public static String getErrorMessage(String errorCode, String errorMessage) {
        JSONObject message = new JSONObject();
        message.put(ZKMessageConstants.CODE, errorCode);
        message.put(ZKMessageConstants.MESSAGE, errorMessage);
        return message.toJSONString();
    }

    public static Long getPayloadAsLongByKey(Message message, String key) {
        Long value = null;
        if (null != message) {
            Map<String, Object> payload = message.getPayload();
            if (payload == null) {
                return null;
            }
            Object v = payload.get(key);
            if (v instanceof Long) {
                value = (Long) v;
            } else if (v instanceof Double) {
                value = ((Double) v).longValue();
            } else if (null != v) {
                try {
                    value = Long.valueOf(v.toString());
                } catch (NumberFormatException var6) {
                    var6.printStackTrace();
                }
            }
        }
        return value;
    }

    public static String randomCode(Integer len) {
        StringBuilder sb = new StringBuilder();
        Random random = ThreadLocalRandom.current();
        int nextInt = RANDOM_KEYS.length();
        for (int i = 0; i < len; i++) {
            int number = random.nextInt(nextInt);
            sb.append(RANDOM_KEYS.charAt(number));
        }
        return sb.toString();
    }
}

