package com.lista.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaClientes lista = new ListaClientes();
        Scanner read = new Scanner(System.in);
        int id = 1;
        while (id > 0) {
            System.out.println("Insira Id: ");
            id = read.nextInt();
            if (id > 0) {
                System.out.println("Insira Nome: ");
                String nome = read.next();

                System.out.println("Insira Idade: ");
                String idade = read.next();

                System.out.println("Insira Telefone: ");
                String telefone = read.next();

                Cliente cliente = new Cliente(id, nome, idade, telefone);
                lista.addCliente(cliente);

            }
        }
        read.close();
        for (int i = 0; i < lista.getSize(); i++) {
            Cliente clienteAtual = lista.getCliente(i);
            System.out.print(lista.exibirCliente(clienteAtual));
        }
    }
}
