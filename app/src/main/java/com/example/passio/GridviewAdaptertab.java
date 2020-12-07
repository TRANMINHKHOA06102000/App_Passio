package com.example.passio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewAdaptertab extends BaseAdapter {
    private Context context;
    private int[] hinhsp;
    private String[] tensp;
    private String [] giasp;
    public GridviewAdaptertab(Context context, int[] hinhsp, String[] tensp, String[] giasp) {
        this.context = context;
        this.hinhsp = hinhsp;
        this.tensp = tensp;
        this.giasp = giasp;
    }

    @Override
    public int getCount() {
        return tensp.length;
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
        view= layoutInflater.inflate(R.layout.row_tab,null);
        ImageView imageView =(ImageView)view.findViewById(R.id.imageviewHinh);
        TextView textViewten = (TextView)view.findViewById(R.id.textviewTen);
        TextView textViewgia=(TextView)view.findViewById(R.id.textviewGia);

        imageView.setImageResource(hinhsp[i]);
        textViewten.setText(tensp[i]);
        textViewgia.setText(giasp[i]);

        return view;
    }
}
