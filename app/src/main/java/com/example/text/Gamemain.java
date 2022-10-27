package com.example.text;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Gamemain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game1);

        Button btn = (Button)findViewById(R.id.btn);   //btn아이디의 버튼을 가져와 btn에 넣음
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);

        btn.setOnClickListener(new View.OnClickListener() { //btn +버튼눌를때
            @Override
            public void onClick(View v) {//+버튼인 btn을 누를떄 SecondActivity클래스로 가는 이벤트
                Intent intent = new Intent(getApplicationContext(), Game1.class);
                startActivity(intent);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {// - 버튼인 btn1을 누를떄 SecondActivity클래스로 가는 이벤트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Game2.class);
                startActivity(intent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() { // ÷버튼인 btn2을 누를떄 SecondActivity클래스로 가는 이벤트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Game3.class);
                startActivity(intent);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() { //x버튼인 btn을 누를떄 SecondActivity클래스로 가는 이벤트
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Game4.class);
                startActivity(intent);

            }
        });



    }


}