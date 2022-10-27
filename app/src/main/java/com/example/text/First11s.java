package com.example.text;


import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class First11s extends AppCompatActivity {

    //Sound
    SoundPool soundPool;	//작성
    int soundID1;		//작성
    Button b1;
    int result;
    RadioGroup rga1;
    RadioButton rgba1, rgba2, rgba3, rgba4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first11);

        Intent intent = getIntent();
        rgba1 = (RadioButton) findViewById(R.id.rgba1);
        rgba2 = (RadioButton) findViewById(R.id.rgba2);
        rgba3 = (RadioButton) findViewById(R.id.rgba3);
        rgba4 = (RadioButton) findViewById(R.id.rgba4);

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


        //Sound
        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC,0);	//작성
        soundID1 = soundPool.load(this,R.raw.dog,1);	//작성, (mp3 파일 이름이 click_sound이다.)

        //버튼 클릭시 효과음 실행
        Button button1 = (Button)findViewById(R.id.b1);

        //xml 파일에 버튼 id가 ButtonID이다.


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundID1,1f,1f,0,0,1f);
            }
        });


        b1 = (Button) findViewById(R.id.next3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), First12s.class);
                startActivity(intent);
                intent.putExtra("result1", result[0]);
                startActivity(intent);


            }
        });


    }
}