package main;

import modelVeiculo.Carro;
import modelVeiculo.Moto;
import modelVeiculo.Veiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		Veiculo wolks = new Veiculo();		
		wolks.setMarca("VolksWagen");
		wolks.setNome("Gallardo");		
		wolks.setVelocidade(0);
		//wolks.mostrar();
		//wolks.acelerar();
		
		
		Carro carro = new Carro();
		carro.setNome("Pe1");
		carro.setMarca("Peugeot");
		carro.setRodas(4);
		carro.setCombustivel("Gasolina");
		carro.setVelocidade(71);
		carro.setCurva(true);
		carro.mostrar();
		carro.capotamento();
		
		
		
		Moto moto = new Moto();
		
		moto.setNome("X-CELER8");
		moto.setMarca("Vuuuuuum");
		moto.setRodas(2);
		moto.setCombustivel("Gasolina");
		moto.setAssentos(1);
		moto.setCor("Vermelho");
		moto.setVelocidade(100);
		//moto.mostrar();
		//moto.freiar();
		//moto.mostraMoto();
	}
}
