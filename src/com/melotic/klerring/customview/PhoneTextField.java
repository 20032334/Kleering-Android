package com.melotic.klerring.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.*;
import com.melotic.klerring.R;

/**
 * Created by penghui on 15/9/10.
 */
public class PhoneTextField extends RelativeLayout{
    private String phoneString;
    private String phoneCodeString;

    private TextView phoneCode;
    private EditText phone;
    private ImageView phoneCodeImageView;

    public PhoneTextField(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public PhoneTextField(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.phonetextfield, this);

        phoneCode = (TextView) findViewById(R.id.phonecode);
        phone = (EditText)findViewById(R.id.phone);
        phoneCodeImageView = (ImageView)findViewById(R.id.pcodeImageView);
    }

    public String getPhoneString() {
        return phone.getText().toString();
    }

    public void setPhoneString(String phoneString) {
        this.phoneString = phoneString;
    }

    public String getPhoneCodeString() {
        String temp = this.phoneCode.getText().toString();
        if (temp == null){
            return "86";
        }
        else{
            return temp;
        }
    }

    public void setPhoneCodeString(String phoneCodeString) {
        this.phoneCodeString = phoneCodeString;
    }

    public TextView getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(TextView phoneCode) {
        this.phoneCode = phoneCode;
    }

    public EditText getPhone() {
        return phone;
    }

    public void setPhone(EditText phone) {
        this.phone = phone;
    }

    public ImageView getPhoneCodeImageView() {
        return phoneCodeImageView;
    }

    public void setPhoneCodeImageView(ImageView phoneCodeImageView) {
        this.phoneCodeImageView = phoneCodeImageView;
    }
}
