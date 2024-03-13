package cntt3.ex5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void timDieuKhien(){
         editTextSo1 = (EditText)findViewById(R.id.edt1);
         editTextSo2 = (EditText)findViewById(R.id.edt2);
        editTextKQ = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        timDieuKhien();
        //gan bo lang nghe su kien va code xu ly cho tung nut
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xu ly cong
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Tong = soA + soB;
                String chuoiKQ = String.valueOf(Tong);
                editTextKQ.setText(chuoiKQ);
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Hieu = soA - soB;
                String chuoiKQ = String.valueOf(Hieu);
                editTextKQ.setText(chuoiKQ);

            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Tich = soA * soB;
                String chuoiKQ = String.valueOf(Tich);
                editTextKQ.setText(chuoiKQ);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                float Thuong = soA / soB;
                String chuoiKQ = String.valueOf(Thuong);
                editTextKQ.setText(chuoiKQ);

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
    }

    public void XuLyCong(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edt1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edt2);
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tong = soA + soB;
        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        String chuoi_KQ = String.valueOf(Tong);
        editTextKQ.setText(chuoi_KQ);


    }
    public void XuLyTru(View v){
        EditText editTextso1 = (EditText)findViewById(R.id.edt1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edt2);
        String soThu1 = editTextso1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Hieu = soA - soB;
        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Hieu);
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edt1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edt2);
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Tich = soA * soB;
        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Tich);
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyChia(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edt1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edt2);
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        float Thuong = soA / soB;
        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        String chuoiKQ = String.valueOf(Thuong);
        editTextKQ.setText(chuoiKQ);
    }

}