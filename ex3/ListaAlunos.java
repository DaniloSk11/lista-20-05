package com.lista.ex3;

import java.util.ArrayList;

public class ListaAlunos {
ArrayList<Aluno> lista = new ArrayList<>();
    public ListaAlunos(){

    }
    
    public void addAluno(Aluno aluno){
        lista.add(aluno);
    }
    public void removeValor(int index){
        lista.remove(index);
    }
    public int getSize(){
        return lista.size();
    }
    public Object getAluno(int index){
        return lista.get(index);
    }
    public String exibirAluno(Object object){
        return object.toString();
    }

    public void exibirLista(ListaAlunos lista){
        for (int i = 0; i < lista.getSize(); i++) {
            Object objetoAtual = lista.getAluno(i);
            System.out.print(lista.exibirAluno(objetoAtual));
        }
    }
}
