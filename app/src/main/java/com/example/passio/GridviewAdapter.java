package com.example.passio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewAdapter extends BaseAdapter {
    private Context context;
    private String[] tensp;
    private int[] hinhsp;

    public GridviewAdapter(Context context, String[] tensp, int[] hinhsp) {
        this.context = context;
        this.tensp = tensp;
        this.hinhsp = hinhsp;
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
        view= layoutInflater.inflate(R.layout.row_list1,null);
        TextView textView = (TextView)view.findViewById(R.id.textView);
        ImageView imageView =(ImageView)view.findViewById(R.id.imageView);

        textView.setText(tensp[i]);
        imageView.setImageResource(hinhsp[i]);
        return view;
    }
}
