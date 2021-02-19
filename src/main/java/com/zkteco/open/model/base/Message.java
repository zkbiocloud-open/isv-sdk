/*
 * Class Name: Message
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.model.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true, value = {""})
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 状态，8个0的值为正常状态
     */
    @JsonProperty
    private String code;

    /**
     * 消息内容
     */
    @JsonProperty
    private String message;

    /**
     * 会话ID
     */
    @JsonProperty
    private String sessionId;

    @JsonProperty
    private String lang;

    @JsonProperty
    private String tz;

    @JsonProperty
    private Map<String, Object> payload;

    @JsonIgnore
    @JSONField(
            serialize = false
    )
    private Message.Payload payloadObject;

    public Message() {
        this.payload = new HashMap();
    }

    public Message(String code) {
        this.setCode(code);
    }

    public Message(boolean isRequest) {
        this(isRequest, new HashMap());
    }

    public Message(boolean isRequest, Map<String, Object> results) {
        this.payload = new HashMap();
        if (!isRequest) {
            this.setCode("00000000");
            this.payload.put("dataFmt", "1");
            this.payload.put("results", results);
        } else {
            this.payload.put("params", results);
        }

    }

    public String getLang() {
        return this.lang;
    }

    public Message setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getTz() {
        return this.tz;
    }

    public Message setTz(String tz) {
        this.tz = tz;
        return this;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public Message setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public Message setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public Map<String, Object> getPayload() {
        return this.payload;
    }

    public Message setPayload(Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }

    @JsonIgnore
    @JSONField(
            serialize = false
    )
    public Message.Payload getPayloadObject() {
        if (null == this.payloadObject) {
            this.payloadObject = new Message.Payload(this);
        }

        return this.payloadObject;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static class Payload extends HashMap<String, Object> {
        private final Message message;

        public Payload(Message message, int initialCapacity, float loadFactor) {
            this.message = message;
            if (null == this.message.payload) {
                this.message.payload = new HashMap(initialCapacity, loadFactor);
            }

        }

        public Payload(Message message, int initialCapacity) {
            this.message = message;
            if (null == this.message.payload) {
                this.message.payload = new HashMap(initialCapacity);
            }

        }

        public Payload(Message message) {
            this.message = message;
            if (null == this.message.payload) {
                this.message.payload = new HashMap();
            }

        }

        public Payload(Message message, Map<? extends String, ?> m) {
            this.message = message;
            if (null == this.message.payload) {
                this.message.payload = new HashMap(m);
            }

        }

        public Message upLevel() {
            return this.message;
        }

        public Map<String, Object> getParams() {
            if (null == this.get("params")) {
                this.initParams();
            }

            return (Map) this.get("params");
        }

        private void initParams() {
            this.put("params", new HashMap());
        }

        @Override
        public int size() {
            return this.message.payload.size();
        }

        public boolean isEmpty() {
            return this.message.payload.isEmpty();
        }

        public Object get(Object key) {
            return this.message.payload.get(key);
        }

        public boolean containsKey(Object key) {
            return this.message.payload.containsKey(key);
        }

        public Object put(String key, Object value) {
            return this.message.payload.put(key, value);
        }

        public void putAll(Map<? extends String, ?> m) {
            this.message.payload.putAll(m);
        }

        public Object remove(Object key) {
            return this.message.payload.remove(key);
        }

        public void clear() {
            this.message.payload.clear();
        }

        public boolean containsValue(Object value) {
            return this.message.payload.containsValue(value);
        }

        public Set<String> keySet() {
            return this.message.payload.keySet();
        }

        public Collection<Object> values() {
            return this.message.payload.values();
        }

        public Set<Entry<String, Object>> entrySet() {
            return this.message.payload.entrySet();
        }
    }
}

