package com.example.passio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Thethanhvien extends AppCompatActivity {
    private Button btnback;
    private TextView textView;
    ListView listView;
    ArrayList<Thongbao> mangThongbao;
    TheTVAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thethanhvien);


        btnback= (Button)findViewById(R.id.bt_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thethanhvien.this, Home.class);
                startActivity(intent);
            }
        });
        textView= (TextView) findViewById(R.id.all);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thethanhvien.this, Coupon.class);
                startActivity(intent);
            }
        });

        Anhxa();
        adapter=new TheTVAdapter(this,R.layout.row_coupon, mangThongbao);
        listView.setAdapter(adapter);
    }
    public  void Anhxa()
    {
        listView=(ListView) findViewById(R.id.ListView);
        mangThongbao =new ArrayList<>();
        mangThongbao.add(new Thongbao("Giảm Giá 25%  trên tất cả các đơn đặt hàng",
                "30/12/2020",R.drawable.kmcoupon));
        mangThongbao.add(new Thongbao("Miễn phí 01 loại thức uống bất kỳ",
                "25/12/2020",R.drawable.kmcoupon));
    }
}