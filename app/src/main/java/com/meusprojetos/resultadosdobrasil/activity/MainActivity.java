package com.meusprojetos.resultadosdobrasil.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.meusprojetos.resultadosdobrasil.R;
import com.meusprojetos.resultadosdobrasil.adapter.EsportesAdapter;
import com.meusprojetos.resultadosdobrasil.model.Esportes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerEsportes;
    private List<Esportes> listaEsportes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerEsportes = findViewById(R.id.recyclerEsportes);

        this.criarEsportes();

        //Define o layout
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerEsportes.setLayoutManager(layoutManager);


        //Define o adaptador
        EsportesAdapter esportesAdapter = new EsportesAdapter(listaEsportes);
        recyclerEsportes.setAdapter(esportesAdapter);

    }

    public void criarEsportes(){

        Esportes esportes = new Esportes("Futebol", R.drawable.football_pictogram);
        this.listaEsportes.add(esportes);

        esportes = new Esportes("Atletismo", R.drawable.athletics_pictogram);
        this.listaEsportes.add(esportes);

        esportes = new Esportes("Badminton", R.drawable.badminton_pictogram);
        this.listaEsportes.add(esportes);

        esportes = new Esportes("Baseball", R.drawable.baseball_pictogram);
        this.listaEsportes.add(esportes);

        esportes = new Esportes("Basquete 3x3", R.drawable.basketball_3x3_pictogram);
        this.listaEsportes.add(esportes);

        esportes = new Esportes("Handebol", R.drawable.handball_pictogram);
        this.listaEsportes.add(esportes);

        esportes = new Esportes("Tênis", R.drawable.tennis_pictogram);
        this.listaEsportes.add(esportes);

        esportes = new Esportes("Vôlei", R.drawable.volleyball_indoor_pictogram);
        this.listaEsportes.add(esportes);


    }
}
