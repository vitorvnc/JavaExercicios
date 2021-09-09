package poli0909;
import java.util.Scanner;

public class AppAnimais {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//instanciando um novo objeto de cachorro, cavalo e preguiça
		Cavalo cav1 = new Cavalo();
		Cachorro cach1 = new Cachorro();
		Preguica preg1 = new Preguica();
		String nomes;
		
		//setando o barulinho em cada animal
		cav1.setSom();
		cach1.setSom();
		preg1.setSom();
		
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
		
	
		System.out.println("Insira o nome da Preguiça: ");
		nomes = ler.nextLine();
			preg1.setNome(nomes);
			
		System.out.println("Insira a idade da Preguiça: ");
		preg1.setIdade(ler.nextInt());
		ler.nextLine();
		
	    //exibindo dados do cavalo
		System.out.println("\nNOME CAVALO: "+cav1.getNome()+"\nIDADE: "+cav1.getIdade());
		if(cav1.isCorre()==true) {
			System.out.println("CAVALO SABE CORRER");
		}
        System.out.println(cav1.getSom());
        
		//exibindo dados do cachorro
		System.out.println("\nNOME CACHORRO: "+cach1.getNome()+"\nIDADE: "+cach1.getIdade());
		if(cach1.isCorre()==true) {
			System.out.println("CACHORRO SABE CORRER");
			}
		System.out.println(cach1.getSom());
		
		//exibindo dados da preguiça
		System.out.println("\nNOME DA PREGUIÇA: "+preg1.getNome()+"\nIDADE: "+preg1.getIdade());
			if(preg1.isSobearvore()==true) {
				System.out.println("A PREGUIÇA SOBE EM ARVORES");
				}
		System.out.println(preg1.getSom());
		
		
		ler.close();
		
		
		
		
		
//fecha a classe e o main		
	}
}
