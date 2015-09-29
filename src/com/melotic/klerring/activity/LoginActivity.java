package com.melotic.klerring.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.melotic.klerring.KleeringSession;
import com.melotic.klerring.R;
import com.melotic.klerring.api.LoginRequest;
import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;
import com.melotic.klerring.customview.PhoneTextField;
import com.melotic.klerring.entity.TokenEntity;
import com.melotic.klerring.utils.KleeringApiUtil;
import com.melotic.klerring.utils.KleeringResponseHandler;

/**
 * Created by penghui on 15/9/10.
 */
public class LoginActivity extends Activity implements View.OnClickListener{
    Button loginButton;
    PhoneTextField phoneTextField;
    EditText pwd;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.login);

        loginButton = (Button)this.findViewById(R.id.loginBtn);
        phoneTextField = (PhoneTextField)this.findViewById(R.id.phonenumber);
        pwd = (EditText)this.findViewById(R.id.pwd);

        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String phone = LoginActivity.this.phoneTextField.getPhoneString();
        String phoneCode = LoginActivity.this.phoneTextField.getPhoneCodeString();
        String pwd = LoginActivity.this.pwd.getText().toString();

        final LoginRequest request = new LoginRequest();

        request.setClient_id("test");
        request.setGrant_type("password");
        request.setClient_secret("test");
        request.setUsername(phoneCode + phone);
        request.setPassword(pwd);

        KleeringApiUtil.getInstance().post(request,new KleeringResponseHandler() {
            @Override
            public void onStart() {
                Toast.makeText(LoginActivity.this,"start",Toast.LENGTH_LONG).show();
                System.out.print("===================");
            }

            @Override
            public void onSuccess(BaseResponse response) {
                Toast.makeText(LoginActivity.this.getApplicationContext(),"success",Toast.LENGTH_LONG).show();
                TokenEntity token = (TokenEntity)response.getResponse();
                KleeringSession.instance().accessToken = token.getAccess_token();
                System.out.print(token.getAccess_token());
                System.out.print("===================");

                Intent intent = new Intent(LoginActivity.this,DashBoardActivity.class);
                LoginActivity.this.startActivity(intent);
            }

            @Override
            public void onError(BaseResponse response) {
                Toast.makeText(LoginActivity.this.getApplicationContext(),"error",Toast.LENGTH_SHORT).show();
                System.out.print("===================");
            }
        });
    }
}
