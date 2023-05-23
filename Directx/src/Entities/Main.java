package Entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Programa.Conta;

public class Main {
	private static List<Produto> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {
        operacoes();
    }
    
    public static void operacoes() {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("--- Selecione uma operação ---\n" +
                "|   Opção 1 - Criar conta\n" +
                "|   Opção 2 - Cadastrar\n" +
                "|   Opção 3 - listar\n" +
                "Digite o número da operação desejada:"));
        
        switch (operacao) {
            case 1:
                criarConta();
                break;
            case 2:
            cadastrar();
                break;
            case 3:
            	listar();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                operacoes(); // Chamar novamente o método para selecionar uma operação válida
                break;
        }
    }
    
    public static void criarConta() {
        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog("Nome:"));
        JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso");
        operacoes();
    }
    
    public static void cadastrar() {
    	
    	
    	Produto produto = new Produto();
        produto.setName(JOptionPane.showInputDialog("Nome:"));

        // Definir o preço
        String precoString = JOptionPane.showInputDialog("Preço:");
        double preco = Double.parseDouble(precoString);
        produto.setPreco(preco);

        // Definir a quantidade
        String quantidadeString = JOptionPane.showInputDialog("Quantidade:");
        int quantidade = Integer.parseInt(quantidadeString);
        produto.setQuantidade(quantidade);
        
        
        String codigoString = JOptionPane.showInputDialog("Código:");
        int codigo = Integer.parseInt(codigoString);
        produto.setCodigo(codigo);
        
        listaProdutos.add(produto);
        
        JOptionPane.showMessageDialog(null, "Produto Registrado");
        operacoes();
    }
    
    public static void listar() {
        if (listaProdutos.size() > 0) {
            System.out.println("Lista de produtos cadastrados:");
            for (Produto produto : listaProdutos) {
            	JOptionPane.showMessageDialog(null,produto);
            }
        } else {
        	JOptionPane.showMessageDialog(null, "Nenhum Registrado");
        }
}
}