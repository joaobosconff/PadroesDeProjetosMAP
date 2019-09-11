package br.facisa.si.map.builder;

public class Atendente {
	
	public static Pedido getMacLanche() {
		McLancheFelizBuilder builder = new McLancheFelizBuilder(); 
		Funcionario funcionario = new Funcionario(builder);
		funcionario.buildPedido();
		return funcionario.getPedido();
	}

	
	
}
