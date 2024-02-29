/*
1) [POO-001] Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é
positivo ou não. A verificação deve ser feita através de um método que receba um valor (parâmetro de 
entrada) e informe se ele é positivo ou negativo através de um retorno do tipo boolean. Assuma o número 
zero como positivo. Declare como: boolean isPositivo ( double num ).
* Entrada:                    Saída:
Entre com um número: -1,48    O número -1.48 é negativo.
Entre com um número: 3,14     O número 3.14 é positivo.
Entre com um número: 0        O número 0.0 é positivo.
 */

import java.util.Scanner;

public class L01ExerPOO01 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero;
		int contador = 0;
		
		do{
				System.out.print ("Digite um numero: ");
				numero = leia.nextDouble();
				
				if (isPositivo (numero)){
					System.out.println ("O numero " + numero + " eh positivo.");
				}else {
					System.out.println ("O numero " + numero + " eh negativo.");
				}
				contador++;
		} while (contador <= 3);
	}
	static boolean isPositivo (double numero){
	
		return numero >= 0;
	}
}

