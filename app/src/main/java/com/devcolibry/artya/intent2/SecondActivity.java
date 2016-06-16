package com.devcolibry.artya.intent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Artya on 16.06.2016.
 */
public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        //optimal way to make onClickObjects
        findViewById(R.id.btn_goback).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "Click", Toast.LENGTH_SHORT).show();
                goToMainActivity(v);
            }
        });
    }
    public void goToMainActivity(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
