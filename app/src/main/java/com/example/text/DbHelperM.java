package com.example.text;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DbHelperM extends AppCompatActivity {



    myDBHelper myHelper;
    EditText edtName, edtNumber, edtNameResult, edtNumberResult;
    Button btnInit, btnInsert, btnSelect, btnDelete, btnChange;
    SQLiteDatabase sqlDB;
    String name, number;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dbmain);
        setTitle("그룹 관리 DB");

        edtName = (EditText) findViewById(R.id.name);
        edtNumber = (EditText) findViewById(R.id.tel);
        edtNameResult = (EditText) findViewById(R.id.naemresult);
        edtNumberResult = (EditText) findViewById(R.id.telresult);

        btnInit = (Button) findViewById(R.id.dbb1);
        btnInsert = (Button) findViewById(R.id.dbb2);
        btnSelect = (Button) findViewById(R.id.dbb3);
        btnChange = (Button) findViewById(R.id.dbb4);
        btnDelete = (Button) findViewById(R.id.dbb5);

        myHelper = new myDBHelper(this);

        btnInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase(); //읽고 쓰기용 DB 반환
                myHelper.onUpgrade(sqlDB, 1, 2);
                sqlDB.close();


            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sqlDB = myHelper.getWritableDatabase();
                    sqlDB.execSQL("INSERT INTO groupTBL VALUES( '" + edtName.getText().toString() + "' , " + edtNumber.getText().toString() + ");");
                    sqlDB.close();
                    Toast.makeText(getApplicationContext(), "저장 완료", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "유효한 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    edtName.setText("");
                    edtNumber.setText("");
                }
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh();
            }
        });

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sqlDB = myHelper.getWritableDatabase();
                    sqlDB.execSQL("UPDATE groupTBL SET gNumber=" + edtNumber.getText().toString() + " WHERE gName=" + "\"" + edtName.getText().toString() + "\"");
                    refresh();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "유효한 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    edtName.setText("");
                    edtNumber.setText("");
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sqlDB = myHelper.getWritableDatabase();
                    sqlDB.execSQL("DELETE FROM groupTBL WHERE gName=" + "\"" + edtName.getText().toString() + "\"");
                    sqlDB.close();
                    refresh();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "유효한 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    edtName.setText("");
                    edtNumber.setText("");
                }
            }
        });
    }

    public void refresh() { //Table 내용을 출력하기 위한 함수
        sqlDB = myHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null); //모든 테이블을 조회한 후 커서에 대입

        name = "이름 : \n";
        number = "점수 : \n";

        while (cursor.moveToNext()) { //행 데이터 개수만큼 반복
            name += cursor.getString(0) + "\n"; //현재 커서의 열 번호 데이터값을 반환
            number += cursor.getString(1) + "\n";
        }

        edtNameResult.setText(name); //누적한 문자열을 출력
        edtNumberResult.setText(number);

        cursor.close();
        sqlDB.close();

        name = "";
        number = "";

    }

}