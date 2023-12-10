package com.example.myapplication.tuan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Tuan11MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btn1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);

        txt1 = findViewById(R.id.demo11txt1);
        txt2 = findViewById(R.id.demo11txt2);
        btn1 = findViewById(R.id.demo11Btn1);
        tv1 = findViewById(R.id.demo11Tv1);

        btn1.setOnClickListener(v->{
            tinhTong();
        });

    }
    //ham tinh tong
    private void tinhTong() {
        //lay du lieu nhap vao EditText1
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1);//chuyen du lieu sang so
        //lay du lieu nhap vao EditText2
        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);
        float tong = so1 + so2;
        tv1.setText(String.valueOf(tong));
    }
}