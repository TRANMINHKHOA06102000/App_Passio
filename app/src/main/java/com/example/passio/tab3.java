package com.example.passio;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class tab3 extends Fragment {


    public tab3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment\


        int hinh[] ={R.drawable.espresso,R.drawable.iced_americano,R.drawable.iced_espresso_milk,
        R.drawable.iced_cappuccino,R.drawable.latte_hot,R.drawable.mocha_hot};
        String ten[] ={"Iced Espresso","Iced Americano","Iced Espresso With Milk",
        "Iced Cappuccino","Hot Latte","Hot MoCha"};
        String gia[] ={"36.000đ","39.000đ","49.000đ","44.000đ","39.000đ","39.000đ"};
        View view= inflater.inflate(R.layout.fragment_tab3, container, false);
        GridView gridView =(GridView) view.findViewById(R.id.girdview);
        GridviewAdaptertab gridviewAdaptertab= new GridviewAdaptertab(getActivity(),hinh,ten,gia);
        gridView.setAdapter(gridviewAdaptertab);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mh = new Intent(getActivity(), DetailTab3.class);
                startActivity(mh);
            }
        });
        return  view;
    }
}