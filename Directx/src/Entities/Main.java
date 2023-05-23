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
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("--- Selecione uma opera��o ---\n" +
                "|   Op��o 1 - Criar conta\n" +
                "|   Op��o 2 - Cadastrar\n" +
                "|   Op��o 3 - listar\n" +
                "Digite o n�mero da opera��o desejada:"));
        
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
                JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                operacoes(); // Chamar novamente o m�todo para selecionar uma opera��o v�lida
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

        // Definir o pre�o
        String precoString = JOptionPane.showInputDialog("Pre�o:");
        double preco = Double.parseDouble(precoString);
        produto.setPreco(preco);

        // Definir a quantidade
        String quantidadeString = JOptionPane.showInputDialog("Quantidade:");
        int quantidade = Integer.parseInt(quantidadeString);
        produto.setQuantidade(quantidade);
        
        
        String codigoString = JOptionPane.showInputDialog("C�digo:");
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