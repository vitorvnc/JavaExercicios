package lacos_decisao;

import java.util.Scanner;

public class lacos_decisao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		double raiz, elevado;
		
		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par..............");
			raiz = Math.sqrt(num);
			
			System.out.println("Raiz Quadrada: "+ raiz);
			System.out.println("Raiz QUadrada: " + Math.sqrt(num));
			
		}
		else if (num % 2 == 1) {
			System.out.println("Impar...............");
			elevado = Math.pow(num, 2);
			
			System.out.println("Potencia: " + elevado);
		}

	}

}
