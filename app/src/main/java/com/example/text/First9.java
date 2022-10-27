package com.example.text;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class First9 extends AppCompatActivity {

    Button b1;
    int result;

    RadioGroup rga1;
    RadioButton rgba1, rgba2, rgba3, rgba4;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.first9);
        super.onCreate(savedInstanceState);

        b1 = (Button) findViewById(R.id.next3);
        rgba1 = (RadioButton) findViewById(R.id.rgba1);
        rgba2 = (RadioButton) findViewById(R.id.rgba2);
        rgba3 = (RadioButton) findViewById(R.id.rgba3);
        rgba4 = (RadioButton) findViewById(R.id.rgba4);
        Intent intent = getIntent();


        final int[] result = {intent.getIntExtra("result1", 0)};



        rga1 = (RadioGroup) findViewById(R.id.rga1);

        rga1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rga1, int i) {
                if (i == R.id.rgba2) {
                    result[0] += 0;
                } else  {
                    result[0] += 1;
                }
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), First10s.class);
                startActivity(intent);
                intent.putExtra("result1", result[0]);
                startActivity(intent);


            }
        });




    }
}