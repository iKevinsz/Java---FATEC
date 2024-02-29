/*
7) [POO-012] Crie um programa que pergunte ao usuário se ele deseja lançar/jogar um dado. Por meio de 
um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. O programa 
deve ser executado enquanto o usuário quiser continuar jogando o dado.
Entrada:                 Saída:
Jogar o dado [s/n]: s    Saiu: 4
Jogar o dado [s/n]: s    Saiu: 3
Jogar o dado [s/n]: s    Saiu: 1
Jogar o dado [s/n]: n
* 
Jogar o dado [s/n]: s    Saiu: 6
Jogar o dado [s/n]: n
* 
Jogar o dado [s/n]: n
 * 
 */

import java.util.Scanner;

public class L02Exer07 {
	
	public static void main (String[] args) {
		
		Scanner leia   = new Scanner (System.in);
		Scanner string = new Scanner (System.in);
		
		String resposta = "s";
		int num = 0;
		
		while (resposta.equals ("s") || resposta.equals ("S")){
		
		System.out.print ("Jogar o dado? [s] - sim ou [n] - nao: ");
		resposta = string.nextLine();
		
		System.out.println ("Saiu o valor: " + dado (num));
		
		}
		
	}
	
	static int dado (int num){
		
		return (int) (Math.random () * (8-1));
	}
}

