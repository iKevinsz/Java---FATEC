/*
23) Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.
 */

import java.util.Scanner;

public class L00Exer23 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int linha = 0, coluna = 0, contador = 0, verifPrimo = 0, posicao = 0 ;
		
		while (linha == 0 || linha >= 25 && coluna == 0 || coluna >= 25 ){
			
			System.out.print ("Digite o numero de linhas: ");
			linha = leia.nextInt();
			
			System.out.print ("Digite o numero de colunas: ");
			coluna = leia.nextInt();
		} 
			
		int total [] = new int [linha*coluna];
		
		for(int i=1 ; i<=total.length;){
			contador=0;
			verifPrimo++;
			for(int y = verifPrimo ; y >= 1 ; y--){
				
				if(verifPrimo % y == 0){
				contador++;
				}
			}
			if(contador == 2){
				total[posicao] = verifPrimo;
				posicao++;
				i++;
			}
		}
		
		System.out.println("\nTotal elementos da matriz: " + total.length);
		
		int a[][] = new int [linha][coluna];
		posicao = 0;
				
		System.out.println ("Matriz: ");
		
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < a[i].length ; j++){				
				
				a[i][j]=total[posicao];
				System.out.print(a[i][j]+" ");
				posicao++;
			}
			System.out.println();
			
		}
			
	}
}	
		

	


