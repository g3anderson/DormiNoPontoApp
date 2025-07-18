package com.example.dorminoponto.model;

import java.util.ArrayList;
import java.util.List;


public class Usuario {

    public Usuario(){}
    private String nome = "";
    private int idUsuario = 0;
    private List<Local> listaRotasFavoritas = new ArrayList();

    public Usuario (String nomeUsuario){
        this.nome = nomeUsuario;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank() && !nome.isEmpty()) {
            this.nome = nome;
        }
    }
    public void adicionarRotaFavorita(Local rotaFavorita){
        if(rotaFavorita != null){
            listaRotasFavoritas.add(rotaFavorita);
        }
    }
    public void removerRotaFavorita(Local rotaFavorita){
        for (Local rota : listaRotasFavoritas) {
            if(rotaFavorita.equals(rota)){
                listaRotasFavoritas.remove(rota);
            }
        }
    }
}
