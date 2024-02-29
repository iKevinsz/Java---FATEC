/*
25) Escreva um programa em Java para gerar uma matriz Y (N x M). 
* Ordene os elementos da matriz de forma crescente * e imprimir 
* a matriz original e a matriz ordenada.
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class L00Exer25 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int linha=0, coluna=0, contador=0;
		
		while (linha == 0 || linha == 15 && coluna == 0 || coluna == 15){
			System.out.print ("Digite o numero de linhas: ");
			linha = leia.nextInt ();
			
			System.out.print ("Digite o numero de colunas: ");
			coluna = leia.nextInt ();
		}
		int y   [][] = new int [linha] [coluna];
		int cres [] = new int [linha*coluna];
		
		System.out.println("Matriz Y: ");
		
		for (int i = 0 ; i < linha ; i++ ){
			for (int j = 0 ; j < coluna ; j++){
				
				y[i][j] = (int) (Math.random() *50);
				cres[contador] = y[i][j];
				System.out.print (y[i][j] + " ");
				contador++;
			}
			System.out.println();
		}
		//para imprimir a matriz gerada na ordem crescente
		Arrays.sort(cres);
		
		contador = 0;
			
		System.out.println ("Matriz Y em ordem crescente: ");
		for (int i = 0 ; i < linha ; i++){
			for (int j = 0 ; j < coluna ; j++){
				y[i][j] = cres [contador];
				System.out.print ( y[i][j] + " ");
				contador++;
			}
		System.out.println();
		}
			
		}
	}


