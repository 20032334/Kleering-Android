package com.melotic.klerring.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.melotic.klerring.R;
import com.melotic.klerring.adapter.DashboardAdapter;
import com.melotic.klerring.api.DashboardRequest;
import com.melotic.klerring.base.BaseResponse;
import com.melotic.klerring.entity.DashBoardEntity;
import com.melotic.klerring.utils.KleeringApiUtil;
import com.melotic.klerring.utils.KleeringResponseHandler;

import java.util.List;

/**
 * Created by penghui on 15/9/10.
 */
public class DashBoardActivity extends SherlockActivity{
    private ListView listView;

    public void loadData(){
        DashboardRequest request = new DashboardRequest();
        KleeringApiUtil.getInstance().get(request, new KleeringResponseHandler() {
            @Override
            public void onStart() {

            }

            @Override
            public void onSuccess(BaseResponse response) {
                DashBoardEntity dashboard = (DashBoardEntity)response.getResponse();
                List list = dashboard.getCurrencyAccounts();
                DashboardAdapter adapter = new DashboardAdapter(DashBoardActivity.this,0,list);
                DashBoardActivity.this.listView.setAdapter(adapter);
            }

            @Override
            public void onError(BaseResponse response) {

            }
        });
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        listView = (ListView)this.findViewById(R.id.listView);
        this.loadData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }
}
