package com.example.text;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        TextView tv;
        Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6;

        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);


        btn_1.setOnClickListener(new View.OnClickListener() { //btn +버튼눌를때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Infor1.class);
                startActivity(intent);

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {// - 버튼인 btn1을 누를떄 SecondActivity클래스로 가는 이벤트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Infor2.class);
                startActivity(intent);

            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() { // ÷버튼인 btn2을 누를떄 SecondActivity클래스로 가는 이벤트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Infor3.class);
                startActivity(intent);

            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() { //x버튼인 btn을 누를떄 SecondActivity클래스로 가는 이벤트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Infor4.class);
                startActivity(intent);

            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() { //x버튼인 btn을 누를떄 SecondActivity클래스로 가는 이벤트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Infor5.class);
                startActivity(intent);

            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() { //x버튼인 btn을 누를떄 SecondActivity클래스로 가는 이벤트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Infor6.class);
                startActivity(intent);

            }
        });


    }
}