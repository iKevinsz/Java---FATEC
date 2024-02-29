/* 
* 5) [POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do 
segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja 
maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas e da forma, 
assim retorne zero.
Referências: POO-004.
*  
 */

import java.util.Scanner;

public class L01ExerPOO05  {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double a, b, c, d;
		
		do {
			System.out.print("Entre com \'a\': ");
			a = leia.nextDouble();
		} while ( a == 0 );
		
		System.out.print("Entre com \'b\': ");
		b = leia.nextDouble();
		
		System.out.print("Entre com \'c\': ");
		c = leia.nextDouble();
		
		d = delta ( a, b, c );
		System.out.println("Delta: " + d);
		
		System.out.println( equacao2Grau ( a, b, c ) );
	}
	
	static double delta (double a, double b, double c){
		// delta = b * b - 4 * a * c
		return b * b - 4 * a * c;
	}
	
	static String equacao2Grau ( double a, double b, double c ) {
			
			double d = delta ( a, b, c );
			String saida = "";
			
			if ( d < 0 )
				return "Não existem raizes reais";
			if ( d == 0)
				return "x = " + (-b / (2 * a ));
				
			if ( b > 0) {
				saida = "x\' = " + ((-b + Math.sqrt(d)) / (2 * a));
				saida += "\n" ;
				saida += "x\'\' = " + ((-b - Math.sqrt(d)) / (2 * a));
			}
			return saida;
	}
}
