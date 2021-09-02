package lacos_decisao;

import java.util.Scanner;

public class IdadeEx3 {

	public static void main(String[] args) {
    Scanner leia=new Scanner(System.in);
		
		int idade=0;
		
		System.out.println("DIGITE SUA IDADE");
		
		while(idade <10 || idade>25) {
		System.out.println("A idade precisa ser entre 10 e 25: ");
		idade= leia.nextInt();
		}
		
		if (idade >= 10 && idade <= 14) {
		System.out.println("Você esta na categoria Infantil ");
		}
		if (idade >= 15 && idade <= 17) {
	    System.out.println("Você esta na categoria Juvenil "); 
		}
		else if (idade >= 18 && idade <= 25){
		System.out.println("Você esta na categoria Adulto ");	
		}
        
		leia.close();
	
		
	}
	}

