package com.example.text;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class First1 extends AppCompatActivity {

    Button b1, b2,b3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.first1);
        super.onCreate(savedInstanceState);


        b1 = (Button) findViewById(R.id.ba1);

        b3 = (Button) findViewById(R.id.bc1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), First3.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Third1.class);
                startActivity(intent);
            }
        });




        Button exit = (Button) findViewById(R.id.exit1);
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });



    }
}