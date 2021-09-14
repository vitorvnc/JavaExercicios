package ArraysPack;
import java.util.ArrayList;
import java.util.Scanner;

public class AppArrays {

	public static void main(String[] args) {
		int cont = 0, qtd=0; int resp = 0;
		String altera;
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner red = new Scanner(System.in);
		
		System.out.println("quantos produtos vai inserir? ");
		qtd = red.nextInt();
		
		for(cont = 0; cont<qtd; cont++){
			System.out.println("Insira os produtos: ");
			red.nextLine();
			produtos.add(red.nextLine());
			System.out.println("PRODUTO INSERIDO: "+produtos.get(cont));
			}
	    
		System.out.println("Digite 1 para alterar algum produto?(1=Sim) ");
		resp = red.nextInt();
		while(resp ==1) {
			System.out.println("Digite o nunmero do produto que deseja remover : ");
			cont = red.nextInt();
			System.out.println("Digite o o que deseja colocar no lugar : ");
			altera = red.nextLine();
			produtos.set(cont, altera);
			System.out.println("Digite 1 para alterar outro produto(1=Sim)");
			resp = red.nextInt();
			}
		
		System.out.println("Digite 1 para deletar algum produto?(1=Sim) ");
		resp = red.nextInt();
		while(resp ==1) {
			System.out.println("Digite o nunmero do produto que deseja remover : ");
			cont = red.nextInt();
			produtos.remove(cont);
			System.out.println("Digite 1 para deletar outro produto(1=Sim)");
			resp = red.nextInt();
			}
	
		produtos.forEach(produto -> {
			
			System.out.println("Produto : "+ produto);
		});
		
		red.close();
//fechamento da classe e do main
	
	}
}
