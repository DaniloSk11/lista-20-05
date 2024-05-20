package com.lista.ex3;

import java.util.ArrayList;

public class ListaAlunos {
ArrayList<Aluno> lista = new ArrayList<>();
    public ListaAlunos(){

    }
    
    public void addAluno(Aluno aluno){
        lista.add(aluno);
    }
    public void addAlunoAt(int index,Aluno aluno){
        lista.set(index, aluno);
    }
    public void removeValor(int index){
        lista.remove(index);
    }
    public int getSize(){
        return lista.size();
    }
    public Aluno getAluno(int index){
        return lista.get(index);
    }
    public String exibirAluno(Aluno aluno){
        return "Matrícula: "+aluno.nMatritula+"|Nome: "+aluno.nome+"|1°Bim: "+aluno.notaBimestre1+"|2°Bim: "+aluno.notaBimestre2+"|Média:"+((aluno.notaBimestre1+aluno.notaBimestre2)/2);
    }

    public void exibirLista(ListaAlunos lista){
        for (Aluno aluno : this.lista) {
            if (aluno.notaBimestre1 >= 6 && aluno.notaBimestre2 >= 6) {
                System.out.println(lista.exibirAluno(aluno)+" Aprovado!");  
            }else{
                System.out.println(lista.exibirAluno(aluno)+" Reprovado!");      
            }
             
        } 
          
    }
    public void selectionSort(ListaAlunos lista, int tamanho){
        int i, j, min;
        Aluno x;
        for (i = 1; i <= tamanho-1; i++) {
            min = i;
            for(j=i+1; j<=tamanho-1;j++){
                if (lista.getAluno(j).media < lista.getAluno(min).media) {
                    min = j;
                }
            }
            x = lista.getAluno(min);
            lista.addAlunoAt(min, lista.getAluno(i));
            lista.addAlunoAt(i,x);
        }

    }
}
