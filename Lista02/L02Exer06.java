/*
6) [POO-011] Crie um programa que solicite ao usuário números inteiros. A cada número inserido, 
perguntar ao usuário se ele deseja informar outro número. Através de um método, verifique e retorne o 
menor dos valores.
Entrada:                               Saída:
Entre com um número inteiro: 8         O menor é: 2
Inserir outro [s/n]: s
Entre com um número inteiro: 2
Inserir outro [s/n]: n
* 
Entre com um número inteiro: -48       O menor é: -48
Inserir outro [s/n]: n
* 
Entre com um número inteiro: 17        O menor é: 17
Inserir outro [s/n]: s
Entre com outro número inteiro: 17
Inserir outro [s/n]: s
Entre com outro número inteiro: 34
Inserir outro [s/n]: n
* 
 */

import java.util.Scanner;

public class L02Exer06{
	
	public static void main (String[] args) {
		
		Scanner leia   = new Scanner (System.in);
		Scanner string = new Scanner (System.in);
		
		int num1=0, num2=0, num3=100;
		String resposta = "s";
				
		while (resposta.equals ("s") || resposta.equals ("S")){
			
			System.out.print ("Digite um numero inteiro: ");
			num1 = leia.nextInt();
			
			System.out.print ("Deseja inserir outro numero ([s]- sim ou [n] - nao: ");
			resposta = string.nextLine();
				
			num3 = menorNumero(num1, num3);
		}
		
		System.out.print ("O menor numero eh o: " + num3);
	} 
		static int menorNumero (int num4, int num5){
		
		if (num4 < num5){
		return (num4);
		} else {
		return (num5);
		}	
	}
}
	

