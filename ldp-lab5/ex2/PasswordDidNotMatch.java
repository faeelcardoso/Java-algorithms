package edu.newton.ldp.u5.lab.ex2;

import javax.swing.JOptionPane;

public class PasswordDidNotMatch extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PasswordDidNotMatch(Integer valor, String operacao) {
		super("I'm sorry, password didn't match.");
		
		if(operacao == "Op1") {
			JOptionPane.showMessageDialog(null, "Tamanho m�nimo 8 e tamanho m�ximo 12. Tente novamente.");
		}
		
		if(operacao == "Op2") {
			JOptionPane.showMessageDialog(null, "M�nimo uma letra mai�scula. Tente novamente.");
		}
		
		if(operacao == "Op3") {
			JOptionPane.showMessageDialog(null, "M�nimo um d�gito (0-9). Tente novamente.");
		}
		
		if(operacao == "Op4") {
			JOptionPane.showMessageDialog(null, "M�nimo um dos s�mbolos (!@#?). Tente novamente.");
		}
		
		if(operacao == "Op5") {
			JOptionPane.showMessageDialog(null, "N�o pode haver repeti��es. Tente novamente.");
		}
		
		if(operacao == "Op6") {
			JOptionPane.showMessageDialog(null, "N�o pode haver espa�os. Tente novamente.");
		}
	}
}
