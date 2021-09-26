package view;

import javax.swing.JOptionPane;
import controller.TelefoneController;
import edu.fatec.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila telefone = new Fila();
		TelefoneController TelCont = new TelefoneController();
		int input = 0;
		while (input != 9) {
			input = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções \n1 - Adicionar Telefone \n2 - Listar Telefones \n9 - Sair"));
			
			if (input == 1) {
				String numero = "";
				try {
					numero = JOptionPane.showInputDialog("Digite o numero: ");
					TelCont.inserirLigacao(telefone, numero);
				} catch (Exception e) {

				}
				
			}
			
			if (input == 2) {
				try {
					TelCont.consultaLigacoes(telefone);
				} catch (Exception e) {

				}
				
			}
				
			if (input == 9) {
				System.out.println("Adeus!!!");
			}
			
			if ((input != 1) && (input != 2) && (input != 9)) {
				System.out.println("Operação não é valida!!!");
			}
		}
	}

}
