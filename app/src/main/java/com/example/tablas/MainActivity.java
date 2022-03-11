package com.example.tablas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Spinner tablas;
    String vTablas;
    ImageView vertabla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablas = findViewById(R.id.nTabla);
        vertabla = findViewById(R.id.ImgVtabla);
        String Tablas [] = {"Selecciona una tabla","Tabla del 1","Tabla del 2","Tabla del 3","Tabla del 4","Tabla del 5","Tabla del 6","Tabla del 7","Tabla del 8","Tabla del 9","Tabla del 10"};
        ArrayAdapter adaptadorTamanios = new ArrayAdapter(this, R.layout.spi_layout,Tablas);
        tablas.setAdapter(adaptadorTamanios);
        tablas .setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                vTablas = Tablas[position];
                tablaa();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem intem){
        int id = intem.getItemId();
        switch (id){
            case R.id.nmenu:
                Intent about = new Intent(this,MainAbout.class);
                startActivity(about);
                return  true;
            default:
                return super.onOptionsItemSelected(intem);
        }

    }
    public void tablaa(){
        if (vTablas.equals("Selecciona una tabla")){
            vertabla.setImageDrawable(null);
        }
        else if (vTablas.equals("Tabla del 1")){
            vertabla.setImageResource(R.drawable.tabla1);
        }
        else if (vTablas.equals("Tabla del 2")){
            vertabla.setImageResource(R.drawable.tabla2);
        }
        else if (vTablas.equals("Tabla del 3")){
            vertabla.setImageResource(R.drawable.tabla3);
        }
        else if (vTablas.equals("Tabla del 4")){
            vertabla.setImageResource(R.drawable.tabla4);
        }
        else if (vTablas.equals("Tabla del 5")){
            vertabla.setImageResource(R.drawable.tabla5);
        }
        else if (vTablas.equals("Tabla del 6")){
            vertabla.setImageResource(R.drawable.tabla6);
        }
        else if (vTablas.equals("Tabla del 7")){
            vertabla.setImageResource(R.drawable.tabla7);
        }
        else if (vTablas.equals("Tabla del 8")){
            vertabla.setImageResource(R.drawable.tabla8);
        }
        else if (vTablas.equals("Tabla del 9")){
            vertabla.setImageResource(R.drawable.tabla9);
        }
        else if (vTablas.equals("Tabla del 10")){
            vertabla.setImageResource(R.drawable.tabla10);
        }
    }
}