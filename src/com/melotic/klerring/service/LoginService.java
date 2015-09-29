package com.melotic.klerring.service;

import com.melotic.klerring.api.LoginRequest;
import com.melotic.klerring.utils.KleeringApiUtil;
import com.melotic.klerring.utils.KleeringResponseHandler;

/**
 * Created by penghui on 15/9/25.
 */
public class LoginService {
    public static void login(String uName,String pwd,KleeringResponseHandler hanlder){
        final LoginRequest request = new LoginRequest();

        request.setClient_id("test");
        request.setGrant_type("password");
        request.setClient_secret("test");
        request.setUsername(uName);
        request.setPassword(pwd);

        KleeringApiUtil.getInstance().post(request,hanlder);
    }
}
