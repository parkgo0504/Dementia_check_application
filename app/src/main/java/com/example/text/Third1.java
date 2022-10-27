package com.example.text;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Third1 extends AppCompatActivity {

    RadioGroup rgc1,rgc2,rgc3,rgc4,rgc5,rgc6,rgc7,rgc8,rgc9,rgc10,rgc11,rgc12,rgc13;
    RadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
    Button b;
    int result=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.third1);
        super.onCreate(savedInstanceState);

        b = (Button) findViewById(R.id.bc1);
        rgc1 = (RadioGroup) findViewById(R.id.rgc1);
        rgc2 = (RadioGroup) findViewById(R.id.rgc2);
        rgc3 = (RadioGroup) findViewById(R.id.rgc3);
        rgc4 = (RadioGroup) findViewById(R.id.rgc4);
        rgc5 = (RadioGroup) findViewById(R.id.rgc5);
        rgc6 = (RadioGroup) findViewById(R.id.rgc6);
        rgc7 = (RadioGroup) findViewById(R.id.rgc7);
        rgc8 = (RadioGroup) findViewById(R.id.rgc8);
        rgc9 = (RadioGroup) findViewById(R.id.rgc9);
        rgc10 = (RadioGroup) findViewById(R.id.rgc10);
        rgc11 = (RadioGroup) findViewById(R.id.rgc11);
        rgc12 = (RadioGroup) findViewById(R.id.rgc12);
        rgc13 = (RadioGroup) findViewById(R.id.rgc13);


        b1 = (RadioButton) findViewById(R.id.rgbc1);
        b2 = (RadioButton) findViewById(R.id.rgbc2);
        b3 = (RadioButton) findViewById(R.id.rgbc3);
        b4 = (RadioButton) findViewById(R.id.rgbc4);
        b5 = (RadioButton) findViewById(R.id.rgbc5);
        b6 = (RadioButton) findViewById(R.id.rgbc6);
        b7 = (RadioButton) findViewById(R.id.rgbc7);
        b8 = (RadioButton) findViewById(R.id.rgbc8);
        b9 = (RadioButton) findViewById(R.id.rgbc9);
        b10 = (RadioButton) findViewById(R.id.rgbc10);
        b11 = (RadioButton) findViewById(R.id.rgbc11);
        b12 = (RadioButton) findViewById(R.id.rgbc12);
        b13 = (RadioButton) findViewById(R.id.rgbc13);
        b14 = (RadioButton) findViewById(R.id.rgbc14);
        b15 = (RadioButton) findViewById(R.id.rgbc15);
        b16 = (RadioButton) findViewById(R.id.rgbc16);
        b17 = (RadioButton) findViewById(R.id.rgbc17);
        b18 = (RadioButton) findViewById(R.id.rgbc18);
        b19 = (RadioButton) findViewById(R.id.rgbc19);
        b20 = (RadioButton) findViewById(R.id.rgbc20);
        b21 = (RadioButton) findViewById(R.id.rgbc21);
        b22 = (RadioButton) findViewById(R.id.rgbc22);
        b23 = (RadioButton) findViewById(R.id.rgbc23);
        b24 = (RadioButton) findViewById(R.id.rgbc24);
        b25 = (RadioButton) findViewById(R.id.rga1);
        b26 = (RadioButton) findViewById(R.id.rgba2);






        rgc1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup rgc1, int i) {
                    if (i == R.id.rgbc1) {
                        result += 1;
                    } else if (i == R.id.rgbc2) {

                        result += 0;
                    }
                }
            });

        rgc2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc3) {

                    result += 1;
                } else if (i == R.id.rgbc4) {


                    result += 0;
                }
            }
        });
        rgc3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc5) {

                    result += 1;
                } else if (i == R.id.rgbc6) {


                    result += 0;
                }
            }
        });

        rgc4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc7) {

                    result += 1;
                } else if (i == R.id.rgbc8) {


                    result += 0;
                }
            }
        });

        rgc5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc9) {

                    result += 1;
                } else if (i == R.id.rgbc10) {


                    result += 0;
                }
            }
        });

        rgc6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc11) {

                    result += 1;
                } else if (i == R.id.rgbc12) {


                    result += 0;
                }
            }
        });

        rgc7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc13) {

                    result += 1;
                } else if (i == R.id.rgbc14) {


                    result += 0;
                }
            }
        });
        rgc8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc15) {

                    result += 1;
                } else if (i == R.id.rgbc16) {


                    result += 0;
                }
            }
        });
        rgc9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc17) {

                    result += 1;
                } else if (i == R.id.rgbc18) {


                    result += 0;
                }
            }
        });
        rgc10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc19) {

                    result += 1;
                } else if (i == R.id.rgbc20) {


                    result += 0;
                }
            }
        });
        rgc11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc21) {

                    result += 1;
                } else if (i == R.id.rgbc22) {


                    result += 0;
                }
            }
        });
        rgc12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rgbc23) {

                    result += 1;
                } else if (i == R.id.rgbc24) {


                    result += 0;
                }
            }
        });
        rgc13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rgc1, int i) {
                if (i == R.id.rga1) {

                    result += 1;
                } else if (i == R.id.rgba2) {


                    result += 0;
                }
            }
        });




    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Third2.class);
            startActivity(intent);

            if(result >= 6)
                intent.putExtra("result1",result);
            else
                intent.putExtra("result1",result);

            startActivity(intent);


        }
    });

}
    }


