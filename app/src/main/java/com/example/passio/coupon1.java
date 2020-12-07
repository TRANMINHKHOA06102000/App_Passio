package com.example.passio;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class coupon1 extends Fragment {


    public coupon1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String nd[] ={
                "Giảm Giá 25%  trên tất cả các đơn đặt hàng","Miễn phí 01 loại thức uống bất kỳ"
        };
        String hsd[] ={
                "30/12/2020","25/12/2020"
        };
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_coupon1, container, false);
        ListView listView =(ListView) view.findViewById(R.id.ListView);
        ListViewAdapterCoupon listViewAdapterCoupon =new ListViewAdapterCoupon(getActivity(),nd,hsd);
        listView.setAdapter(listViewAdapterCoupon);

        return  view;
    }
}