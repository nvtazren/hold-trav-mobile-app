package com.example.holdtrav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.holdtrav.adapter.RecentsAdapter;
import com.example.holdtrav.adapter.TopPlacesAdapter;
import com.example.holdtrav.model.RecentsData;
import com.example.holdtrav.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;
    ImageButton pindahActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pindahActivity = findViewById(R.id.music);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemusic = new Intent(MainActivity.this,MusicActivity.class);
                startActivity(pindahkemusic);
            }
        });
        pindahActivity = findViewById(R.id.restaurant);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkerestoran = new Intent(MainActivity.this,RestoranActivity.class);
                startActivity(pindahkerestoran);
            }
        });
        pindahActivity = findViewById(R.id.hotel);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkehotel = new Intent(MainActivity.this,HotelActivity.class);
                startActivity(pindahkehotel);
            }
        });
        pindahActivity = findViewById(R.id.wisata);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkewisata = new Intent(MainActivity.this,WisataActivity.class);
                startActivity(pindahkewisata);
            }
        });
        pindahActivity = findViewById(R.id.home);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkehome = new Intent(MainActivity.this,MainActivity.class);
                startActivity(pindahkehome);
            }
        });
        //now here we will add some dummy data in our model class
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Sendang Biru","Lowayu, Dukun","Gratis", R.drawable.recentimg1));
        recentsDataList.add(new RecentsData("Pantai Mayangkara","Pulau Bawean","Gratis", R.drawable.recentimg2));
        recentsDataList.add(new RecentsData("Wisata Alam Gosari","Gosari, Ujungpangkah","Rp 5.000 - Rp 10.000", R.drawable.recentimg3));
        recentsDataList.add(new RecentsData("Danau Kastoba","Pulau Bawean","Gratis", R.drawable.recentimg4));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Mangrove Mengare","Mengare, Bungah","Rp 5.000 - Rp 10.000", R.drawable.topplace1));
        topPlacesDataList.add(new TopPlacesData("Wisata Setigi","Sekapuk, Panceng","Rp 10.000 - Rp 15.000", R.drawable.topplace2));

        setTopPlacesRecycler(topPlacesDataList);
    }
    
    private void setRecentRecycler(List<RecentsData> recentsDataList){
        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){
        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
    }

}