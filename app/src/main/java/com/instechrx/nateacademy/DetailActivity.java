package com.instechrx.nateacademy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    Toolbar toolbar;
    public static final String EXTRA_NAME = "hero_name";
    public static final String EXTRA_PHOTO = "hero_photo";
    public static final String EXTRA_DETAIL = "hero_detail";
    public static final String EXTRA_HARGA = "hero_harga";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //View
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(getIntent().getStringExtra(EXTRA_NAME));
        setSupportActionBar(toolbar);

        //Set icon to toolbar
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnGabung = findViewById(R.id.btnGabung);
        btnGabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // untuk melempar data ke class lain
                Intent a = new Intent(getApplicationContext(), GabungActivity.class);
                startActivity(a);
            }
        });


        ImageView imgKelas = findViewById(R.id.img_photo);
        TextView namaKelas = findViewById(R.id.tv_name);
        TextView detailKelas = findViewById(R.id.tv_detail);
        TextView hargaKelas = findViewById(R.id.tv_harga);

        Glide.with(this).load(getIntent().getIntExtra(EXTRA_PHOTO, 0)).into(imgKelas);
        namaKelas.setText(getIntent().getStringExtra(EXTRA_NAME));
        detailKelas.setText(getIntent().getStringExtra(EXTRA_DETAIL));
        hargaKelas.setText(getIntent().getStringExtra(EXTRA_HARGA));
    }
}
