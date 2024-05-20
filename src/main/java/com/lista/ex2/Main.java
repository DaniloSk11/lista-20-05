package com.lista.ex2;

import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaTelefones telefones = new ListaTelefones();
        boolean sair = false;
        while (sair != true) {
            String option;
            System.out.println("Escolha uma opção:\n(a) adicionar telefone;\n(r) remover telefone;\n(l) listar telefones;\n(s) sair.");
            option = ler.nextLine();

                if (option.equals("a")) {
                    System.out.println("Insira novo telefone: ");
                    String telefoneNovo = ler.nextLine();
                    telefones.addTelefone(telefoneNovo);
                }else if (option.equals("r")) {
                    System.out.println("Insira a posição do telefone a ser removido: ");
                    int index = ler.nextInt();
                    telefones.removePosição(index);
                }else if (option.equals("l")) {
                    telefones.exibirLista(telefones);                    
                }else if(option.equals("s")){
                    sair = true;
                }else{
                    System.err.println("OPÇÕES INVÁLIDAS!!");
                }
                    
        }
        ler.close();
    }
}
