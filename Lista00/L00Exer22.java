/*
24) Escreva um programa em Java para solicitar ao usuário dimensões de
uma matriz. Preencher a matriz com os elementos da sequencia de Fibonacci
e imprimir o resultado.
 */

import java.util.Scanner;

public class L00Exer24 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int linha = 0, coluna = 0, contador = 0, t = 0 , b=0 , d=0 , c=1;
		
		while (linha == 0 || linha >= 10 && coluna == 0 || coluna >= 10 ){
			
			System.out.print ("Digite o numero de linhas: ");
			linha = leia.nextInt();
			
			System.out.print ("Digite o numero de colunas: ");
			coluna = leia.nextInt();
		} 
			
		int total [] = new int [linha*coluna];
		
			for (int y = total.length ; y >= 1 ; y--){
				
				total[t] = b;
				System.out.print(b + "  ");
				b=c+d;
				c=d;
				d=b;
				t++;
			
			}
				
		System.out.println("\nTotal de elementos da matriz: " + total.length);
		
		int a[][] = new int [linha][coluna];
		t = 0;
				
		System.out.println ("Matriz: ");
		
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < a[i].length ; j++){				
				
				a[i][j]=total[t];
				System.out.print(a[i][j]+" ");
				t++;
			}
			System.out.println();
			
		}
			
	}
}	

	


