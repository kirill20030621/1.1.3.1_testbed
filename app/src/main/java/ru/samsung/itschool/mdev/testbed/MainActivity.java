package ru.samsung.itschool.mdev.testbed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.PrintStream;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText sName,names,patronymic,ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        sName = findViewById(R.id.surname);
        names = findViewById(R.id.name);
        patronymic = findViewById(R.id.patr);
        ages = findViewById(R.id.age);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = sName.getText().toString();
                String name = names.getText().toString();
                String patr = patronymic.getText().toString();
                String age = ages.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("s",surname);
                intent.putExtra("n", name);
                intent.putExtra("p",patr);
                intent.putExtra("a",age);
                startActivity(intent);
            }
        });


    }
}