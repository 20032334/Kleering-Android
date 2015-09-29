package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.SiteEntity;

/**
 * Created by penghui on 15/9/24.
 */
public class GetSiteRequest extends BaseRequest{
    private String type;

    @Override
    public String resourceName() {
        return "/api/linkedaccounts/linkedaccounttype/" + type;
    }

    @Override
    public Class getResponseClass() {
        return SiteEntity.class;
    }
}
