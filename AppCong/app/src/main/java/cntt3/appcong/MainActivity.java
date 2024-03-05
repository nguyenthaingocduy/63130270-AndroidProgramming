package cntt3.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
//Day la bo lang nghe va xu ly su kien click len button tinhTong
    public void XuLyCong(View view){
        //Tim, tham chieu den dieu khien tren xml
          EditText  editTextSoA =  findViewById(R.id.edtA);
          EditText  editTextSoB =  findViewById(R.id.edtB);
          EditText  editTextKetQua =  findViewById(R.id.edtKQ);

//Lay du lieu ve o dieu kien so a
String strA =     editTextSoA.getText().toString();
//Lay du lieu ve o dieu kien so b
String strB =     editTextSoB.getText().toString();
//Chuyen du lieu sang dang so
int so_A = Integer.parseInt(strA);
int so_B = Integer.parseInt(strB);
//Tinh toan theo yeu cau
int tong = so_A + so_B;
String strTong = String.valueOf(tong);//chuyen sang chuoi
//Lay du lieu ve kq
editTextKetQua.setText(strTong);

    }
}