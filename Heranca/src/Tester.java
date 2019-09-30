
public class Tester {

	public static void main(String[] args) {
		// Objetos instanciados
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		Professor p1 = new Professor();
		Tecnico t1 = new Tecnico();
		
		//Set dados
	
		//Visitante
		v1.setNome("Rogerio");
		v1.setIdade(35);
		v1.setSexo("M");
		
		// Classe Aluno
		a1.setCurso("Sistemas de Infomacao.");
		a1.setIdade(25);
		a1.setMatricula(500);
		a1.setNome("Gabriel");
		a1.setSexo("M");
		a1.PagarMensalidade();
		
		//Classe Bolsista
		b1.setBolsa(470);
		b1.setCurso("Filosofia");
		b1.setIdade(19);
		b1.setMatricula(150);
		b1.setNome("Luana");
		b1.setSexo("F");
		b1.PagarMensalidade();
		
		//Classe Professor
		p1.setEspecialidade("Matemática financeira");
		p1.setIdade(49);
		p1.setNome("Alex");
		p1.setSalario(1800);
		p1.setSexo("M");
		p1.receberAumento();
		
		// Classe Técnico
		t1.setCurso("Eletrotecnico");
		t1.setIdade(17);
		t1.setMatricula(299);
		t1.setNome("Cleber");
		t1.setSexo("M");
		t1.Praticar();
		t1.PagarMensalidade();
		t1.setRegistroProfissional("Conhecimento de eletrica");
		
		
	}

}
