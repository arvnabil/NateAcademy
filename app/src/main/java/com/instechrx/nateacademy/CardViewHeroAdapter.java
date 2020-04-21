package com.instechrx.nateacademy;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewHeroAdapter extends RecyclerView.Adapter<CardViewHeroAdapter.CardViewViewHolder>{
    private ArrayList<Hero> listHero;
    public CardViewHeroAdapter(ArrayList<Hero> list) {
        this.listHero = list;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Hero data);
    }
    private CardViewHeroAdapter.OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(CardViewHeroAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_hero, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(450, 600))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Detail " +
                        listHero.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                onItemClickCallback.onItemClicked(listHero.get(holder.getAdapterPosition()));
            }
        });
        holder.btnGabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Gabung " +
                        listHero.get(holder.getAdapterPosition()).getName() + "Berhasil!", Toast.LENGTH_SHORT).show();
                Intent a = new Intent(v.getContext(), GabungActivity.class);
                v.getContext().startActivity(a);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnDetail, btnGabung;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
            btnGabung = itemView.findViewById(R.id.btn_set_gabung);
        }
    }
}