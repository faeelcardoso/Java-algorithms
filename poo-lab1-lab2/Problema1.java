package edu.newton.ldp.u2.lab2;

import javax.swing.JOptionPane;

/**
 * Problema 1, N�meros Primos
 * @author Raphael Cardoso
 * Data: 03/09/2021
 * 
 * Descri��o: Esse programa ir� retornar, pelo n�mero digitado pelo usu�rio, se � ou n�o um n�mero primo.
 * Ir� utilizar 1 fun��o, fora o Main.
 * 
 * Fun��es() {
 * 	isPrime: recebe o n�mero digitado e faz uma l�gica simples para saber se o n�mero � primo ou n�o,
 * 	retornando boolean, falso ou verdadeiro.
 * }
 * 
 * Libs: JOptionPane
 */

public class Problema1 {

	public static void main(String[] args) {
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Type here a number: "));
		
		var result = isPrime(number);
		
		JOptionPane.showMessageDialog(null, result?"This is a prime number.":"This isn't a prime number.");
	}
	
	private static boolean isPrime(int number) {
		// Primo: somente � divis�vel por 1 e ele mesmo
		
		// FOR: come�o o contator do 2, para j� cortar o 1 e termino o for antes do pr�prio n�mero
		// ou seja, todas as possibilidades de ser primo j� est�o fora
		for(int i = 2; i < number; i++) {
			if(number % i == 0) { // se o resto aqui for igual a 0, n�o � primo
				return false;
			}
		}
		return true;
	}
}