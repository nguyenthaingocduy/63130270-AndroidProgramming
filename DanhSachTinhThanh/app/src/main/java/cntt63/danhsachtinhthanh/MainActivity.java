package cntt63.danhsachtinhthanh;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Hien thi listView
        //B1+: Can co du lieu
        //Can bien phu hop de chua du lieu
        dsTenTinhThanhVN = new ArrayList<String>();//tao the hien cu the, xin moi
        //Them du lieu vao day
        dsTenTinhThanhVN.add("Ha Noi");
        dsTenTinhThanhVN.add("Ho Chi Minh");
        dsTenTinhThanhVN.add("Khanh Hoa");
        dsTenTinhThanhVN.add("Dong Nai");
        dsTenTinhThanhVN.add("Ninh Thuan");

        //B2: tao adapter
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dsTenTinhThanhVN);
        //B3: Gan vao dieu khien hien thi ListView
        //B3.1: tim dieu khien
        ListView  lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //Gan
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3: Lang nghe va xu ly su kien user tuong tac
        //gan bo lang nghe
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXl);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Tao bo lang nghe  va xu ly su kien  OnT=ItemClcick, dat vao mot bien
    AdapterView.OnItemClickListener BoLangNghevaXl = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parents, View view, int position, long id) {
            //Code xu ly o day
            // position la vi tri phan tu vua dc click
            String strTenTinh = dsTenTinhThanhVN.get(position);
            Toast.makeText(MainActivity.this, "Ban vua chon: " + strTenTinh, Toast.LENGTH_LONG).show();


        }
    };

}