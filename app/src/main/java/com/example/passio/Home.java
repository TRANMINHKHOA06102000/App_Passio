package com.example.passio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    private Button btnmon;
    private Button btncou;
    private Button btnnotification;
    private Button btnprofile;
    private Button btnmap;
    private ImageView imageView;
    GridView gridView;
    String ten[] ={
            "MỪNG KHAI TRƯƠNG CỬA HÀNG PASSIO 15F NGUYỄN THỊ MINH KHAI, Q.1, TP.HCM \nPassio mang đến bạn một phong cách hoàn toàn mới lạ, sành điệu, trẻ trung, và nổi bật đầy cá tính, và hương vị Cafe Capuchino đậm phong cách Ý, với mức giá trung bình.",
            "MỪNG KHAI TRƯƠNG CỬA HÀNG PASSIO 213 NGUYỄN VĂN CỪ, P.3, Q.5, TP.HCM \nQuà tặng siêu phẩm nhân dịp khai trương cửa hàng passio 213 nguyễn văn cừ phường 3, quận 5, thành phố hồ chí minh",
            "Passio Coffee tưng bừng khai trương Terminal thứ 7\nPassio Coffee là thương hiệu cà phê tươi sạch mang đi đầu tiên tại Việt Nam với phong cách cà phê kiểu Ý quyến rũ, không gian xanh mát mẻ thể hiện sự trẻ trung, nổi bật đầy cá tính"
    };
    int hinh[] ={R.drawable.g,R.drawable.cuahang,R.drawable.cuahangdem};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gridView = (GridView) findViewById(R.id.girdview);

        GridviewAdapter gridviewAdapter = new GridviewAdapter(this,ten,hinh);
        gridView.setAdapter(gridviewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Home.this,ten[i],Toast.LENGTH_LONG).show();
            }
        });

        btnmon = (Button)findViewById(R.id.chonmon);
        btnmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, TabChonMon.class);
                startActivity(intent);
            }
        });
        btncou = (Button)findViewById(R.id.coupon);
        btncou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Coupon.class);
                startActivity(intent);
            }
        });
        btnnotification = (Button)findViewById(R.id.notification);
        btnnotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Notifications.class);
                startActivity(intent);
            }
        });
        btnprofile = (Button)findViewById(R.id.user);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });
        btnmap = (Button)findViewById(R.id.map);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Map.class);
                startActivity(intent);
            }
        });
        imageView =(ImageView)findViewById(R.id.the);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Thethanhvien.class);
                startActivity(intent);
            }
        });
    }
}