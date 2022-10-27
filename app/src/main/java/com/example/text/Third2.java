package com.example.text;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class Third2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third2);


        TextView text = (TextView)findViewById(R.id.tv4);
        Intent intent = getIntent();


        int result = intent.getIntExtra("result1",0);

        text.setTextSize(35);
        text.setTextColor(Color.BLACK);


        if(result >= 6)
            text.setText("점수는"+result+"입니다."+ "\n" + "치매 의심"+"\n \n"+
                    "· 치매 자가검진 필요"+"\n"+"\n"+
                    "· 예방 방법이 궁금하면 아래 버튼을 클릭하세요. ");

        else if(result <6)
            text.setText("점수는"+result+"입니다."+ "\n" + "치매 안전"+"\n \n"+
                    "· 운동과 외부 사회 활동 유지하세요."+"\n"+"\n"+
                    "· 예방 방법이 궁금하면 아래 버튼을 클릭하세요.");
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
        Button b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), First3.class);
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


