package modelVeiculo;

public class Moto extends Carro{
	
	private int assentos;
	private String cor;
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void mostraMoto(){
		mostraCarro();
		System.out.println("asssentos: " + getAssentos() + "\nCor: " + getCor());
	}
}
