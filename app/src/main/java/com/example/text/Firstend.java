package com.example.text;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Firstend extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstend);


        TextView text = (TextView)findViewById(R.id.tv5);
        ImageView im1 =(ImageView)findViewById(R.id.imageView4);


        Drawable drawable = null; //drwable 객체 정의 그림 폴더
        Intent intent = getIntent();


        int result = intent.getIntExtra("result1",0);

        text.setTextSize(25);
        text.setTextColor(Color.BLACK);



        if(result >=7) {
            drawable = getResources().getDrawable(R.drawable.sin3); //drwable 그림파일 불러오기
            im1.setImageDrawable(drawable);
            text.setText("당신 치매 위험도는" + result + "입니다." + "\n" + "치매 말기" + "\n \n" +
                    "· 병원에 찾아가세요. 병원위치가 궁금하면 아래버튼을 클릭하세요." + "\n" + "\n" +
                    "· 예방 방법이 궁금하면 아래 버튼을 클릭하세요. ");

        }
        else if(result >=3 && result <7) {
            drawable = getResources().getDrawable(R.drawable.sin2); //drwable 그림파일 불러오기
            im1.setImageDrawable(drawable);
            text.setText("당신 치매 위험도는" + result + "입니다." + "\n" + "치매 중기" + "\n \n" +
                    "· 병원에 찾아가세요. 병원위치가 궁금하면 아래버튼을 클릭하세요." + "\n" + "\n" +
                    "· 예방 방법이 궁금하면 아래 버튼을 클릭하세요. ");
        }

        else if(result >=0 && result <2) {
            drawable = getResources().getDrawable(R.drawable.sin1); //drwable 그림파일 불러오기
            im1.setImageDrawable(drawable);
            text.setText("점수는"+result+"입니다."+ "\n" + "치매 안전"+"\n \n"+
                    "· 운동과 외부 사회 활동 유지하세요."+"\n"+"\n"+
                    "· 예방 방법이 궁금하면 아래 버튼을 클릭하세요.");
        }
        else{
            finish();
        }





        Button exit1 = (Button)findViewById(R.id.exit);
        exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        Button dbba1 = (Button)findViewById(R.id.dbba1);
        dbba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DbHelperM.class);
                startActivity(intent);
            }
        });

        Button btn_7 = (Button)findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Map.class);
                startActivity(intent);
            }
        });

        Button btn_6 = (Button)findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Infor6.class);
                startActivity(intent);
            }
        });
    }
}


