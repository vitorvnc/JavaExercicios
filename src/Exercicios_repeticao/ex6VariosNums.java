package Exercicios_repeticao;
import java.util.Scanner;

public class ex6VariosNums {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, soma=0,contsoma=0;
		
		System.out.println("insira um numero: ");
		num = in.nextInt();
		do {
			if (num%3==0) {
			soma = soma+num;
			contsoma++;
			}
			System.out.println("insira um numero: ");
			num = in.nextInt();
			
		}
		
		
		
		while(num!=0);
		soma = soma/contsoma;
		System.out.printf("\nA soma é %d: ", soma);
		

	}

}
