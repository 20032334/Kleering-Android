package com.melotic.klerring.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.json.JSONArray;

import java.util.Map;

/**
 * Created by penghui on 15/9/9.
 */
public class BaseResponse {
    private JSONObject jsonObject;
    private Object response;

    private int code;
    private String message;

    public BaseResponse(){

    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BaseResponse(String jsonString,Class clazz){
        this.jsonObject = JSON.parseObject(jsonString);
        if (clazz == null){
            response = JSON.toJavaObject(this.jsonObject, Map.class);
        }
        else{
            response = JSON.toJavaObject(this.jsonObject, clazz);
        }
    }
}
