package com.instechrx.nateacademy;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import androidx.appcompat.widget.Toolbar;

public class AboutActivity extends AppCompatActivity {

    Toolbar toolbar;
    public final static String EXTRA_NAME = "Name";
    public final static String EXTRA_EMAIL = "Email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_about);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //View
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(" About Me");
        setSupportActionBar(toolbar);

        //Set icon to toolbar
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView imgProfile = findViewById(R.id.img_about_photo);
        TextView tvName = findViewById(R.id.tv_about_name);
        TextView tvEmail = findViewById(R.id.tv_about_email);

        imgProfile.setImageDrawable(getDrawable(R.drawable.nabil));
        Glide.with(this)
                .load(R.drawable.nabil)
                .into(imgProfile);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);

        tvName.setText(name);
        tvEmail.setText(email);

    }
}
