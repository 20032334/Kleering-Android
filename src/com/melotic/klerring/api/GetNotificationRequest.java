package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.NotificationEntity;

/**
 * Created by penghui on 15/9/23.
 */
public class GetNotificationRequest extends BaseRequest {

    @Override
    public String resourceName() {
        return "/api/notifications";
    }

    @Override
    public Class getResponseClass() {
        return NotificationEntity.class;
    }
}
