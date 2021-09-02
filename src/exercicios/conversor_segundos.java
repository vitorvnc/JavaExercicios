package exercicios;

import java.util.Scanner;

public class conversor_segundos {

	public static void main(String[] args) {
		int sec;
		Scanner leia=new Scanner(System.in);
		
		System.out.printf("Digite segundos: "); 
	    sec=leia.nextInt();
	    System.out.printf("Seu evento vai durar " + (sec/3600) + " Horas, " + ((sec%3600)/60) + " Minutos, e " + ((sec%3600)%60) +" segundos.");
	    
	    
		
		

	}

}
