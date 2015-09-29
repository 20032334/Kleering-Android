package com.melotic.klerring.utils;

import com.melotic.klerring.base.BaseResponse;

/**
 * Created by penghui on 14-6-12.
 */

public abstract class KleeringResponseHandler {
    public void onNetStart(){

    }

    public void onNetSuccess(BaseResponse response){
        this.onSuccess(response);
    }

    public void onNetError(BaseResponse response){
        this.onError(response);
    }

    public abstract void onStart();
    public abstract void onSuccess(BaseResponse response);
    public abstract void onError(BaseResponse response);
}
