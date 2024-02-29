/*
1) Escreva um programa em Java para ler uma matriz A de 4 linhas por 5 colunas e
imprimir seus elementos. 
 */
import java.util.Scanner;

public class L00Exer01 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a[][] = new int [4][5];
				
			for (int i = 0 ; i < a.length ; i++){
				
				for (int j = 0 ; j<a[i].length ; j++){
				
				System.out.print ("Entre com os 20 numeros: [" + i + "][" + j + "]:");
				a[i][j] = leia.nextInt();
				}
			}
		//Mostrando os elementos da matriz A
		System.out.println ("\nMostrando os elementos da matriz A:");
		for (int i = 0 ; i < a.length ; i++){
			
			for (int j = 0 ; j < a[i].length; j++){
			
			System.out.print ( a[i][j] + " " );
			}
			System.out.println();
		}
	}
}

