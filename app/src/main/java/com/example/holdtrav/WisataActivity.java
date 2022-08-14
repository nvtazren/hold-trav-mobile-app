package com.example.holdtrav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WisataActivity extends AppCompatActivity {
    ImageButton pindahActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        pindahActivity = findViewById(R.id.music);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemusic = new Intent(WisataActivity.this,MusicActivity.class);
                startActivity(pindahkemusic);
            }
        });
        pindahActivity = findViewById(R.id.home);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkehome = new Intent(WisataActivity.this,MainActivity.class);
                startActivity(pindahkehome);
            }
        });
        pindahActivity = findViewById(R.id.hotel);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkehotel = new Intent(WisataActivity.this,HotelActivity.class);
                startActivity(pindahkehotel);
            }
        });
        pindahActivity = findViewById(R.id.wisata);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkewisata = new Intent(WisataActivity.this,WisataActivity.class);
                startActivity(pindahkewisata);
            }
        });
        pindahActivity = findViewById(R.id.restaurant);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkerestoran = new Intent(WisataActivity.this,RestoranActivity.class);
                startActivity(pindahkerestoran);
            }
        });
    }
}