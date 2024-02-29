/*
 
4) [POO-004] Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo 
Grau. O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’. Crie um método que receba três valores, 
'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por 
'b² - 4ac'.
Entrada:            Saída:
a: 1 b: -1 c: -12   Delta é 49.
a: 1 b: -4 c: -5    Delta é 36.
 */

import java.util.Scanner;

public class L01ExerPOO04 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		double a, b, c, d;
		
		do {
			System.out.print("Entre com \'a\': ");	
			a = leia.nextDouble ();
		} while ( a == 0 );
		
		System.out.print("Entre com \'b\': ");
		b = leia.nextDouble();
		
		System.out.print("Entre com \'c\': ");
		c = leia.nextDouble();
		
		d = delta (a, b, c);
		System.out.println ("Delta: " + d);
	}
	static double delta (double a, double b, double c){
		//delta = b * b - 4 *a * c
		return b * b - 4 *a * c;
	}
}
