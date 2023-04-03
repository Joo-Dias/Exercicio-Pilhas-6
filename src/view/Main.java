package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaint.Pilha;
import controller.NPRController;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Inicializando a pilha
		Pilha pilha = new Pilha();
		
		// Instanciando a classe controller
		NPRController npr = new NPRController();
		
		// Criando a variável que irá receber o valor
		int valor;
		
		// Criando a variável que ira receber a operação
		String operador;
		
		for (int i = 0; i < 2; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
			npr.insereValor(pilha, valor);
		}
		
		operador = JOptionPane.showInputDialog("Digite um operador: ");
		System.out.println(npr.npr(pilha, operador));

	}

}
