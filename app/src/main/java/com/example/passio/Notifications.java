package com.example.passio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class Notifications extends AppCompatActivity {
    private Button btnback;
    ListView listView;
    ArrayList<Thongbao> mangThongbao;
    NotificationAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        Anhxa();
        adapter=new NotificationAdapter(this,R.layout.row_notification, mangThongbao);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                xacnhanXoa(i);
                return false;
            }
        });


        btnback= (Button)findViewById(R.id.bt_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notifications.this, Home.class);
                startActivity(intent);
            }
        });
    }
    public  void Anhxa()
    {
        listView=(ListView) findViewById(R.id.ListView);
        mangThongbao =new ArrayList<>();
        mangThongbao.add(new Thongbao("TƯNG BỪNG KHAI TRƯƠNG - SĂN QUÀ CỰC XỊN. 9h và 15h ngày 10-11/11/2020, Passio 133 Nguyễn Văn Linh, Đà Nẵng tặng 200 Nón bảo hiểm. Đừng bỏ lỡ!",
                "10 phút trước",R.drawable.icon_notifi));
        mangThongbao.add(new Thongbao("Khởi đầu tuần mới, tràn đầy năng lượng cùng Passio nào. Passio Coffee - Chuỗi cà phê sạch mang đi đầu tiên tại Việt Nam",
                "8 giờ trước",R.drawable.icon_notifi));
        mangThongbao.add(new Thongbao(" PASSIO BARISTA CHAMPIONSHIP 2020 ĐÃ CHÍNH THỨC KHỞI TRANH",
                "1 ngày trước",R.drawable.icon_notifi));
        mangThongbao.add(new Thongbao("BÚNG TAY BAY NỬA GIÁ - ƯU ĐÃI ĐẾN 50% TẠI PASSIO KHI THANH TOÁN BẰNG MOMO",
                "10 ngày trước",R.drawable.icon_notifi));
        mangThongbao.add(new Thongbao("Vì phụ nữ là để yêu thương, Passio xin chúc phái đẹp ngày Phụ nữ Việt Nam 20/10 nhiều niềm vui và hạnh phúc.",
                "15 ngày trước",R.drawable.icon_notifi));
        mangThongbao.add(new Thongbao("Passio tặng 600 Bình giữ nhiệt cực xịn + Ưu đãi FREE UPSIZE danh riêng cho cư dân Q.7 nè. Đừng bỏ lỡ!",
                "19 ngày trước",R.drawable.icon_notifi));
        mangThongbao.add(new Thongbao("Cửa hàng cà phê Kiosk hoàn toàn mới sẽ có mặt tại Q.2 vào 14/10/2020. Nhanh chân tới cửa hàng để tận hưởng nhiều ưu đãi cực hấp dẫn!",
                "19 ngày trước",R.drawable.icon_notifi));
        mangThongbao.add(new Thongbao("LẤY NGAY MÃ 50K & CHILL CỰC ĐÃ CÙNG HỘI BẠN TẠI PASSIO!",
                "1 tháng trước",R.drawable.icon_notifi));
    }

    private void xacnhanXoa(final int position)
    {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setTitle("Thông Báo!");
        //alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setMessage("Bạn có muốn xóa thông báo này");
        alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                mangThongbao.remove(position);
                adapter.notifyDataSetChanged();//cập nhật lại mảng
            }
        });
        alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }
}