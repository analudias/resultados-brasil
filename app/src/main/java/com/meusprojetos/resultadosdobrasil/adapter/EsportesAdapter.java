package com.meusprojetos.resultadosdobrasil.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.meusprojetos.resultadosdobrasil.model.Esportes;

import java.util.List;

public class EsportesAdapter extends RecyclerView.Adapter<EsportesAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagemEsporte;
        private TextView textEsporte;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
