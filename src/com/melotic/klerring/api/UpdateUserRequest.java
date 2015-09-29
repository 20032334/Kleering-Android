package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/10.
 * 更新头像
 */
public class UpdateUserRequest extends BaseRequest {
    private String avatarURL;

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    @Override
    public Class getResponseClass() {
        return TokenEntity.class;
    }

    @Override
    public String resourceName() {
        return "/api/profile";
    }
}
