package com.example.tugaspertemuan4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NovelAdapter extends RecyclerView.Adapter<NovelAdapter.NovelViewHolder>{
    private ArrayList<Novel> dataList;
    public NovelAdapter(ArrayList<Novel> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public NovelAdapter.NovelViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_novel, parent, false);
        return new NovelViewHolder(view);
    }
    public void onBindViewHolder(NovelViewHolder holder, int position) {
        holder.Gambar.setImageResource(dataList.get(position).getGambar());
        holder.txtJudul.setText(dataList.get(position).getJudul());
        holder.txtGenre.setText(dataList.get(position).getGenre());
        holder.txtView.setText(dataList.get(position).getView());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class NovelViewHolder extends RecyclerView.ViewHolder{
        private TextView txtJudul, txtGenre, txtView;
        private ImageView Gambar;
        public NovelViewHolder(View NovelView) {
            super(NovelView);
            Gambar = (ImageView)
                    NovelView.findViewById(R.id.gambar_novel);
            txtJudul = (TextView)
                    NovelView.findViewById(R.id.txt_judul);
            txtGenre = (TextView)
                    NovelView.findViewById(R.id.txt_genre);
            txtView = (TextView)
                    NovelView.findViewById(R.id.txt_view);
        }
    }
}
