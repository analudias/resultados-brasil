package com.meusprojetos.resultadosdobrasil.model;

import android.widget.ImageView;

public class Esportes {

    private String nomeEsporte;
    private int imagemEsporte;

    public Esportes() {
    }

    public Esportes(String nomeEsporte, int imagemEsporte) {
        this.nomeEsporte = nomeEsporte;
        this.imagemEsporte = imagemEsporte;
    }

    public String getNomeEsporte() {
        return nomeEsporte;
    }

    public void setNomeEsporte(String nomeEsporte) {
        this.nomeEsporte = nomeEsporte;
    }

    public int getImagemEsporte() {
        return imagemEsporte;
    }

    public void setImagemEsporte(int imagemEsporte) {
        this.imagemEsporte = imagemEsporte;
    }
}
