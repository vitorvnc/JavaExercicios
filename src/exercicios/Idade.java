package exercicios;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		int dia, mes, anos;
		    Scanner leia=new Scanner(System.in);
		
		    System.out.printf("Digite quantos anos voce tem: "); 
		    anos=leia.nextInt();
		    System.out.printf("Digite quantos meses voce tem: "); 
		    mes=leia.nextInt();
		    System.out.printf("Digite quantos dias voce tem: "); 
		    dia=leia.nextInt();
		    
		    anos=anos*365;
		    mes=mes*30;
		    dia=dia+anos+mes;
		    System.out.printf("Sua idade em dias é: %d\n", dia);
		    leia.close();

	}

}
