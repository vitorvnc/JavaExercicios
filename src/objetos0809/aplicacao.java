package objetos0809;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      cliente cli = new cliente();
      aviao avi = new aviao();
      ProdutoEletronico prod = new ProdutoEletronico();
      Funcionario func = new Funcionario();
      
      cli.setNome("antonio");
      cli.setEmail("antonio@gmail.com");
      cli.setIdade(55);
      avi.setModelo("Cargueiro Crossgen");
      avi.setVelocidade(380.00);
      prod.setFuncaoprod("lavadeira");
      prod.setPreco(80.00);
      func.setMatricula(15684);
      func.setNomefunc("Alisson");
      func.setEmailfunc("Alibala@bol.com");
      
      System.out.println("Nome do cliente: "+cli.getNome());
      System.out.println("\nEmail do cliente: "+cli.getEmail());
      System.out.println("\nIdade do cliente: "+cli.getIdade());
      System.out.println("\nModelo do Aviao: "+avi.getModelo());
      System.out.println("\nVelocidade do Avião: "+avi.getVelocidade());
      System.out.println("\nO seu produto é uma: "+prod.getFuncaoprod());
      System.out.println("\nO preço do produto é: "+prod.getPreco());
      System.out.println("\nNumero da matricula do funcionario: "+func.getMatricula());
      System.out.println("\nNome do funcionario: "+func.getNomefunc());
      System.out.println("\nEmail do funcionario: "+func.getEmailfunc());
      
      ler.close();

	}

}
