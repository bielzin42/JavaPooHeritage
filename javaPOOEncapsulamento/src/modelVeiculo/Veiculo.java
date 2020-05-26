package modelVeiculo;

public class Veiculo {
	private String nome;
	private String marca;
	private double velocidade;
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + getNome() + "\nMarca: " + getMarca() + "\nVelocidade: " + getVelocidade() + "Km/h");
	}
	
	public void acelerar() {
		System.out.println("\nVelocidade atual: " + getVelocidade());		
		if(getVelocidade() >= 0 && getVelocidade() < 80) {
			setVelocidade(80);
			System.out.println("Acelerando...");
			System.out.println("\nVelocidade atual: " + getVelocidade());	
		} else {
			System.out.println("Calma aí relâmpago McQueen.");
		}
	}
	
	public void freiar() {
		System.out.println("\nVelocidade atual: " + getVelocidade());
		if(getVelocidade() > 0) {
			setVelocidade(0);
			System.out.println("desacelerando...");
			System.out.println("\nVelocidade atual: " + getVelocidade());	
		} else {
			System.out.println("Calma aí lesma morta.");
		}
	}
}
