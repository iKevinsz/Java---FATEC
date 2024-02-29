/*
5) Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuário) e
calcular a soma entre elas gerando uma terceira matriz.
 */

import java.util.Scanner;

public class L00Exer05 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int [][] a, b, c;
		
		int linhas, colunas;
		
		do {
			System.out.print ("Digite o numero de linhas : ");
			linhas = leia.nextInt();
			
			if ( linhas < 1 ){
				
				System.out.println ("\n\tNumero de linhas invalido. O numero deve ser maior que um!\n");
			}
		} while ( linhas < 1 );
		
		do {
			System.out.print ("Digite o numero de colunas: ");
			colunas = leia.nextInt();
			
			if (colunas < 1 ){
				System.out.println ("\n\tNumero de colunas invalido. O numero deve ser maior que um!\n");
			}
		} while ( colunas < 1 );
		
		a = new int [linhas] [colunas];
		b = new int [linhas] [colunas];
		c = new int [linhas] [colunas];
		
		System.out.println ("Matriz A: ");
		for ( int i = 0 ; i < a.length ; i++){
			
			for (int j = 0 ; j < a[i].length ; j++ ){
				
				a[i][j] = (int)(Math.random () * 100);
				b[i][j] = (int)(Math.random () * 100);
				c[i][j] = a[i][j] + b[i][j];
				
				
				System.out.print ( a [i][j] + " ");
			}
			System.out.println ();
		}	
		System.out.println ("Matriz B: ");
			for (int i = 0 ; i < b.length ; i++){
				for (int j = 0 ; j < b[i].length ; j++){
					System.out.print (b[i][j] + " ");
				}
			System.out.println ();
			}
		System.out.println ("Matriz Soma A + B: ");	
			for (int i = 0 ; i < c.length ; i++){
				for (int j = 0 ; j < c[i].length ; j++){
					
					c[i][j] = a[i][j] + b[i][j];
					
					System.out.print (c[i][j] + " ");		
				
				}
				System.out.println ();
			}
			
	}
}

