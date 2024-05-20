package com.lista.utils;


import java.util.ArrayList;


public class Lista {
    ArrayList<Object> lista = new ArrayList<>();
    public Lista(){

    }
    
    public void addValor(Object objeto){
        lista.add(objeto);
    }
    public void removeValor(int index){
        lista.remove(index);
    }
    public int getSize(){
        return lista.size();
    }
    public Object getObjeto(int index){
        return lista.get(index);
    }
    public String exibirObjeto(Object object){
        return object.toString();
    }

    public void exibirLista(Lista lista){
        for (int i = 0; i < lista.getSize(); i++) {
            Object objetoAtual = lista.getObjeto(i);
            System.out.print(lista.exibirObjeto(objetoAtual));
        }
    }
}
