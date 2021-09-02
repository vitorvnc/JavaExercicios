package Exercicios_repeticao;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, cont;
		
		for(cont=0; cont<=9; cont++) {
			System.out.println("\nDigite seu numero");
			num=ler.nextInt();
		    
			if (num%2==0) {
		    System.out.printf("%d é par", num);
		    }
		    else {
		    	System.out.printf("%d é ímpar", num);
		         }
	      }
		System.out.printf("\nOBRIGADO POR PARTICIPAR");
	
	
	}
}
