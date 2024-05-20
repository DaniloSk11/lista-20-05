package com.lista.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaAlunos alunos = new ListaAlunos();
        float notasClasse = 0;
        int aprovados = 0;
        int reprovados = 0;
        int exame = 0;
        int quantidadeAlunos = 0;
        boolean continuar = true;
        String option;
        

        while (continuar) {
            System.out.print("Insira o número de matrícula: ");
            int matricula = ler.nextInt();
            System.out.print("Insira o nome do aluno: ");
            String nome = ler.next();
            System.out.print("Insira a nota do 1°Bimestre: ");
            float notaBimestre1 = ler.nextFloat();    
            System.out.print("Insira a nota do 2°Bimestre: ");
            float notaBimestre2 = ler.nextFloat();
            if (notaBimestre1 >= 0 && notaBimestre1 <= 10 && notaBimestre2 >= 0 && notaBimestre2 <= 10) {
                float media = (notaBimestre1+notaBimestre2)/2;
                Aluno novoAluno = new Aluno(matricula, nome, notaBimestre1, notaBimestre2,media);
                alunos.addAluno(novoAluno);
                quantidadeAlunos++;
            }else{
                System.out.println("As notas devem ser de 0 a 10!!");
            }
            float media = (notaBimestre1+notaBimestre2)/2;
            System.out.println("Média: "+media);
            notasClasse += media;
            if (media >= 6) {
                aprovados++;
                System.out.println("Aprovado!");
            }else if (media > 4) {
                exame++;
                System.out.println("Exame!");
            }else{
                reprovados++;
                System.out.println("Reprovado!");
            }
            System.out.println("Deseja continuar? [S][N]");
            option = ler.next(); 
            if (option.equals("n")||option.equals("N")) {
                continuar = false;
            }   
            
        }
        System.out.println("Quantidade Alunos: "+quantidadeAlunos+"|Até 4 (Reprovado); Entre 4 e 6 (Exame); De 6 para cima (Aprovado);");
        System.out.println("Quantidade Aprovados: "+aprovados+"\nQuantidade de Exame: "+exame+"\nQuantidade Reprovados: "+reprovados);
        System.out.println("Média da Classe: "+(notasClasse/quantidadeAlunos));
        alunos.selectionSort(alunos, alunos.getSize());
        alunos.exibirLista(alunos);
        ler.close();
        

    }
}
