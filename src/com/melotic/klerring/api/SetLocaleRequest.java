package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 15/9/23.
 */
public class SetLocaleRequest extends BaseRequest {
    @Override
    public String resourceName() {
        return "/api/setlocale";
    }

    @Override
    public Class getResponseClass() {
        return BaseResponse.class;
    }
}
