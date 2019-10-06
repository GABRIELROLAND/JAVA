
public class Mamifero extends Animal {
	
	private String corPelo;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo Livre...");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo Ração...");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("AU AU AU AU");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	

}
