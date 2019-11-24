package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my1intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(my1intent);
                finish();
            }
        });


                ImageButton imageButton6 = findViewById(R.id.imageButton6);
                imageButton6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent my2intent = new Intent(Main2Activity.this,Main4Activity.class);
                        startActivity(my2intent);
                        finish();


                    }
                });
            }
        }