/*
26) Escreva um programa em Java para gerar uma matriz W (N x M). Ordem
os elementos da matriz de forma decrescente e imprimir a matriz original e a
matriz ordenada.
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class L00Exer26 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int linha=0 , coluna=0 , contador=0;
		
		while (linha == 0 || linha == 15 && coluna == 0  || coluna == 15 ){
			
			System.out.print ("Digite o numero de linhas: ");
			linha = leia.nextInt();
			
			System.out.print ("Digite o numero de colunas: ");
			coluna = leia.nextInt();
		}
		
		int w[][] = new int [linha] [coluna];
		int decr[]= new int [linha*coluna];
		
		System.out.println ("Matriz W: "); 
		
		for (int i = 0 ; i < linha ; i++){
			for(int j =0 ; j < coluna ; j++ ){
				
				w[i][j] = (int)(Math.random () *50);
				decr[contador] = w[i][j];
				System.out.print (w[i][j] + " " );
				contador++;
			
			}
		System.out.println();
		}
		
		//para imprimir a Matriz na ordem decrescente
		Arrays.sort(decr);
		
		contador = 0;
		
		System.out.println ("Matriz na ordem decrescente: ");
		
		for(int i = 0 ; i < linha ; i++){
				for(int j = 0 ; j < coluna ; j++){
					
					w[i][j] = decr[contador];
					System.out.print (w[i][j] + " ");
					contador++;
					
				}
			System.out.println ();
		}
		
	}
}

