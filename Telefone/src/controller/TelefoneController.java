package controller;

import edu.fatec.Fila;

public class TelefoneController {
	public void inserirLigacao(Fila f, String numeroTelefone) {
		f.adicionarFila(numeroTelefone);
	}

	public void consultaLigacoes(Fila f) throws Exception {
		if (f.isEmpty()) {
			throw new Exception("Não há elementos na fila");
		} else {
			for (int i = 0; i < f.size(); i++) {
				System.out.println("Telefone :" + f.removerFila());
			}
		}
	}
	
}
