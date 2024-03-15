package cntt63.danhsachtinhthanh;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Hien thi listView
        //B1+: Can co du lieu
        //Can bien phu hop de chua du lieu
        ArrayList<String> dsTenTinhThanhVN = new ArrayList<String>();//tao the hien cu the, xin moi
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















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}