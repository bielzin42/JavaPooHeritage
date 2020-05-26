package modelVeiculo;

public class Carro extends Veiculo {
	private int rodas;
	private String combustivel;
	private boolean curva;
	
	public boolean isCurva() {
		return curva;
	}
	public void setCurva(boolean curva) {
		this.curva = curva;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public void mostraCarro(){
		mostrar();
		System.out.println("Qtd Rodas: " + getRodas() + "\nCombustível: " + getCombustivel());
	}
	
	public void capotamento() {
		if(isCurva() == true && getVelocidade() > 70) {
			System.out.println("~Barulho de capotamento~");
		} else {
			System.out.println("Curva feita devagar, isso aí motô.");
		}
	}
}
