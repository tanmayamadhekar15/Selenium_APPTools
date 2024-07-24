package com.thetestingacademy.endpoints;

import com.thetestingacademy.utils.DynamicDataReaderUtil;

public class SeleniumConstants {

    //using file reader
    public static String BASE_URL;

    static {
        try {
            BASE_URL = DynamicDataReaderUtil.readAKey("url");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
