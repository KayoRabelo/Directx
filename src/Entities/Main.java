
package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        SistemaVendas sistema = new SistemaVendas();

        Produto p1 = new Produto(1, "Arroz", 10.0, 50);
        Produto p2 = new Produto(2, "Feijão", 8.0, 30);
        Produto p3 = new Produto(3, "Macarrão", 5.0, 20);

        sistema.cadastrarProduto(p1);
        sistema.cadastrarProduto(p2);
        sistema.cadastrarProduto(p3);

        Cliente c1 = new Cliente(1, "Maria", "Rua 1, 100", "111111111");
        Cliente c2 = new Cliente(2, "João", "Rua 2, 200", "222222222");

        sistema.cadastrarCliente(c1);
        sistema.cadastrarCliente(c2);

        // Exibir os produtos disponíveis
        List<Produto> listaProdutos = sistema.getProdutos();
        System.out.println("Produtos disponíveis:");
        for (Produto produto : listaProdutos) {
            System.out.println("Código: " + produto.getCodigo() + 
                               ", Nome: " + produto.getNome() + 
                               ", Preço: " + produto.getPreco() + 
                               ", Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
        }

        // Criar uma nova venda
        List<Produto> produtosVenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite o código do produto que deseja comprar (ou 0 para finalizar): ");
            int codigoProduto = scanner.nextInt();
            if (codigoProduto == 0) {
                break;
            }
            Produto produto = sistema.buscarProdutoPorCodigo(codigoProduto);
            if (produto == null) {
                System.out.println("Produto não encontrado.");
            } else {
                System.out.print("Digite a quantidade que deseja comprar: ");
                int quantidade = scanner.nextInt();
                if (quantidade <= 0) {
                    System.out.println("Quantidade inválida.");
                } else if (quantidade > produto.getQuantidadeEmEstoque()) {
                    System.out.println("Não há estoque suficiente desse produto.");
                } else {
                    produtosVenda.add(new Produto(produto.getCodigo(), produto.getNome(), produto.getPreco(), quantidade));
                }
            }
        }
        scanner.close();
        if (produtosVenda.isEmpty()) {
            System.out.println("Nenhum produto selecionado.");
            return;
        }
        Venda venda = new Venda(sistema.getProximoNumeroVenda(), c1, produtosVenda);
        sistema.realizarVenda(venda);
        System.out.println("Venda realizada com sucesso.");

     // Exibir o estoque atualizado dos produtos
        System.out.println("Estoque atualizado dos produtos:");
        listaProdutos = sistema.getProdutos();
        for (Produto produto : listaProdutos) {
            System.out.println("Código: " + produto.getCodigo() + 
                               ", Nome: " + produto.getNome() + 
                               ", Preço: " + produto.getPreco() + 
                               ", Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
        }
    }
}


