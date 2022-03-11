package com.example.tablas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class splahs extends Activity {
ImageView gif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splahs);
        gif = findViewById(R.id.imgSplash);
        Glide.with(getApplicationContext()).load(R.drawable.fondo_spla).into(gif);
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent pasar = new Intent(splahs.this,MainActivity.class);
                startActivity(pasar);
                finish();
            }
        };

         Timer tiempo = new Timer();
         tiempo.schedule(tarea,5000);
    }
}