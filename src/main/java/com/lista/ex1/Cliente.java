package com.lista.ex1;

public class Cliente {
    Integer id;
    String nome;
    String idade;
    String telefone;

    public Cliente(Integer id, String nome, String idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        
    }

    //getters
    public Integer getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getIdade(){
        return idade;
    }
    public String getTelefone(){
        return telefone;
    }

    //setters
    public void setId(Integer id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
