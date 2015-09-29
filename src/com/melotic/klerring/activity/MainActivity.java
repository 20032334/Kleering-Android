package com.melotic.klerring.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.melotic.klerring.KleeringSession;
import com.melotic.klerring.R;
import com.melotic.klerring.base.BaseResponse;
import com.melotic.klerring.entity.TokenEntity;
import com.melotic.klerring.utils.KleeringApiUtil;
import com.melotic.klerring.utils.KleeringResponseHandler;
import com.melotic.klerring.api.LoginRequest;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.android-async-http-1.4.8.jar
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
