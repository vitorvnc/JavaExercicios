package poli0909;
import java.util.Scanner;

public class AppAnimais {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//instanciando um novo objeto de cachorro, cavalo e pregui�a
		Cavalo cav1 = new Cavalo();
		Cachorro cach1 = new Cachorro();
		Preguica preg1 = new Preguica();
		String nomes;
		
		//setando o barulinho em cada animal
		
		TesteAnimal.testaAnimal(cav1);
		TesteAnimal.testaAnimal(cach1);
		TesteAnimal.testaAnimal(preg1);
		
		
		
		//usa os sets de cada objeto que instanciamos pra colocar o nome e idade em cada um deles
		System.out.println("Insira o nome do cavalo: ");
		cav1.setNome(ler.nextLine());
		
		System.out.println("Insira a idade do cavalo: ");
		cav1.setIdade(ler.nextInt());
		ler.nextLine();
			
		
		System.out.println("Insira o nome do cachorro: ");
		cach1.setNome(ler.nextLine());
		
		System.out.println("Insira a idade do cachorro: ");
		cach1.setIdade(ler.nextInt());
		ler.nextLine();	
		
	
		System.out.println("Insira o nome da Pregui�a: ");
		nomes = ler.nextLine();
			preg1.setNome(nomes);
			
		System.out.println("Insira a idade da Pregui�a: ");
		preg1.setIdade(ler.nextInt());
		ler.nextLine();
		
	    //exibindo dados do cavalo
		System.out.println("\nNOME CAVALO: "+cav1.getNome()+"\nIDADE: "+cav1.getIdade());
		if(cav1.isCorre()==true) {
			System.out.println("CAVALO SABE CORRER");
		}
	
		//exibindo dados do cachorro
		System.out.println("\nNOME CACHORRO: "+cach1.getNome()+"\nIDADE: "+cach1.getIdade());
		if(cach1.isCorre()==true) {
			System.out.println("CACHORRO SABE CORRER");
			}
		
		//exibindo dados da pregui�a
		System.out.println("\nNOME DA PREGUI�A: "+preg1.getNome()+"\nIDADE: "+preg1.getIdade());
			if(preg1.isSobearvore()==true) {
				System.out.println("A PREGUI�A SOBE EM ARVORES");
				}
		
		
		
		ler.close();
		
		
		
		
		
//fecha a classe e o main		
	}
}
