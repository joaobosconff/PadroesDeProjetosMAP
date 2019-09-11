package br.facisa.si.map.builder;


public abstract class PedidoBuilder {
	
	protected Pedido pedido;
	
	public PedidoBuilder() {
		pedido = new Pedido();
		
	}
	
	public abstract void buildForaCaixa();
	
	public abstract void buildDentroCaixa();
	
	
	public Pedido getPedido() {
		return pedido;
	}
	
	

	
}
