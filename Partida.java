package camp.entities;

public class Partida {

	private int id;
	private Time timeCasa;
	private Time timeFora;
	private int golsFora;
	private int golsCasa;
	
	public Partida(int id, Time timeCasa, Time timeFora) {
		super();
		this.id = id;
		this.timeCasa = timeCasa;
		this.timeFora = timeFora;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Time getTimeCasa() {
		return timeCasa;
	}
	
	public void setTimeCasa(Time timeCasa) {
		this.timeCasa = timeCasa;
	}
	
	public Time getTimeFora() {
		return timeFora;
	}
	
	public void setTimeFora(Time timeFora) {
		this.timeFora = timeFora;
	}
	
	public int getGolsFora() {
		return golsFora;
	}
	
	public void setGolsFora(int golsFora) {
		this.golsFora = golsFora;
	}
	
	public int getGolsCasa() {
		return golsCasa;
	}
	
	public void setGolsCasa(int golsCasa) {
		this.golsCasa = golsCasa;
	}
	
	public void atualizarInfoTime(){
		this.timeCasa.incrementarGols(golsCasa);
		this.timeFora.incrementarGols(golsFora);
		if(this.golsCasa > this.golsFora){
			this.timeCasa.incremenetarVitoria();
			this.timeFora.incrementarDerrota();
		}else if (this.golsCasa < this.golsFora){
			this.timeFora.incremenetarVitoria();
			this.timeCasa.incrementarDerrota();
		}else{
			this.timeCasa.incrementarEmpate();
			this.timeFora.incrementarEmpate();
		}
	}
		
}
