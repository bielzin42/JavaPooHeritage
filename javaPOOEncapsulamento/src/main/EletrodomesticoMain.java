package main;

import model.Eletrodomesticos;

public class EletrodomesticoMain {

	public static void main(String[] args) {
		Eletrodomesticos microondas = new Eletrodomesticos();
		
		microondas.setFuncionando(true);
		microondas.setMarca("Kzayavyev");
		microondas.setModelo(66);
		microondas.setNome("Microondas Sponsor 3500raM");
		
		System.out.println("Marca: " + microondas.getMarca());
		System.out.println("Modelo: " + microondas.getModelo());
		System.out.println("Nome: " + microondas.getNome());
		System.out.println("Está funcionando?: " + microondas.isFuncionando());
	}	
}
