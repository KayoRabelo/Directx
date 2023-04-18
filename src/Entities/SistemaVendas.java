
package Entities;


import java.util.ArrayList;
import java.util.List;



public class SistemaVendas {
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Venda> vendas;
    private int contadorVendas; // contador de vendas

    public SistemaVendas() {
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendas = new ArrayList<>();
        this.contadorVendas = 0; // inicializa o contador de vendas em 0
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public int getProximoNumeroVenda() {
        return contadorVendas + 1;
    }

    public Produto buscarProdutoPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public void realizarVenda(Venda venda) {
        venda.setNumero(contadorVendas + 1); // define o número da venda como o valor do contador de vendas incrementado em 1
        vendas.add(venda);
        contadorVendas++; // incrementa o contador de vendas em 1
        Cliente cliente = venda.getCliente();
        Carrinho carrinho = new Carrinho();
        for (Produto produto : venda.getProdutos()) {
            int quantidade = produto.getQuantidadeEmEstoque();
            produto.setQuantidadeEmEstoque(quantidade - 1);
            ItemVenda item = new ItemVenda(produto, 1);
            carrinho.adicionarItem(item);
        }
        venda.setValorTotal(carrinho.getValorTotal());
    }

    // getters e setters
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}