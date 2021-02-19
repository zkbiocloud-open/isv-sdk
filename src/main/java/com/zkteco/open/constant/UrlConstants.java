/*
 * Class Name: UrlConstants
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.constant;

public class UrlConstants {

    /**
     * 此处的参数应该是由外部传入
     */
    public static final String BASE_URL = "http://127.0.0.1:7649";

    /**
     * 认证授权
     */
    public static final String OAUTH = "/open/oauth/v1/token?";
    public static final String REFRESH_TOKEN = "/open/oauth/v1/refreshToken?";

    /**
     * 业务层
     */
    //基础服务
    //组织管理
    public static final String CREATE_ORGANIZATION = "/open/bmp/basic/v1/organization/create";
    public static final String GET_ORGANIZATION = "/open/bmp/basic/v1/organization/get";
    public static final String QUERY_ORGANIZATION = "/open/bmp/basic/v1/organization/list";
    //人员管理
    public static final String CREATE_PERSON = "/open/bmp/basic/v1/person/create";
    public static final String DELETE_PERSON = "/open/bmp/basic/v1/person/delete";
    public static final String UPDATE_PERSON = "/open/bmp/basic/v1/person/update";
    public static final String GET_PERSON = "/open/bmp/basic/v1/person/get";
    public static final String QUERY_PERSON = "/open/bmp/basic/v1/person/list";
    public static final String PAGE_PERSON = "/open/bmp/basic/v1/person/page";
    //设备管理
    public static final String ADD_DEVICE = "/open/bmp/basic/v1/device/add";
    public static final String DELETE_DEVICE = "/open/bmp/basic/v1/device/delete";
    public static final String UPDATE_DEVICE = "/open/bmp/basic/v1/device/update";
    public static final String GET_DEVICE = "/open/bmp/basic/v1/device/get";
    public static final String QUERY_DEVICE = "/open/bmp/basic/v1/device/list";
    public static final String PAGE_DEVICE = "/open/bmp/basic/v1/device/page";
    public static final String ENABLE_DEVICE = "/open/bmp/basic/v1/device/enable";
    public static final String DISABLE_DEVICE = "/open/bmp/basic/v1/device/disable";
    public static final String PAGE_DEVICE_PERSON = "/open/bmp/basic/v1/device/person/page";
    public static final String PAGE_DEVICE_PERSON_BIOTEMPLATE = "/open/bmp/basic/v1/device/person/biotemplate/page";

    //门禁服务
    //门管理
    public static final String MODIFY_DOOR_NAME = "/open/bmp/access/v1/door/name/modify";
    public static final String MODIFY_DOOR_PARAMETER = "/open/bmp/access/v1/door/parameter/modify";
    public static final String QUERY_DOOR = "/open/bmp/access/v1/door/list";
    public static final String REMOTE_OPEN_DOOR = "/open/bmp/access/v1/door/remote/open";
    //规则管理
    public static final String CREATE_RULE = "/open/bmp/access/v1/rule/create";
    public static final String DELETE_RULE = "/open/bmp/access/v1/rule/delete";
    public static final String UPDATE_RULE = "/open/bmp/access/v1/rule/update";
    public static final String GET_RULE = "/open/bmp/access/v1/rule/get";
    public static final String QUERY_RULE = "/open/bmp/access/v1/rule/list";
    public static final String ASSIGN_DOOR = "/open/bmp/access/v1/rule/door/assign";
    public static final String ASSIGN_PERSON = "/open/bmp/access/v1/rule/person/assign";
    public static final String QUERY_RULE_DOOR = "/open/bmp/access/v1/rule/door/list";
    public static final String QUERY_RULE_PERSON = "/open/bmp/access/v1/rule/person/list";

    //考勤服务
    //设备管理模式
    public static final String SETUP_ATTENDANCE_PATTERN = "/open/bmp/attendance/v1/organization/pattern/setup";
    public static final String QUERY_ATTENDANCE_PATTERN = "/open/bmp/attendance/v1/organization/pattern/query";
    //考勤组管理
    public static final String CREATE_ATTENDANCE_GROUP = "/open/bmp/attendance/v1/group/create";
    public static final String DELETE_ATTENDANCE_GROUP = "/open/bmp/attendance/v1/group/delete";
    public static final String UPDATE_ATTENDANCE_GROUP = "/open/bmp/attendance/v1/group/update";
    public static final String GET_ATTENDANCE_GROUP = "/open/bmp/attendance/v1/group/get";
    public static final String QUERY_ATTENDANCE_GROUP = "/open/bmp/attendance/v1/group/list";
    public static final String BIND_DEVICE_GROUP = "/open/bmp/attendance/v1/group/device/bind";
    public static final String UNBIND_DEVICE_GROUP = "/open/bmp/attendance/v1/group/device/unbind";
    public static final String QUERY_GROUP_DEVICE = "/open/bmp/attendance/v1/group/device/list";
    public static final String BIND_PERSON_GROUP = "/open/bmp/attendance/v1/group/person/bind";
    public static final String UNBIND_PERSON_GROUP = "/open/bmp/attendance/v1/group/person/unbind";
    public static final String PAGE_GROUP_PERSON = "/open/bmp/attendance/v1/group/person/page";
    public static final String CLEAR_DEVICE_PERSON = "/open/bmp/attendance/v1/device/person/clear";
    //考勤设备人员
    public static final String QUERY_DEVICE_PERSON = "/open/bmp/attendance/v1/device/person/page";
    //考勤打卡记录
    public static final String PAGE_PUNCH_RECORD = "/open/bmp/attendance/v1/punch/page";

}
