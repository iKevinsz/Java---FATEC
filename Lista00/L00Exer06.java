/*
 6) Escreva um programa em Java para gerar aleatoriamente (menor que 25)
uma matriz N x M de dimensão definidas pelo usuário. Solicitar ao usuário
um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na
matriz, indicando a posição (linha X coluna) e no final a quantidade de
ocorrências.
 * 
 */

import java.util.Scanner;

public class L00Exer06 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		
		int [][] matriz;
		int n, m , numero, contador = 0;
		
		do {
			System.out.print ("Digite o numero de linhas : ");
			n = leia.nextInt();
			
			if ( n > 25 ){
				
				System.out.print ("Digite um numero de linhas maior que um ate 25!");
			}			
			
		} while ( n < 1 || n >= 26);
		
		do {
			System.out.print ("Digite o numero de colunas: ");
			m = leia.nextInt();
			
			if ( m > 25 ){
				
				System.out.print ("\n\tDigite um numero de colunas maior que um ate 25!\n");
			}			
			
		} while ( m < 1 || m >= 26 );
			
		//para imprimir a matriz
		matriz = new int [n][m];
		
		System.out.println ("Matriz: ");
		
			for (int i = 0 ; i < matriz.length ; i++){
				
				for (int j = 0 ; j < matriz[i].length ; j++ ){
					
					matriz [i][j] = (int) (Math.random () * 100);		
					
					System.out.print (matriz [i][j] + " ");
				}
			System.out.println ();
			}
		//Informar se o valor digitado existe na
		//matriz, indicando a posição (linha X coluna) e no final a quantidade de
		//ocorrências.
		
		System.out.print ("\nDigite um numero aleatorio: ");
		numero = leia.nextInt();
		
		for (int i = 0 ; i < matriz.length ; i++){
				
			for (int j = 0 ; j < matriz[i].length ; j++ ){
					
				if ( matriz[i][j] == numero){
			
					System.out.print ("\nO numero existe na matriz na posicao [" + i + "][" + j + "]");
						
					contador ++;
						
				}	
					
			}
		
		}
		System.out.print ("\nO numero de repeticoes eh: " + contador);
	}
}

