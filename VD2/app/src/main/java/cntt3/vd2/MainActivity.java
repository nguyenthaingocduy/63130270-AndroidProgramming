package cntt3.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ContentInfoCompat;
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
    public void XuLyCong(View v){
        //B1: lay du lieu
        //B1.1: tim edittext
       EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
       EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
       //B1.2: Lay du lieu tu dieu khien

       String soThu1 = editTextSo1.getText().toString();
       String soThu2 = editTextSo2.getText().toString();
       //B1.3: Chuyen du lieu tu chuoi thanh so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2:Tinh toan
        float Tong = soA + soB;
        //B3: Hien thi ket qua
        //B3.1: Tim edittext
        EditText editTextKetQua = (EditText)findViewById(R.id.edtKetQua);
        //B3.2: Chuan bi du lieu xuat
        String chuoiKQ = String.valueOf(Tong);
        //B3.3: gan ket qua len dkhien
        editTextKetQua.setText(chuoiKQ);

    }
    public void XuLyTru(View v){
        //B1: Lay du lieu
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Hieu = soA - soB;
        EditText editTextKetQua = (EditText)findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Hieu);
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tich = soA * soB;
        EditText editTextKetQua = (EditText)findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Tich);
        editTextKetQua.setText(chuoiKQ);
    }
    public void XuLyChia(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Thuong = soA / soB;
        EditText editTextKetQua = (EditText)findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Thuong);
        editTextKetQua.setText(chuoiKQ);
    }

}