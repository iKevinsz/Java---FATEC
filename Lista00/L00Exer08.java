/*
8) Escreva um programa em Java para gerar uma matriz F (N x M). Criar os
vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da matriz. 
* Imprimir a matriz e os vetores. Validar para caso não haja uma das
duas possibilidades (sem elementos pares ou ímpares).
 */

import java.util.Scanner;

public class L00Exer08 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		
		int f [][] = new int [4][4];		
		int [] par, impar; 
		int linha, coluna, contPar, contImpar, indiceImpar, indicePar;
		boolean ehPar = false, ehImpar = false;
		
		linha  = (int) (Math.random () * 10 + 1 );
		coluna = (int) (Math.random () * 10 + 1 );
		contImpar = 0 ;
		contPar = 0 ;
		f = new int [linha] [coluna];
		
		
		for (int i = 0 ; i < f.length ; i++){
				
			for (int j = 0 ; j < f[i].length ; j++ ){
					
				f [i][j] = (int) (Math.random () * 20);
					
				if (f[i][j] % 2 == 0 ){
					contPar++;
				} else {
					contImpar++;
				}
			}
		}
			
		if (contPar != 0){
			contPar = contPar--;
			ehPar = true;
		}
		if (contImpar != 0) {
			contImpar = contImpar--;
			ehImpar = true;
		}
		
		par   = new int [contPar];
		impar = new int [contImpar];
		
		indiceImpar = 0 ;
		indicePar   = 0;
		
		for (int i = 0 ; i < f.length ; i++ ){
			
			for (int j = 0 ; j < f[i].length ; j++){
				
				if( f[i][j] % 2 == 0 ){
					
					par [indicePar] = f[i][j];
					
					contPar++;
					
				} else {
					
					impar [indiceImpar] = f[i][j];
					
					contImpar++;
				}
			}
		}
		System.out.println ("Matriz F: ");
		for (int i = 0 ; i < f.length ; i++){
			
			for (int j = 0 ; j < f[i].length ; j++){
				
				System.out.print( f[i][j]+"  " );
				
				if (f[i][j] % 2 == 0){
					
					par[indicePar] = f[i][j];
					indicePar++;
				}else {
					impar [indiceImpar] = f[i][j];
					indiceImpar++;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		if (ehPar){ 
			System.out.print("Valores pares da matriz F: ");
			for (int i = 0; i < par.length; i++){
				System.out.print(par[i]+"  " );
			}
			System.out.println();
		} else { 
			System.out.println("Nao ha valor par na matriz F" );
		}
		
		if (ehImpar){ 
			System.out.print("Valores impares da matriz F: ");
			for (int i = 0; i < impar.length; i++){
				System.out.print(impar[i]+"  " );
			}
			System.out.println();
		} else {
			System.out.println("Nao ha valor impar na matriz F" );	
		}
	}
}
