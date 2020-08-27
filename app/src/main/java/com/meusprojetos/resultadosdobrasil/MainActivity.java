package com.meusprojetos.resultadosdobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageFutebol;

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
            intent.putExtra("futebol_brasil", "Brasil");
            intent.putExtra("futebol_adversario", "Chile");

            startActivity(intent);

            }
        });
    }
}
