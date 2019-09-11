package br.facisa.si.map.builder;

public class Funcionario {
	
	
	private PedidoBuilder builder;

	public Funcionario(PedidoBuilder builder) {
		this.builder = builder;
	}

	public void	buildPedido() {
		builder.buildDentroCaixa();
		builder.buildForaCaixa();
	}
	
	public Pedido getPedido() {
		return builder.getPedido();
	}
	

}
