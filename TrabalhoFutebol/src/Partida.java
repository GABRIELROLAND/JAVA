import java.util.Date;

public class Partida implements IPartida {
	private Time timeVisitante;
	private Time timeLocal;
	private int scoreVisitante;
	private int scoreLocal;
	private Date dataPartida;
	
	
	public Time getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public Time getTimeLocal() {
		return timeLocal;
	}
	public void setTimeLocal(Time timeLocal) {
		this.timeLocal = timeLocal;
	}
	public int getScoreVisitante() {
		return scoreVisitante;
	}
	public void setScoreVisitante(int scoreVisitante) {
		this.scoreVisitante = scoreVisitante;
	}
	public int getScoreLocal() {
		return scoreLocal;
	}
	public void setScoreLocal(int scoreLocal) {
		this.scoreLocal = scoreLocal;
	}
	public Date getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}
	
	
	@Override
	public void iniciarPartida() {
		// TODO Auto-generated method stub
		scoreLocal=(int)((Math.random()*((10-0)+1))+0);
		scoreVisitante=(int)((Math.random()*((10-0)+1))+0);
		
	}
	@Override
	public void mostrarResultado() {
		// TODO Auto-generated method stub
		System.out.println(timeLocal.getNome()+" "+scoreLocal+" x "+scoreVisitante+" "+timeVisitante.getNome());
		
		
	}
	@Override
	public void finalizarPartida() {
		// TODO Auto-generated method stub
		if(scoreLocal >scoreVisitante) {
			timeLocal.setQtdPontos(timeLocal.getQtdPontos()+3);
			timeLocal.setQtdVitorias(timeLocal.getQtdVitorias()+1);
			timeVisitante.setQtdDerrotas(timeVisitante.getQtdDerrotas()+1);
			
		}
		else if(scoreVisitante>scoreLocal) {
			
			timeVisitante.setQtdPontos(timeVisitante.getQtdPontos()+3);
			timeVisitante.setQtdVitorias(timeVisitante.getQtdVitorias()+1);
			timeLocal.setQtdDerrotas(timeLocal.getQtdDerrotas()+1);
				
		}
		else {
			
			timeVisitante.setQtdPontos(timeVisitante.getQtdPontos()+1);
			timeVisitante.setQtdEmpates(timeVisitante.getQtdEmpates()+1);
			timeLocal.setQtdPontos(timeLocal.getQtdPontos()+1);
			timeLocal.setQtdEmpates(timeLocal.getQtdEmpates()+1);
			
			
			
		}
		
	}
}
