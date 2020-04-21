package com.instechrx.nateacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class GabungActivity extends AppCompatActivity {

    Button btn_set_back, exit;
    ImageView gifsuccess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gabung);

        kenalan();
        ketikaButtonDipencet();

        gifsuccess = (ImageView) findViewById(R.id.gifsuccess);

        Glide.with(GabungActivity.this)
                .load(R.drawable.success)
                .into(gifsuccess);
    }

    private void kenalan() {
        exit = findViewById(R.id.exit);
        btn_set_back = findViewById(R.id.btn_set_back);
    }

    private void ketikaButtonDipencet() {
        btn_set_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // untuk melempar data ke class lain
                Intent a = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(a);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                finish();
                System.exit(0);
            }
        });
    }
}
