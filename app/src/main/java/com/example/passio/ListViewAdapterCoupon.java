package com.example.passio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapterCoupon extends BaseAdapter {
    private Context context;
    private String[] noidung;
    private String [] hsd;

    public ListViewAdapterCoupon(Context context, String[] noidung, String[] hsd) {
        this.context = context;
        this.noidung = noidung;
        this.hsd = hsd;
    }

    @Override
    public int getCount() {
        return noidung.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= layoutInflater.inflate(R.layout.row_coupon,null);

        TextView textViewnd = (TextView)view.findViewById(R.id.noidung);
        TextView textViewhsd=(TextView)view.findViewById(R.id.time);


        textViewnd.setText(noidung[i]);
        textViewhsd.setText(hsd[i]);

        return view;
    }
}
