package com.example.passio;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class tab4 extends Fragment {

    public tab4() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment\


        int hinh[] ={R.drawable.chanhtuyet,R.drawable.mojito_tea,R.drawable.peach_tea,
                R.drawable.pinklady,R.drawable.passion_chill};
        String ten[] ={"Chanh Tuyết","Mojito Tea","Peach tea",
                "PINK LADY ICED TEA","Passion Chill"};
        String gia[] ={"36.000đ","39.000đ","49.000đ","44.000đ","39.000đ"};
        View view= inflater.inflate(R.layout.fragment_tab4, container, false);
        GridView gridView =(GridView) view.findViewById(R.id.girdview);
        GridviewAdaptertab gridviewAdaptertab= new GridviewAdaptertab(getActivity(),hinh,ten,gia);
        gridView.setAdapter(gridviewAdaptertab);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mh = new Intent(getActivity(), DetailTab4.class);
                startActivity(mh);
            }
        });
        return  view;
    }
}