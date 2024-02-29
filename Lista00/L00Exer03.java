/*
3) Escreva um programa em Java para ler uma matriz C quadrada de dimensão N,
onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
número o tamanho da matriz quadrada (dimensão) e os elementos podem ser gerados
aleatoriamente (menor que 100).
 */
import java.util.Scanner;

public class L00Exer03 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int n[][], limite, linhas, colunas;
				
		do {
			System.out.print ("Tamanho da matriz quadrada: ");
			limite = leia.nextInt ();
		
			if ( limite < 1 || limite > 20  ) {
				System.out.println ("\n\t Valor invalido! Digite outro valor!!");
			}
		}
		while ( limite < 1 || limite > 20 );
		
		linhas   = limite;
		colunas  = linhas;
		
		System.out.println (" \nDimensao: " + linhas + " x " + colunas);
				
		n = new int [linhas][colunas]; 
		
		System.out.println ("\nMatriz quadrada C: ");
		
			for (int l = 0 ; l < n.length ; l++){
				
				for ( int c = 0 ; c < n[l].length ; c++ ){
				
					n [l][c] = (int) (Math.random() *100);
					
					System.out.print ( n [l][c] + " " );
				}
				System.out.println();
			}
			
	}
			
}

