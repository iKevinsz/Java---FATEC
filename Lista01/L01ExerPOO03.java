/*
3) [POO-003] Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número 
tipo double. Após verifique se o número é positivo, negativo ou zero. As verificações devem ser feitas
através de métodos.
Entrada:                    Saída:
Entre com um número: -1,48   O número -1.48 é negativo.
Entre com um número: 3,14    O número 3.14 é positivo.
Entre com um número: 0       O número 0.0 é zero.
Referências: POO-001 e POO-002
 
 */

import java.util.Scanner;

public class L01ExerPOO03 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		double valor;
		int contador = 0;
		
		do {
			
			System.out.print("Entre com um numero: ");
			valor = leia.nextDouble();
			
			if ( isZero ( valor ) ) {
				
				System.out.println("O numero " + valor + " eh zero." );
			
			} else {
				
				System.out.println("O numero " + valor + " eh " + 
					( isPositivo ( valor ) ? "positivo." : "negativo." ) );
			}
			contador++;
		
		} while ( contador < 3 );
	}
	static boolean isZero ( double numero ) {

		return numero == 0;
	}
	static boolean isPositivo ( double numero ) {

		return numero > 0;
	}
}
