package Entities;

public class ItemVenda {
	private Produto produto;
    private int quantidade;
    private double valorTotalItem;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotalItem = produto.getPreco() * quantidade;
    }

    // getters e setters
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

}
