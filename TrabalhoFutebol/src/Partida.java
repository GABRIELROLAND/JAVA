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
		System.out.println(scoreLocal);
	}
	@Override
	public void mostrarResultado() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void finalizarPartida() {
		// TODO Auto-generated method stub
		
	}
}
