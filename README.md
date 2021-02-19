# isv-sdk

帮助垂直行业独立软件开发商(ISV), 快速集成熵基（出入口、身份认证、时间管理） + AIoT能力.

目前万傲瑞联SDK支持以下api接口能力：

> 基础服务能力 <br>
> 门禁服务能力 <br>
> 考勤服务能力 <br>

# 开发

### 准备

在开始开发集成万傲瑞联应用之前，需要准备如下信息:

* 获取SDK AppSecret、AppKey、AppAESKey
万傲瑞联应用SDK AppSecret和AppKey、AppAESKey可在[万傲瑞联控制台](https://www.zkbiocloud.com/) 的应用信息里获取，如您尚未添加应用，请到万傲瑞联控制台中添加应用。

# 安装

isv-sdk可以采用多种方式进行安装，我们提供以下二种方法供用户使用：

## maven
要使用isv-sdk功能，需要在pom.xml中添加如下依赖：

```java
<dependency>
  <groupId>com.zkteco</groupId>
  <artifactId>bmp-sdk-api</artifactId>
  <version>1.0.0</version>
</dependency>
```



### 其他

将JAR包直接引入到您的工程中。

# 文档
若您对接口存在疑问，可以查阅:

> [API开发指南](https://docs.zkbiocloud.com/)
>
> [错误码](https://docs.zkbiocloud.com/pages/7d3931/)

# 数据加解密

由于数据在传输过程中，消息是在公开的因特网上传输，消息内容是可被截获的，如果内容未加密，则截获者可以直接阅读消息内容，存在着数据泄漏或者数据被抓包破解的风险。

万傲瑞联提供多种数据传输方式，最基础的为使用非加密格式的数据传输，同时提供了数据可加密选项. 开发者可以根据自身的需求选择加密数据传输通信，或者是非加密数据传输通信。

#### 数据加密

对明文字符串加密并Base64编码

```java
String encryptData = EncryptionUtils.AES256Encode("明文字符串", "AppAESKey");
```

#### 数据解密

```java
String decryptData = EncryptionUtils.AES256Decrypt("加密字符串", "AppAESKey");
```

# 示例

准备必要参数

```java
Certificate certificate = new Certificate();
certificate.setAppKey("rad8yZF2vP");
certificate.setAppSecret("5LtVWBDG2wLGM1lknaqW");
certificate.setAppAESKey("458ddd64-72d2-4b19-8139-ebaa9a4496f5");
BasicServiceClient basicServiceClient = new BasicServiceClient(certificate);
```

调用相应api接口：

```java
QueryDeviceRequest request = new QueryDeviceRequest();
QueryDeviceResponse response = basicServiceClient.findDeviceList(request);
List<DeviceDTO> deviceDTOList = response.getDeviceDTOList();
System.out.println(deviceDTOList);
```

加解密工具类

```java
public class EncryptionUtils {

    /**
     * 说明: AES256加密
     *
     * @param stringToEncode 明文
     * @param keyString      密钥 
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
```

