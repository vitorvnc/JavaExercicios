package Exercicios_repeticao;
import java.util.Scanner;


public class ex3Idade99 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade=0, cont50=0, cont25=-1;
		
		while(idade!=-99) {
			System.out.println("Digite sua idade: ");
			idade=in.nextInt();
			
			if (idade<25) {
				cont25++;
			}
			   else if(idade>50) {
				   cont50++;
			   }
		}
		System.out.printf("\nTemos %d pessoas com mais de 50 anos!",cont50);
		System.out.printf("\nTemos %d pessoas com menos de 25 anos!",cont25);
		
		in.close();
		
	}
}
