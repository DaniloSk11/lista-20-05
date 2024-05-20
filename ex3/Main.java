package com.lista.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaAlunos alunos = new ListaAlunos();

        int quantidadeAlunos;
        boolean continuar = true;
        String option;
        System.out.println("Insira a quantidade de alunos: ");
        quantidadeAlunos = ler.nextInt();

        while (continuar) {
            System.out.println("Insira o número de matrícula: ");
            int matricula = ler.nextInt();
            System.out.println("Insira o nome do aluno: ");
            String nome = ler.nextLine();
            System.out.println("Insira a nota do 1°Bimestre: ");
            float notaBimestre1 = ler.nextFloat();    
            System.out.println("Insira a nota do 2°Bimestre: ");
            float notaBimestre2 = ler.nextFloat();
            Aluno novoAluno = new Aluno(matricula, nome, notaBimestre1, notaBimestre2);
            alunos.addAluno(novoAluno);
            quantidadeAlunos++;
            System.out.println("Deseja continuar? [S][N]");
            option = ler.nextLine();
            if (option.equals("N")) {
                continuar = false;
            }
        }
        for (Aluno a : alunos.lista) {
            
        }
        
    }
}
