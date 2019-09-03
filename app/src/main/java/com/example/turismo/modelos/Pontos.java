package com.example.turismo.modelos;

import android.widget.ImageView;

public class Pontos {

    private String nome;
    private String distancia;
    private Integer imagen;

    public Pontos(String nome, String distancia, Integer imagen) {
        this.nome = nome;
        this.distancia = distancia;
        this.imagen = imagen;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }
}
