package com.example.text;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class First2 extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.first2);
        super.onCreate(savedInstanceState);


        b1 = (Button) findViewById(R.id.ba2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), First3.class);
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