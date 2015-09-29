package com.melotic.klerring.api;

import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.entity.LoginEntity;
import com.melotic.klerring.entity.TokenEntity;

/**
 * Created by penghui on 15/9/9.
 * 登录
 */
//params = @{ @"grant_type": @"password",@"client_id":@"test",@"client_secret":@"test",@"username":_uName,@"password":_pwd};

public class LoginRequest extends BaseRequest{
    String grant_type;
    String client_id;
    String client_secret;
    String username;
    String password;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Class getResponseClass() {
        return TokenEntity.class;
    }

    @Override
    public String resourceName() {
        return "/oauth/token";
    }


}
