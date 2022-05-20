package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText duonglich;
Button nutnhan;
TextView amlich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        duonglich=findViewById(R.id.duonglich);
        nutnhan=findViewById(R.id.nutnhan);
        amlich=findViewById(R.id.amlich);

        nutnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can[]=
                        {"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bỉnh","Đinh","Mậu","Kỷ"};
                String chi[]=
                        {"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String di = duonglich.getText().toString();
                int m = Integer.parseInt(di);
                String am= can[m%10]+""+chi[m%12];
                amlich.setText(am);
            }
        });

    }
}