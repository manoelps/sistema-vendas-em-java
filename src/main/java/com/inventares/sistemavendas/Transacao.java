package com.inventares.sistemavendas;

/**
 * classe que representa a transacao com os seus atributos e get e set
 * @author manoelps
 */
public class Transacao {
    
    //Declaracao dos Atributos da classe
    private int id;
    private double valor;
    
    //Criando os metodos set e get
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }    
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }    
    
}
