/*
7) Escreva um programa em Java para gerar uma matriz E de dimensão N x M, 
* determinar e imprimir o maior e o menor elemento deste conjunto, informando a posição
dos mesmos. 
 */

import java.util.Scanner;

public class L00Exer07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int maior = 0 , menor = 100; // menor começa com o topo do range - 100 por conta do math
		
		int [][] e = new int [15][15]; 
		
		System.out.println ("Matriz E");
		
		for ( int i = 0 ; i < e.length ; i++){
			for (int j = 0 ; j <e[i].length ; j++){
				
				e [i][j]  = (int)(Math.random () * 100 );
				
				System.out.print (e [i][j] + " ");
			}
			System.out.println();
		} 
		
		//determinar e imprimir o maior e o menor elemento deste conjunto,
		// informando a posição dos mesmos.
				
		for ( int i = 0 ; i < e.length ; i++ ){
			for (int j = 0 ; j < e[i].length ; j++){
				if ( e[i][j] > maior){
					maior = e[i][j];
				}
					if ( e[i][j] < menor){
					menor = e[i][j];
				}
			}
		}
		for ( int i = 0 ; i < e.length ; i++ ){
			for (int j = 0 ; j < e[i].length ; j++){
				if (maior == e[i][j]){
					System.out.println (" O maior numero eh o " + maior + " e esta na posicao: [" + i + "][" + j + "]");
				} 
				if ( menor == e[i][j]){
					System.out.println (" O menor numero eh o " + menor + " e esta na posicao: [" + i + "][" + j + "]");
				}
			}
		}
	}
} 
		


