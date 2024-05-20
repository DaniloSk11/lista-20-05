package com.lista.ex1;


import java.util.ArrayList;

public class ListaClientes {
    ArrayList<Cliente> lista = new ArrayList<Cliente>();
    
    public ListaClientes(){
        
    }

    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void addCliente(Cliente cliente) {
        lista.add(cliente);
    }

    public Cliente getCliente(int posicao){
        return lista.get(posicao);
    }

    public String exibirCliente(Cliente cliente){
        return "-----------------------\n"+"[Id: "+cliente.id+"] [Nome: "+cliente.nome+"] [Idade: "+cliente.idade+"] [Telefone: "+cliente.telefone+"]\n" ;
    }

    public Integer getSize(){
        return lista.size();
    }
}
