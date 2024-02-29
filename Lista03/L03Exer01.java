/*
1) [POO-014] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit. O usuário 
deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de 
conversão deverá ser feito através de um método que recebe a temperatura em Celsius como parâmetro 
de entrada e retorne a temperatura convertida para Fahrenheit. Para o cálculo da conversão, utilize a 
fórmula F= (9*C/5) + 32.
Entrada:                                Saída:
Entre com temperatura em Celsius: 0     A temperatura em Fahrenheit é: 32
* 
Entre com temperatura em Celsius: 100   A temperatura em Fahrenheit é: 212
* 
Entre com temperatura em Celsius: 30    A temperatura em Fahrenheit é: 86
 * 
 */

import java.util.Scanner;

public class L03Exer01 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double fahren = 0 ;
		
		System.out.print ("Entre com a temperatura em Celsius: ");
		fahren = leia.nextDouble();
		
		System.out.print ("A temperatura em Fahrenheit eh: " + convertF (fahren));
	}
	
	static double convertF (double celsius) {
	
	return (9*celsius/5)+32; 
	
	}
}

