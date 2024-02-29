/*
5) [POO-010] Crie um programa que solicite ao usuário três números inteiros. Através de um método, que 
receba esses 3 números como parâmetros de entrada, verifique e retorne o maior dos três valores.

Restrição: USAR a técnica de sobrecarga para o método, um com 2 e outro com 3 parâmetros.

Entrada:                                Saída:
Entre com um número inteiro: 8          O maior é: 8
Entre com outro número inteiro: 2
Entre com mais um número inteiro: 5
* 
Entre com um número inteiro: -48        O maior é: 48
Entre com outro número inteiro: 48
Entre com mais um número inteiro: 1
* 
Entre com um número inteiro: 17         O maior é: 17
Entre com outro número inteiro: 17
Entre com mais um número inteiro: 17
 * 
 */

import java.util.Scanner;

public class L02Exer05 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num1=0, num2=0, num3=0;
		
		System.out.print ("Digite o primeiro numero inteiro: ");
		num1 = leia.nextInt();
		
		System.out.print ("Digite o segundo  numero inteiro: ");
		num2 = leia.nextInt();
		
		System.out.print ("Digite o terceiro numero inteiro: ");
		num3 = leia.nextInt ();	
		
		System.out.print ("O maior valor eh o: " + maiorValor (num1, num2, num3));
	}
	static int maiorValor ( int num4, int num5) {
		
	return Math.max(num4, num5);	
	}
	static int maiorValor (int num6, int num7, int num8) {
	
	int num9  = Math.max (num6, num7);
	int num10 = Math.max (num9, num8);
	
	return num10;
	}
}

