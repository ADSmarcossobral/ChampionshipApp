package camp.entities;

public class Campeonato {

	private int id;
	private String nome;
	private Rodada[] rodadas;

	public Rodada[] getRodadas() {
		return rodadas;
	}

	public void setRodadas(Rodada[] rodadas) {
		this.rodadas = rodadas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
