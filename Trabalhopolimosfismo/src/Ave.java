
public class Ave extends Animal {

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	private String corPena;
	
	public void fazerNinho() {
		
		System.out.println("Fazendo Ninho...........");
		
		
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("VOANDO...");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo Pão...");
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("PRU PRU...");
		
	}
	
	
	
	
	
	
	
}
