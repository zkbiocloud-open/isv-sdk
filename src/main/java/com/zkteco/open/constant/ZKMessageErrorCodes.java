/*
 * Class Name: ZKMessageErrorCodes
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.constant;

public class ZKMessageErrorCodes {

    /**
     * sdk内部调用错误
     */
    public static final class InnerErrorCode {
        /**
         * Token为空
         */
        public static final String TOKEN_EMPTY = "E0000001";

        /**
         * Token已失效,请重新登录.
         */
        public static final String TOKEN_EXPIRED = "E0000002";

        /**
         * Token无效
         */
        public static final String TOKEN_INVALID = "E0000003";

        /**
         * Token已失效,请重新刷新.
         */
        public static final String TOKEN_EXPIRED_REFRESH = "E0000008";
    }

    /**
     * sdk调用错误
     */
    public static final class SDKErrorCode {
        public static final String ERROR_REQUEST = "SE0100001";
    }
}
