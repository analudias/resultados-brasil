package com.meusprojetos.resultadosdobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrincipalFutebolActivity extends AppCompatActivity {

    private TextView textBrasil;
    private TextView textAdversario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_futebol);

        textBrasil = findViewById(R.id.textBrasil);
        textAdversario = findViewById(R.id.textAdversario);

        Bundle dados = getIntent().getExtras();
        String principal = dados.getString("futebol_brasil");
        String adversario = dados.getString("futebol_advesario");

        textBrasil.setText("Brasil");
        textAdversario.setText("Chile");
    }
}
