package Entities;

import java.util.List;

public class Venda {
	 private int codigo;
	    private Cliente cliente;
	    private List<Produto> produtos;
	    private double valorTotal;
	    private int numero;

	    public Venda(int codigo, Cliente cliente, List<Produto> produtos) {
	        this.codigo = codigo;
	        this.cliente = cliente;
	        this.produtos = produtos;
	        this.valorTotal = calcularValorTotal();
	    }

	  

		// getters e setters
	    public int getCodigo() {
	        return codigo;
	    }
	    public int getNumero() {
	        return numero;
	     }

	     public void setNumero(int numero) {
	        this.numero = numero;
	     }
	  

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }

	    public List<Produto> getProdutos() {
	        return produtos;
	    }

	    public void setProdutos(List<Produto> produtos) {
	        this.produtos = produtos;
	    }

	    public double getValorTotal() {
	        return valorTotal;
	    }

	    public void setValorTotal(double valorTotal) {
	        this.valorTotal = valorTotal;
	    }

	    private double calcularValorTotal() {
	        double total = 0;
	        for (Produto produto : produtos) {
	            total += produto.getPreco();
	        }
	        return total;
	    }

}
