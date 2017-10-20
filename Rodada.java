package camp.entities;

import camp.entities.Partida;

public class Rodada {
	
	private int id;
	private Partida[] partidas;
	
	public Rodada(){
		this.partidas = new Partida[0];
	}
	
	public Partida[] getPartidas(){
		return this.partidas;
	}
	
	public void setPartidas(Partida[] partidas){
		this.partidas = partidas;
	}
	
	public void addPartida(Partida partida){
		Partida[] partidas = new Partida[this.partidas.length + 1];
		for(int x = 0; x < this.partidas.length; x++){
			partidas[x] = this.partidas[x];
		}
		partidas[partidas.length - 1] = partida;
		this.setPartidas(partidas);
	}

	public int setId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
