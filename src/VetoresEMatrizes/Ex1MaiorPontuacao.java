package VetoresEMatrizes;
import java.util.Scanner;

public class Ex1MaiorPontuacao {

	public static void main(String[] args) {
		double[] valores = new double[5];
		double maiornota=0.0;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite as 5 notas:");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = ler.nextDouble();
		}

		System.out.println("Notas: ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] > maiornota) {
			maiornota = valores[i];	
			}
			
		}
		System.out.println("A maior nota é: "+maiornota);
		

		ler.close();
	
	
	//fechamento da classe e do main
	}
}
