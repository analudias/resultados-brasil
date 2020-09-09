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

    private List<Esportes> listaEsportes;

    public EsportesAdapter(List<Esportes> list) {
        this.listaEsportes = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemEsportes = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.esportes_detalhe, parent, false);
        return new MyViewHolder(itemEsportes);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Esportes esportes = listaEsportes.get(position);
        holder.textEsporte.setText(esportes.getNomeEsporte());
        holder.imagemEsporte.setImageResource(esportes.getImagemEsporte());
    }

    @Override
    public int getItemCount() {
        return listaEsportes.size();
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
