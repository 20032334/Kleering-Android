package com.melotic.klerring.base;

/**
 * Created by penghui on 15/9/9.
 */
public class BaseEntity {
    public int code;
    public String error_description;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }
}
