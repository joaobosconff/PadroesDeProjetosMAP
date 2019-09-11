package br.facisa.si.map.factorymethod;

public class App {

	
	public static void main(String[] args) {
		
		Veiculo veiculo1 = FabricaVeiculo.criarVeiculo(2, 5000);
		Veiculo veiculo2 = FabricaVeiculo.criarVeiculo(2, 2000);
		Veiculo veiculo3 = FabricaVeiculo.criarVeiculo(4, 60000);
		Veiculo veiculo4 = FabricaVeiculo.criarVeiculo(4, 20000);
		
		System.out.println(veiculo1.getClass());
		System.out.println(veiculo2.getClass());
		System.out.println(veiculo3.getClass());
		System.out.println(veiculo4.getClass());
	}
}
