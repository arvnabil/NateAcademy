package com.instechrx.nateacademy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static long time;
    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();
    Toolbar toolbar;
    private String title;

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        //View
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(" Nate Academy");
        setSupportActionBar(toolbar);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);
        listHeroAdapter.setOnItemClickCallback(new ListHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                moveToDetailActivity(data);
            }
        });
    }

    private void showRecyclerCardView(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        CardViewHeroAdapter cardViewHeroAdapter = new CardViewHeroAdapter(list);
        rvHeroes.setAdapter(cardViewHeroAdapter);

        cardViewHeroAdapter.setOnItemClickCallback(new CardViewHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                moveToDetailActivity(data);
            }
        });
    }

    private void showRecyclerAbout() {
        Intent about = new Intent(MainActivity.this, AboutActivity.class);
        about.putExtra(AboutActivity.EXTRA_NAME, "Nabil");
        about.putExtra(AboutActivity.EXTRA_EMAIL, "nabilalcha58@gmail.com");
        startActivity(about);
    }

    private void moveToDetailActivity(Hero data) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_NAME, data.getName());
        intent.putExtra(DetailActivity.EXTRA_DETAIL, data.getDetail());
        intent.putExtra(DetailActivity.EXTRA_PHOTO, data.getPhoto());
        intent.putExtra(DetailActivity.EXTRA_HARGA, data.getHarga());
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = " Nate Academy";
                showRecyclerList();
                break;

            case R.id.account:
                title = " Nate Academy";
                showRecyclerAbout();
//                Intent intentku = new Intent(MainActivity.this, AboutActivity.class);
//                startActivity(intentku);
                break;

            case R.id.action_cardview:
                title = " Nate Academy";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

    // exit
    @Override
    public void onBackPressed() {

        if (time + 2000 > System.currentTimeMillis()) { //2000 in miliseconds -- 2 seconds
            super.onBackPressed();
            moveTaskToBack(true);
            finish();
            System.exit(0);
        } else {
            Toast.makeText(MainActivity.this, "Klik kembali lagi untuk Keluar", Toast.LENGTH_SHORT).show();
        }
        time = System.currentTimeMillis();
    }

}
