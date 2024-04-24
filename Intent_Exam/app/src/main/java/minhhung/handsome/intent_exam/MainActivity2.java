package minhhung.handsome.intent_exam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        //Xay dung bo lang nghe, xu ly theo mot cach khac
        //1. Tim doi duong can gan bo lang nghe
        Button btnManHinhDangNhap = findViewById(R.id.btnDN2);
        //2. Gan bo lang nghe
        btnManHinhDangNhap.setOnClickListener(BoLangNgheChuyenMH);

















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    View.OnClickListener BoLangNgheChuyenMH = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //1.Tao thu de gui ve
            Intent thuKichHoatMH1 = new Intent(MainActivity2.this, MainActivity.class);
            //2. Gui di va khong doi phan hoi
            startActivities(thuKichHoatMH1); 
        }

        private void startActivities(Intent thuKichHoatMH1) {
        }
    };


}