package com.meusprojetos.resultadosdobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrincipalFutebolActivity extends AppCompatActivity {

    private TextView textBrasil;
    private TextView textAdversario;
    private TextView textTituloEsporte;
    private TextView textTempoPartida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_futebol);

        textTituloEsporte = findViewById(R.id.textTituloEsporte);
        textTempoPartida = findViewById(R.id.textTempoPartida);
        textBrasil = findViewById(R.id.textBrasil);
        textAdversario = findViewById(R.id.textAdversario);

        Bundle dados = getIntent().getExtras();
        String tituloPartida = dados.getString("nome_partida");
        String principal = dados.getString("futebol_brasil");
        String adversario = dados.getString("futebol_advesario");
        String tempoPartida = dados.getString("tempo_partida");

        textTituloEsporte.setText("Futebol - Seleção Principal");
        textTempoPartida.setText("1º Tempo");
        textBrasil.setText("Brasil");
        textAdversario.setText("Chile");
    }
}
