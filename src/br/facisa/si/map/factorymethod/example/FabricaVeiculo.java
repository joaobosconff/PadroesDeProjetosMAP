package br.facisa.si.map.factorymethod.example;

public class FabricaVeiculo {
	
	public static Veiculo criarVeiculo(int qntRodas,double valor) {
		Veiculo veiculo = new Veiculo();
		if(qntRodas == 4) {
			if(valor >= 50000) {
				veiculo = new Tucson();
			}else {
				veiculo = new HB20();
			}
		}else if(qntRodas == 2) {
			if(valor >= 5000) {
				veiculo = new Bros();
			}else {
				veiculo = new Shineray();
			}
		}
		return veiculo;
	}

}
