package com.example.holdtrav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {
    ImageView pindahActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        pindahActivity = findViewById(R.id.button);
        pindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemap = new Intent(DetailsActivity.this,MapsActivity.class);
                startActivity(pindahkemap);
            }
        });
    }
}