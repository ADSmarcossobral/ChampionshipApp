package camp.entities;

public class Time {

	private int id;
	private String nome;
	private int qtdGols;
	private int qtdVitorias;
	private int qtdEmpate;
	private int qtdDerrotas;
	
	public Time(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public int getQtdGols() {
		return qtdGols;
	}

	public void setQtdGols(int qtdGols) {
		this.qtdGols = qtdGols;
	}

	public int getQtdVitorias() {
		return qtdVitorias;
	}

	public void setQtdVitorias(int qtdVitoria) {
		this.qtdVitorias = qtdVitoria;
	}

	public int getQtdEmpate() {
		return qtdEmpate;
	}

	public void setQtdEmpate(int qtdEmpate) {
		this.qtdEmpate = qtdEmpate;
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
	
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}

	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	
	public void incrementarGols(int gols){
		this.qtdGols += gols;
	}
	
	public void incremenetarVitoria(){
		this.qtdVitorias++;
	}
	
	public void incrementarDerrota(){
		this.qtdDerrotas++;
	}
	
	public void incrementarEmpate(){
		this.qtdEmpate++;
	}
	
}
