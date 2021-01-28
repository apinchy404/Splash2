package com.example.splash2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int splashTimeOut = 10000;


    TextView txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=findViewById(R.id.txt_view);
        img=findViewById(R.id.img_view);


        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                txt.startAnimation(rotate);
            }
        });

        txt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                txt.clearAnimation();

                return true;
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                img.startAnimation(rotate);
            }
        });

        img.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                img.clearAnimation();

                return true;
            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        boolean i_love_my_parents = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Toast.makeText(MainActivity.this, "I Love My Parents", Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(i);


                finish();

            }
        }, splashTimeOut);
    }
}