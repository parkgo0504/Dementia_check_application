package com.example.text;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Game4 extends AppCompatActivity {
    Random random=new Random();     //랜덤함수
    int r = random.nextInt(10)+1;     //처음에 표시되는 숫자 1
    int p = random.nextInt(10)+1;   // 처음에 표시되는 숫자2
    int  result=r*p;    //숫자1과 숫자 2를 계산한값

    String num;
    int num1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.game5);

        Button btn1= (Button)findViewById(R.id.btn);
        Button btn = (Button)findViewById(R.id.btn1);
        final EditText edit= (EditText)findViewById(R.id.edit);
        final TextView view = (TextView)findViewById(R.id.txt);
        final TextView view1 = (TextView)findViewById(R.id.txt1);

        view.setText(Integer.toString(r));   //랜덤숫자1를  텍스트뷰인 view에 표현하기
        view1.setText(Integer.toString(p));  //랜덤숫자2를  텍스t1=확인 이라는버튼 눌럿을때의 이벤트트뷰인 view에표현하기
                btn1.setOnClickListener(new View.OnClickListener() {   //btn1인 확인을눌럿을때
                    @Override
                    public void onClick(View v) {    // b
                num= edit.getText().toString();   //입력한  텍스트를 문자열로바꾸기
                num1=Integer.parseInt(num);   // 문자열로된 텍스트를 정수형으로 바꾸기

                if(result == num1){    //랜덤숫자 1과 2 의 계산값인 result와 우리가 입력한 값의 정수형태인값인 num1를 비교  똑같을떄
                    Toast.makeText(getApplicationContext(),"정답입니다",Toast.LENGTH_SHORT).show();

                    int r = random.nextInt(10)+1;
                    int p = random.nextInt(10)+1;
                    result=r*p;
                    view.setText(Integer.toString(r));
                    view1.setText(Integer.toString(p));

                }
                else
                    Toast.makeText(getApplicationContext(), "틀렸습니다", Toast.LENGTH_SHORT).show(); //틀릴떄
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        super.onCreate(savedInstanceState);
    }
}