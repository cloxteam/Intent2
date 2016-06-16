package com.devcolibry.artya.intent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Artya on 16.06.2016.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_main);
        findViewById(R.id.btn_goto).setOnClickListener(mGlobalOnClickListener);
        findViewById(R.id.btn_toast).setOnClickListener(mGlobalOnClickListener);

        //quick, but to mesh
       /* findViewById(R.id.btn_goto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
                goToSecondActivity(v);
            }
        });
         */
    }

    //multiply chose
    final View.OnClickListener mGlobalOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(final View v) {
            switch (v.getId()){
                case R.id.btn_goto:
                    goToSecondActivity(v);
                    break;
                case R.id.btn_toast:
                    Toast.makeText(MainActivity.this, "NO", Toast.LENGTH_SHORT).show();
            }
        }
    };


    public void goToSecondActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
