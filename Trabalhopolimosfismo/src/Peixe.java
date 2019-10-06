
public class Peixe extends Animal {
	
	public String getCorEscama() {
		return corEscama;
	}


	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}


	private String corEscama;
	
	
	public void soltarBolha() {
		
		System.out.println("BLOOG BLOOG BLOOG");
		
	}


	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("NADANDO...");
		
	}


	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo Isca...");
	}


	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Nao faço Barulho...");
		
	}

}
