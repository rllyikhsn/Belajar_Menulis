package com.example.root.disgraphia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kategori_Penulisan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori__penulisan);

        final Button Huruf = (Button)findViewById(R.id.Huruf);
        Huruf.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Kategori_Penulisan.this, Pemilihan.class);
                startActivity(tay);
            }
        });

        Button Angka = (Button)findViewById(R.id.Angka);
        Angka.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Kategori_Penulisan.this, Angka.class);
                startActivity(tay);
            }
        });
    }
}
