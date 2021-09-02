package exercicios;
import java.util.Scanner;

public class IdadeConversor {

	public static void main(String[] args) {
		int total, dia, mes, anos;
	    Scanner leia=new Scanner(System.in);
	
	    System.out.printf("Digite quantos anos voce tem em DIAS: "); 
	    total=leia.nextInt();
	    anos = total/365;
	    mes = ((total%365)/30);
	    dia = ((total%365)%30);
	    
	    System.out.printf("Você tem %d anos.\n", anos);
	    System.out.printf("Você tem %d meses.\n", mes);
	    System.out.printf("Você tem %d dias.\n", dia);
	    leia.close();
	    
	    
	}

}
