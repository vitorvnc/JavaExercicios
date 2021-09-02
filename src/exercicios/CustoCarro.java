package exercicios;

import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de Fábrica");
		custoFabrica = leia.nextDouble();
		distribuidor = custoFabrica + (custoFabrica*0.28);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		Math.pow(custoFabrica, distribuidor);
		
		System.out.println("Custo ao Consumidor: " + custoConsumidor);
		
		leia.close();

	}

}
