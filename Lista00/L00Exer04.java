/*
4) Escreva um programa em Java para ler uma matriz D de dimensão N x M,
onde N e M não poderem ser menores que um. Gerar os elementos
aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um
valor máximo para elementos aleatórios. O programa efetuar todas as
validações. Lembre-se de aproveitar os recursos da linguagem Java para
facilitar as validações.
 * 
 */

import java.util.Scanner;

public class L00Exer04 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int limite, linhas, colunas, d[][];
		
		do {
			System.out.println ("Entre com o tamanho da matriz: ");
			limite = leia.nextInt();
			
			if (limite < 1 ){
			
				System.out.println ("Valor Invalido!Digite outro numero.");
			}
		}
		while (limite < 1 );
		
		linhas  = (int) (Math.random () * limite + 1 );
		colunas = (int) (Math.random () * limite + 1 );
		
		System.out.println ("\nLinhas : " + linhas);
		System.out.println ("\nColunas: " + colunas);
		
		d = new int [linhas][colunas];
		
		System.out.println ("\nMatriz D: ");
		
		for (int l = 0 ; l < d.length ; l++){
			
			for ( int c = 0 ; c < d[l].length ; c++){
				
				d[l][c] = (int)(Math.random () * 100);
				
				System.out.print (d[l][c] + " ");
						
			}
			System.out.println (); 
		}
	}
}

