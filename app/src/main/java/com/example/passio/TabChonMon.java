package com.example.passio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TabChonMon extends AppCompatActivity {
    private Button btnback;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem tab1,tab2,tab3,tab4;
    public PagerAdapterChonMon pagerAdapterChonMon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_chon_mon);

        btnback= (Button)findViewById(R.id.bt_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TabChonMon.this, Home.class);
                startActivity(intent);
            }
        });

        tabLayout =(TabLayout)findViewById(R.id.tablayout);
        tab1 =(TabItem)findViewById(R.id.tab1);
        tab2 =(TabItem)findViewById(R.id.tab2);
        tab3 =(TabItem)findViewById(R.id.tab3);
        tab4=(TabItem)findViewById(R.id.tab4);
        viewPager=findViewById(R.id.viewpager);

        pagerAdapterChonMon = new PagerAdapterChonMon(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapterChonMon);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()== 0) {
                    pagerAdapterChonMon.notifyDataSetChanged();
                }else if(tab.getPosition()== 1) {
                    pagerAdapterChonMon.notifyDataSetChanged();
                }else if(tab.getPosition()== 2) {
                    pagerAdapterChonMon.notifyDataSetChanged();
                }else if(tab.getPosition()== 3){
                    pagerAdapterChonMon.notifyDataSetChanged();
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