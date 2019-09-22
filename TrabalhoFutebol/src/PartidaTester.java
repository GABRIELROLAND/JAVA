public class PartidaTester {

	public static void main(String[] args) {
		
		Time Local = new Time();
		Time Visitante = new Time();
		Partida P1 = new Partida();
		
		 System.out.println("-------------------------------------");
		 System.out.println("Segunda Partida");
		Local.setNome("Botafogo");
		Visitante.setNome("Vasco");
		P1.setTimeLocal(Local);
		P1.setTimeVisitante(Visitante);
		P1.iniciarPartida();
		P1.mostrarResultado();
		P1.finalizarPartida();
		System.out.println("-------------------------------------");
	    Local.listar();
	    System.out.println("-------------------------------------");
	    Visitante.listar();
	    /*Segunda partida */
	    System.out.println("-------------------------------------");
	    System.out.println("Segunda Partida");
		Local.setNome("Botafogo");
		Visitante.setNome("Vasco");
		P1.setTimeLocal(Local);
		P1.setTimeVisitante(Visitante);
		P1.iniciarPartida();
		P1.mostrarResultado();
		P1.finalizarPartida();
		System.out.println("-------------------------------------");
	    Local.listar();
	    System.out.println("-------------------------------------");
	    Visitante.listar();
	
		
	 
	}

}
