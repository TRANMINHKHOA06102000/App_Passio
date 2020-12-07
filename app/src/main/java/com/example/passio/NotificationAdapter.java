package com.example.passio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NotificationAdapter extends BaseAdapter {
    private Context context;
    int layout;
    List<Thongbao> thongbaoList;

    public NotificationAdapter(Context context, int layout, List<Thongbao> thongbaoList) {
        this.context = context;
        this.layout = layout;
        this.thongbaoList = thongbaoList;
    }

    @Override
    public int getCount() {
        return thongbaoList.size();
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
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(layout,null);

        TextView txtnoidung=(TextView) view.findViewById(R.id.noidung);
        TextView txttime=(TextView) view.findViewById(R.id.time);
        ImageView imgImage=(ImageView) view.findViewById(R.id.image);

        Thongbao thongbao = thongbaoList.get(i);

        txtnoidung.setText(thongbao.getNoidung());
        txttime.setText(thongbao.getTime());
        imgImage.setImageResource(thongbao.getImage());

        return view;
    }
}
