package com.example.mytong.utils;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class HttpUtils {
    public static RequestBody getBosy(String json){
        RequestBody requestBody=null;
        if (json!=null){
            requestBody=RequestBody.create(MediaType.parse(""),json);
        }
        return requestBody;
    }
}
