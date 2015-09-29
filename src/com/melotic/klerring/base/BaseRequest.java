package com.melotic.klerring.base;

import com.alibaba.fastjson.JSON;

import java.util.*;
/**
 * Created by penghui on 15/9/9.
 */
public abstract class BaseRequest {
    public String version(){
        return "1.0";
    }

    public Map toMap(){
        Map map = JSON.parseObject(JSON.toJSONString(this),Map.class);
        return map;
    }

    public BaseResponse getResponseWithJson(String json){
        BaseResponse response = new BaseResponse(json,this.getResponseClass());
        return response;
    }

    public abstract String resourceName();
    public abstract Class getResponseClass();
}
