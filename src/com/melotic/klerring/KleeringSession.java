package com.melotic.klerring;

/**
 * Created by penghui on 15/9/10.
 */
public class KleeringSession {
    private static KleeringSession session = new KleeringSession();
    public String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    private KleeringSession(){

    }

    public static KleeringSession instance(){
        return session;
    }
}
