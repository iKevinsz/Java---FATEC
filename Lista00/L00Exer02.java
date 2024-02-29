/*
2) Escreva um programa em Java para gerar aleatoriamente os elementos
(menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
gerada e imprimir a matriz em ordem invertida. 
 * 
 */
import java.util.Scanner;

public class L00Exer02 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int b [][] = new int [6][3];
		
		System.out.println ("Matriz B: ");
		
		//para imprimir a matriz gerada
		for (int i = 0 ; i <b.length ; i++){
			
			for (int j = 0 ; j < b[i].length ; j++){
			
			b[i][j] = (int) (Math.random() *100);
			
			System.out.print (b[i][j] + " ");
			}
			System.out.println();
		}
		//para imprimir a matriz gerada na ordem invertida
		System.out.println ("\nMatriz B na ordem invertida: ");
		
		for (int i = b.length - 1  ; i >= 0 ; i--){
			
			for (int j = b[i].length - 1 ; j >= 0 ; j--){
			
			System.out.print (b[i][j] + " ");
			}
			System.out.println ();
		}
	}

}
