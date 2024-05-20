package com.lista.ex3;

public class Aluno {
    int nMatritula;
    String nome;
    float notaBimestre1;
    float notaBimestre2;
    
    public Aluno(int nMatritula, String nome, float notaBimestre1, float notaBimestre2) {
        this.nMatritula = nMatritula;
        this.nome = nome;
        this.notaBimestre1 = notaBimestre1;
        this.notaBimestre2 = notaBimestre2;
    }

    public int getnMatritula() {
        return nMatritula;
    }

    public void setnMatritula(int nMatritula) {
        this.nMatritula = nMatritula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaBimestre1() {
        return notaBimestre1;
    }

    public void setNotaBimestre1(float notaBimestre1) {
        this.notaBimestre1 = notaBimestre1;
    }

    public float getNotaBimestre2() {
        return notaBimestre2;
    }

    public void setNotaBimestre2(float notaBimestre2) {
        this.notaBimestre2 = notaBimestre2;
    }
    
}
