package main;

import model.Aeronave;

public class AeronaveMain {

	public static void main(String[] args) {
		
		Aeronave a = new Aeronave();
		
		a.setNome("A-12");
		a.setModelo(178859);
		a.setCombustivel("Finocyl 5");
		a.setVelocidade("982 M/s");
		
		System.out.println("Name: " + a.getNome());
		System.out.println("Model: " + a.getModelo());
		System.out.println("Fuel type: " + a.getCombustivel());
		System.out.println("Average speed: " + a.getVelocidade());
		
	}

}
