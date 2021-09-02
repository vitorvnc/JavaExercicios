package lacos_decisao;

import java.util.Scanner;

public class TresInteiros {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Entre o primeiro numero");
		num1 = leia.nextInt();
		System.out.println("Entre o segundo numero");
		num2 = leia.nextInt();
		System.out.println("Entre o terceiro numero");
		num3 = leia.nextInt();
		
		 if (num1 > num2 && num1 > num3)
	        System.out.print( "numero 1 e maior " );
	     else
	    	 if (num2 > num1 && num2 > num3)
	    		 System.out.print( "numero 2 e maior " );
	    else
		    if (num3 > num1 && num3 > num2)
		    	System.out.print( "numero 3 e maior " );
		 
		
		

	}

}
