package com.inventares.sistemavendas;

/**
 * Classe para efetuar a venda, esta herda os atributos da classe transacao
 * @author manoelps
 */
public class Venda extends Transacao {
    
    //Declaracao dos atributos da classe venda
    private String produto;
    private int quantidade;
    private double desconto = 0;
    
    //Criando os metodos set e get
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }    
    
    // Criando o metodo de calcular o total da venda com a aplicaçao de desconto
    public double calcularTotalVenda() {
        
        double totalCompra = this.getValor() * this.quantidade;
        
        if(this.desconto != 0){
            totalCompra = totalCompra - (totalCompra * (desconto/100));
        }
        
        return totalCompra;
    }

    //foi sobrescrito  o metodo toString() para montar o texto personalizado das informacoes da venda
    @Override
    public String toString() {
        return "ID: " + this.getId() + "\nProduto: " + this.produto + "\nValor Unitário R$: " +
                this.getValor() + "\nQuantidade: " + this.quantidade +"\nDesconto aplicado (%): " +
                this.desconto + "\nValor total R$: " + calcularTotalVenda();
    }    
}
