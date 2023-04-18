package Entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	 private List<ItemVenda> itens;
	    private double valorTotal;

	    public Carrinho() {
	        this.itens = new ArrayList<>();
	        this.valorTotal = 0;
	    }

	    public void adicionarItem(ItemVenda item) {
	        itens.add(item);
	        valorTotal += item.getValorTotalItem();
	    }

	    public void removerItem(int index) {
	        ItemVenda item = itens.get(index);
	        itens.remove(index);
	        valorTotal -= item.getValorTotalItem();
	    }

	    // getters e setters
	    public List<ItemVenda> getItens() {
	        return itens;
	    }

	    public void setItens(List<ItemVenda> itens) {
	        this.itens = itens;
	    }

	    public double getValorTotal() {
	        return valorTotal;
	    }

	    public void setValorTotal(double valorTotal) {
	        this.valorTotal = valorTotal;
	    }

}
