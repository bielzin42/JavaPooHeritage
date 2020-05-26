package model;

public class Aeronave {
	private String nome;
	private int modelo;
	private String combustivel;
	private String velocidade;
	private boolean funcionando;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	public boolean isFuncionando() {
		return funcionando;
	}
	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	
}
