package edu.newton.ldp.u5.lab.ex3;

import javax.swing.JOptionPane;

public class CpfInvalido extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CpfInvalido(String operacao) {
		super("Me desculpe, cpf inv�lido!");
		
		if(operacao == "Error1") {
			JOptionPane.showMessageDialog(null, "CPF n�o pode ter sequ�ncia de n�meros iguais e deve ser 11 n�meros.");
		}
		
		if(operacao == "Letters") {
			JOptionPane.showMessageDialog(null, "CPF n�o tem letra amigo");
		}
		
		if(operacao == "Error2") {
			JOptionPane.showMessageDialog(null, "N�mero n�o pode ser menor que 0 ou maior que 9");
		}
		
		if(operacao == "Error3") {
			JOptionPane.showMessageDialog(null, "C�digo 1 inv�lido!");
		}
		
		if(operacao == "Error4") {
			JOptionPane.showMessageDialog(null, "C�digo 2 inv�lido!");
		}
	}
}
