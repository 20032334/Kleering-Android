package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.ConversionEntity;

/**
 * Created by penghui on 15/9/24.
 */
public class GetConversionInfoRequest extends BaseRequest{
    private String conversionId;

    @Override
    public String resourceName() {
        return "/api/conversions/" + conversionId;
    }

    @Override
    public Class getResponseClass() {
        return ConversionEntity.class;
    }

    public String getConversionId() {
        return conversionId;
    }

    public void setConversionId(String conversionId) {
        this.conversionId = conversionId;
    }
}
