package poli0909;

public class Cachorro extends Animal{
	private boolean corre = true;

	public boolean isCorre() {
		return corre;
	}

	@Override
	public void emissaosom() {
		System.out.println("AU AU AU");
		
	}
	

}
