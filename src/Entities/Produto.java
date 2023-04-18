package Entities;

public class Produto {
	 	
	    private int codigo;
	    private String nome;
	    private double preco;
	    private int quantidadeEmEstoque;

	    public Produto(int string, String nome, double preco, int quantidadeEmEstoque) {
	        this.codigo = string;
	        this.nome = nome;
	        this.preco = preco;
	        this.quantidadeEmEstoque = quantidadeEmEstoque;
	    }

	    // getters e setters
	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public int getQuantidadeEmEstoque() {
	        return quantidadeEmEstoque;
	    }

	    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
	        this.quantidadeEmEstoque = quantidadeEmEstoque;
	    }
	}


