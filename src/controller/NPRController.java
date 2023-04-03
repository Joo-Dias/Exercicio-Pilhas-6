package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class NPRController {

	public NPRController() {
		
	}
	
	// Inicializando a pilha
	Pilha pilha = new Pilha();
	
	public void insereValor(Pilha p, int valor) {
		p.push(valor);
	}
	
	public int npr(Pilha p, String op) throws Exception{
		int v1 = p.pop();
		int v2 = p.pop();
		int resultado = 0;
		switch (op) {
        case "+":
            return resultado = v1 + v2;
        case "-":
            return resultado = v1 - v2;
        case "*":
            return resultado = v1 * v2;
        case "/":
            return resultado = v1 / v2;
        default:
            throw new IllegalArgumentException("Operador inválido: " + op);
    }
	}

}
