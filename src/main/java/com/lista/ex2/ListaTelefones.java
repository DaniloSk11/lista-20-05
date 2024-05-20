package com.lista.ex2;

import java.util.ArrayList;


public class ListaTelefones {
    ArrayList<String> telefones = new ArrayList<>();
    public ListaTelefones(){

    }
    
    public void addTelefone(String objeto){
        telefones.add(objeto);
    }
    public void removePosição(int index){
        telefones.remove(index);
    }
    public int getSize(){
        return telefones.size();
    }
    public String getTelefone(int index){
        return telefones.get(index);
    }
    public String exibirTelefone(String String){
        return String.toString();
    }

    public void exibirLista(ListaTelefones telefones){
        for (int i = 0; i < telefones.getSize(); i++) {
            String telefoneAtual = telefones.getTelefone(i);
            //[0] - 62984564656
            System.out.println("["+i+"] - "+telefones.exibirTelefone(telefoneAtual));
        }
    }
    
}
