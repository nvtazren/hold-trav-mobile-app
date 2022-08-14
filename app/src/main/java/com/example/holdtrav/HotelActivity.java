package com.example.holdtrav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HotelActivity extends AppCompatActivity {
    ImageButton pindahActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        pindahActivity = findViewById(R.id.music);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemusic = new Intent(HotelActivity.this,MusicActivity.class);
                startActivity(pindahkemusic);
            }
        });
        pindahActivity = findViewById(R.id.home);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkehome = new Intent(HotelActivity.this,MainActivity.class);
                startActivity(pindahkehome);
            }
        });
        pindahActivity = findViewById(R.id.restaurant);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkerestoran = new Intent(HotelActivity.this,RestoranActivity.class);
                startActivity(pindahkerestoran);
            }
        });
        pindahActivity = findViewById(R.id.hotel);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkehotel = new Intent(HotelActivity.this,HotelActivity.class);
                startActivity(pindahkehotel);
            }
        });
        pindahActivity = findViewById(R.id.wisata);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkewisata = new Intent(HotelActivity.this,WisataActivity.class);
                startActivity(pindahkewisata);
            }
        });
    }
}