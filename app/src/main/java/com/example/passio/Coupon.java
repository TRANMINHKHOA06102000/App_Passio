package com.example.passio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Coupon extends AppCompatActivity {

    private Button btnback;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem tab1,tab2,tab3;
    public PagerAdapterCoupon pagerAdapterCoupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);

        btnback= (Button)findViewById(R.id.bt_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Coupon.this, Home.class);
                startActivity(intent);
            }
        });

        tabLayout =(TabLayout)findViewById(R.id.tablayoutcoupon);
        tab1 =(TabItem)findViewById(R.id.tab1);
        tab2 =(TabItem)findViewById(R.id.tab2);
        tab3 =(TabItem)findViewById(R.id.tab3);
        viewPager=findViewById(R.id.viewpager);

        pagerAdapterCoupon = new PagerAdapterCoupon(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapterCoupon);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()== 0) {
                    pagerAdapterCoupon.notifyDataSetChanged();
                }else if(tab.getPosition()== 1) {
                    pagerAdapterCoupon.notifyDataSetChanged();
                }else if(tab.getPosition()== 2) {
                    pagerAdapterCoupon.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}