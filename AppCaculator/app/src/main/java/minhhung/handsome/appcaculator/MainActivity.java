package minhhung.handsome.appcaculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Timview
        TimView();
        //Gan cac bo lang nghe
        btnCong.setOnClickListener(boLangNghe_XuLyCong);
        btnTru.setOnClickListener(boLangNghe_XuLyTru);
        btnNhan.setOnClickListener(boLangNghe_XuLyNhan);
        btnChia.setOnClickListener(boLangNghe_XuLyChia);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //----------------------------------------------------------------------------------------------

    //Tao cac bo lang nghe xu kien va xu ly su kien
    //Cong
    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = edtSoA.getText().toString();
            String soThu2 = edtSoB.getText().toString();
            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);
            float Tong = soA + soB;
            String chuoiKQ = String.valueOf(Tong);
            tvKetQua.setText(chuoiKQ);

        }
    };
    //Tru
    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = edtSoA.getText().toString();
            String soThu2 = edtSoB.getText().toString();
            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);
            float Hieu = soA - soB;
            String chuoiKQ = String.valueOf(Hieu);
            tvKetQua.setText(chuoiKQ);

        }
    };
    //Nhan
    View.OnClickListener boLangNghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = edtSoA.getText().toString();
            String soThu2 = edtSoB.getText().toString();
            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);
            float Tich = soA - soB;
            String chuoiKQ = String.valueOf(Tich);
            tvKetQua.setText(chuoiKQ);

        }
    };
    //Chia
    View.OnClickListener boLangNghe_XuLyChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = edtSoA.getText().toString();
            String soThu2 = edtSoB.getText().toString();
            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);
            float Thuong = soA / soB;
            String chuoiKQ = String.valueOf(Thuong);
            tvKetQua.setText(chuoiKQ);
        }
    };

    //----------------------------------------------------------------------------------------------
    void TimView(){
        //Tim view
        edtSoA = (EditText)findViewById(R.id.edtTextA);
        edtSoB = (EditText)findViewById(R.id.edtTextB);
        btnCong = (Button)findViewById(R.id.buttonCong);
        btnTru = (Button)findViewById(R.id.buttonTru);
        btnNhan = (Button)findViewById(R.id.buttonNhan);
        btnChia = (Button)findViewById(R.id.buttonChia);
        tvKetQua = (TextView)findViewById(R.id.textViewKetQua);
    }
    //Khai bao cac doi tuong tuon gung voi cac dieu khien can thao tac
    EditText edtSoA;
    EditText edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKetQua;
}