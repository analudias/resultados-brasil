package com.meusprojetos.resultadosdobrasil.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.meusprojetos.resultadosdobrasil.R;
import com.meusprojetos.resultadosdobrasil.model.Esportes;

import java.util.List;

public class EsportesAdapter extends RecyclerView.Adapter<EsportesAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemEsportes = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.esportes_detalhe, parent, false);
        return new MyViewHolder(itemEsportes);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textEsporte.setText("Futebol");
        holder.imagemEsporte.setImageResource(R.drawable.Football_pictogram);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagemEsporte;
        private TextView textEsporte;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imagemEsporte = itemView.findViewById(R.id.imageEsporte);
            textEsporte = itemView.findViewById(R.id.textEsporte);
        }
    }

}
