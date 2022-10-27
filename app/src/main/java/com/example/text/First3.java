package com.example.text;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class First3 extends AppCompatActivity {

    Button b1;
    int result=0;

    RadioGroup rga1;
    RadioButton rgba1, rgba2, rgba3, rgba4;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.first3);
        super.onCreate(savedInstanceState);

        b1 = (Button) findViewById(R.id.next3);




        rgba1 = (RadioButton) findViewById(R.id.rgba1);
        rgba2 = (RadioButton) findViewById(R.id.rgba2);
        rgba3 = (RadioButton) findViewById(R.id.rgba3);
        rgba4 = (RadioButton) findViewById(R.id.rgba4);

        rga1 = (RadioGroup) findViewById(R.id.rga1);


        rga1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rga1, int i) {
                if (i == R.id.rgba2) {
                    result += 0;
                } else  {
                    result += 1;
                }
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), First4.class);
                startActivity(intent);
                intent.putExtra("result1",result);
                startActivity(intent);


            }
        });




    }
        }