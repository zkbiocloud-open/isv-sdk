/*
 * Class Name: EncryptionUtils
 * Project Name: bmp-sdk-api
 * Copyright © 1985-2020 ZKTeco Inc.All right reserved.
 */
package com.zkteco.open.util;

import cn.hutool.core.util.StrUtil;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class EncryptionUtils {

    /**
     * 说明: AES256加密
     *
     * @param stringToEncode 明文
     * @param keyString      密钥,token+0592xmzkteco
     * @return Bses64格式密文
     */
    public static String AES256Encode(String stringToEncode, String keyString)
            throws NullPointerException {
        if (StrUtil.isEmpty(keyString)) {
            return null;
        }
        if (StrUtil.isEmpty(stringToEncode)) {
            return null;
        }
        try {
            String stringToHex = convertStringToHex(keyString);
            SecretKeySpec skeySpec = getKey(stringToHex);
            byte[] data = stringToEncode.getBytes(StandardCharsets.UTF_8);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] databyte = cipher.doFinal(data);
            return Base64.getEncoder().encodeToString(databyte);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | NoSuchPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * 说明 :AES256解密
     * 处理 使用AES256加密，再转base64的数据
     *
     * @param text      Base64格式密文
     * @param keyString 密钥
     * @return String格式明文
     */
    public static String AES256Decrypt(String text, String keyString) {

        if (StrUtil.isEmpty(keyString)) {
            return null;
        }
        if (StrUtil.isEmpty(text)) {
            return null;
        }
        try {
            String stringToHex = convertStringToHex(keyString);
            SecretKey key = getKey(stringToHex);
            String temp = text.replace("\r\n", "").replace("\n", "");
            byte[] data = Base64.getDecoder().decode(temp);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptedValueBytes = (cipher.doFinal(data));
            return new String(decryptedValueBytes, StandardCharsets.UTF_8);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 说明 :将密钥转行成SecretKeySpec格式
     *
     * @param password 16进制密钥
     * @return SecretKeySpec格式密钥
     */
    private static SecretKeySpec getKey(String password) {
        // 如果为128将长度改为128即可
        int keyLength = 256;
        byte[] keyBytes = new byte[keyLength / 8];
        // explicitly fill with zeros
        Arrays.fill(keyBytes, (byte) 0x0);
        byte[] passwordBytes = toByte(password);
        int length = Math.min(passwordBytes.length, keyBytes.length);
        System.arraycopy(passwordBytes, 0, keyBytes, 0, length);
        return new SecretKeySpec(keyBytes, "AES");
    }

    /**
     * 将字符串转换为16进制字符串
     *
     * @param str 字符串
     * @return hexString 16进制字符串
     */
    private static String convertStringToHex(String str) {
        //把字符串转换成char数组
        char[] chars = str.toCharArray();
        //新建一个字符串缓存类
        StringBuilder hex = new StringBuilder();
        //循环每一个char
        for (char aChar : chars) {
            //把每一个char都转换成16进制的，然后添加到字符串缓存对象中
            hex.append(Integer.toHexString(aChar));
        }
        //最后返回字符串就是16进制的字符串
        return hex.toString();
    }

    /**
     * 将16进制转换为byte数组
     *
     * @param hexString 16进制字符串
     * @return byte数组
     */
    private static byte[] toByte(String hexString) {
        int len = hexString.length() / 2;
        byte[] result = new byte[len];
        for (int i = 0; i < len; i++) {
            result[i] = Integer.valueOf(hexString.substring(2 * i, 2 * i + 2), 16).byteValue();
        }

        return result;
    }
}
