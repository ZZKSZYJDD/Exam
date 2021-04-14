package com.up.exam.util;


import org.springframework.util.DigestUtils;

/**
 * MD5工具类

 *
 */

public class MD5Util {
    //盐，用于混交md5
    private static final String slat = "!%^fyuagd&*9";

    /**
     * 生成md5
     */
    public static String getMD5(String str) {
        String base = str + "/" + slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
}
