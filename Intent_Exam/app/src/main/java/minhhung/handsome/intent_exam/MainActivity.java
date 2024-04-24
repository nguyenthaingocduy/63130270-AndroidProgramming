package minhhung.handsome.intent_exam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void  ChuyenSangManHinhDangNhap(View v){
        //1. Tao doi tuong inter
        Intent thuKichHoatMH2;
        //2. Ham tao co 2 tham so, tham so 1 la man hinh hien tai va tham so 2 la man hinh chuyen toi (class)
        thuKichHoatMH2 = new Intent(MainActivity.this, MainActivity2.class);
        //3. Gui thu ma khong doi phan hoi
        startActivities(thuKichHoatMH2);
    }

    private void startActivities(Intent thuKichHoatMH2) {
    }


}