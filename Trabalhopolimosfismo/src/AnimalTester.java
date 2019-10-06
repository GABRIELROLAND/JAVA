
public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("O Cachorro Faz");
		
		//Cachorro
		Mamifero m=new Mamifero();
		m.setCorPelo("Preto");
		m.setIdade(5);
		m.setMembros(4);
		m.setPeso(40);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		System.out.println("---------------------------------------");
		System.out.println("O Sapo Faz");
		
		//Sapo
		Reptil r=new Reptil();
		r.setCorEscama("Verde");
		r.setIdade(1);
		r.setMembros(4);
		r.setPeso(3);
		r.locomover();
		r.alimentar();
		r.emitirSom();
		System.out.println("---------------------------------------");
		System.out.println("O Peixe Faz");
		
		//Peixe
		Peixe p=new Peixe();
		p.setCorEscama("Dourada");
		p.setIdade(2);
		p.setMembros(2);
		p.setPeso(3);
		p.soltarBolha();
		p.locomover();
		p.alimentar();
		p.emitirSom();
		
		System.out.println("--------------------------------------");
		System.out.println("O Pombo Faz");
		
		//Pombo
		Ave a=new Ave();
		a.setCorPena("Branca");
		a.setIdade(3);
		a.setMembros(2);
		a.setPeso(5);
		a.fazerNinho();
		a.locomover();
		a.alimentar();
		a.emitirSom();
		
		
		
		
		

	}

}
