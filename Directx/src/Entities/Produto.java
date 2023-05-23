
package Entities;

public class Produto {
	
	
	private String name;
    private double preco;
    private int quantidade;
    private int codigo;
	
	
	

    public Produto() {
    }

    public Produto(String name, double preco, int quantidade, int codigo) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  
    
    public double getValorTotalEmEstoque() {
        return preco * quantidade;
    }

  

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }
    public void setPrice(double preco) {
        this.preco = preco;
    }

    public void setQuantity(int quantidade) {
        this.quantidade = quantidade;
    }

    public void addProducts(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            + " unidades, Total: $ "
            + String.format("%.2f", getValorTotalEmEstoque());
    }
}
