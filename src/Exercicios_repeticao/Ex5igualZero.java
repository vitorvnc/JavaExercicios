package Exercicios_repeticao;
import java.util.Scanner;

public class Ex5igualZero {

	public static void main(String[] args) {
		int num = 1, soma=0;
		Scanner in = new Scanner(System.in);
		
		
		do {
			num=0;
			System.out.println("insira um numero: ");
			num = in.nextInt();
			soma = soma+num;
			
		}
		while(num!=0);
		System.out.printf("\nA soma é %d: ", soma);
	}

}
