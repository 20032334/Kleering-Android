package com.melotic.klerring.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.melotic.klerring.R;
import com.melotic.klerring.entity.BankAccountEntity;

import java.util.List;

/**
 * Created by penghui on 15/9/11.
 */
public class DashboardAdapter extends ArrayAdapter{
    private List<BankAccountEntity> items;

    public DashboardAdapter(Context context, int textViewResourceId,
                          List<BankAccountEntity> items) {
        super(context, textViewResourceId, items);
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.dashboradcell, null);
        }

        BankAccountEntity content = items.get(position);
        if (content != null) {
            TextView currencyT = (TextView)view.findViewById(R.id.currency);
            currencyT.setText(content.getCurrency().getName() + "(" + content.getCurrency().getCode() + ")");

            TextView lockTV = (TextView)view.findViewById(R.id.lockamount);
            lockTV.setText(content.getCurrency().getSign() + content.getLockedBalance() / 1000);

            TextView balanceTV = (TextView)view.findViewById(R.id.balance);
            balanceTV.setText(content.getCurrency().getSign() + content.getBalance() / 100);

            ImageView imageView = (ImageView)view.findViewById(R.id.currencyIV);

            if (content.getCurrency().getCode().equalsIgnoreCase("CNY")){
                imageView.setImageResource(R.drawable.cn);
            }
            else if (content.getCurrency().getCode().equalsIgnoreCase("TWD")){
                imageView.setImageResource(R.drawable.twd);
            }
        }

        return view;
    }
}
