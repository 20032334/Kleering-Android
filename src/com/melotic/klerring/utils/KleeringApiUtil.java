package com.melotic.klerring.utils;

import android.widget.Toast;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;
import com.melotic.klerring.KleeringSession;
import com.melotic.klerring.activity.LoginActivity;
import com.melotic.klerring.base.BaseRequest;
import com.melotic.klerring.base.BaseResponse;
import org.apache.http.Header;
import org.json.JSONObject;

/**
 * Created by penghui on 15/9/9.
 */
public class KleeringApiUtil {
    private static AsyncHttpClient httpClient = new AsyncHttpClient();
    private static KleeringApiUtil api = new KleeringApiUtil();
    private String BaseURL = "https://melotic-kleering-staging.herokuapp.com";

    private KleeringApiUtil(){

    }

    public static KleeringApiUtil getInstance() {
        return api;

    }

    public String urlWithRequestClass(BaseRequest requestInfo){
        String version = requestInfo.version();
        String resourceName = requestInfo.resourceName();

        if (resourceName.endsWith("/"))
        {
            resourceName = resourceName + "/";
        }

        String newUrl = BaseURL  + resourceName + "?version="+ version;
        return newUrl;
    }

    public void get(final BaseRequest request, final KleeringResponseHandler handler){
        handler.onNetStart();

        RequestParams params = new RequestParams(request.toMap());

        String token = KleeringSession.instance().accessToken;
        if (token != null){
            httpClient.addHeader("Authorization","Bearer " + token);
        }
        httpClient.get(this.urlWithRequestClass(request), params, new TextHttpResponseHandler(){
            public void onFailure(String responseBody, Throwable error){
                BaseResponse response = request.getResponseWithJson(responseBody);
                handler.onNetError(response);
            }

            public void onSuccess(int statusCode, Header[] headers, String responseBody) {
                BaseResponse response = request.getResponseWithJson(responseBody);
                handler.onNetSuccess(response);
            }
        });
    }

    public void post(final BaseRequest request,final KleeringResponseHandler handler){
        handler.onNetStart();
        RequestParams params = new RequestParams(request.toMap());

        String token = KleeringSession.instance().accessToken;
        if (token != null){
            httpClient.addHeader("Authorization","Bearer " + token);
        }

        httpClient.post(this.urlWithRequestClass(request), params, new TextHttpResponseHandler() {
            @Override
            public void onFailure(String responseBody, Throwable error){
                BaseResponse response = request.getResponseWithJson(responseBody);
                handler.onNetError(response);
            }

            @Override
            public void onSuccess(int statusCode, org.apache.http.Header[] headers, java.lang.String responseString){
                BaseResponse response = request.getResponseWithJson(responseString);
                handler.onNetSuccess(response);
            }
        });
    }
}
