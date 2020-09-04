package com.meusprojetos.resultadosdobrasil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerEsportes;
    private List<Esportes> esportes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageFutebol = findViewById(R.id.imageFutebol);

        imageFutebol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            //instanciando a intent
            Intent intent = new Intent(getApplicationContext(), PrincipalFutebolActivity.class);

            //passando os dados da ativity
            intent.putExtra("nome_partida", "Futebol - Seleção Principal");
            intent.putExtra("futebol_brasil", "Brasil");
            intent.putExtra("futebol_adversario", "Chile");
            intent.putExtra("tempo_futebol", "1º tempo");

            startActivity(intent);

            }
        });
    }
}
