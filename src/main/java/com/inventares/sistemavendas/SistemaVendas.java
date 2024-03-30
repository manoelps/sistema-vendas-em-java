package com.inventares.sistemavendas;

/**
 * Sistema de vendas
 * @author manoelps
 */
public class SistemaVendas {

    public static void main(String[] args) {
        System.out.println("-----------SISTEMA DE VENDAS----------");
        
        //instancio a classe venda
        Venda venda = new Venda();
        
        //seto o ID ao produto
        venda.setId(100);
        
        //seto o nome do produto
        venda.setProduto("Camisa");
        
        //seto o valor do produto
        venda.setValor(80.0);
        
        //seto a quantidade de produtos
        venda.setQuantidade(5);
        
        //seto qual será o desconto aplicado na compra
        venda.setDesconto(25);
        
        //exibo a venda        
        System.out.println(venda);        
    }
}
