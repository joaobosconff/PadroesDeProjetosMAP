package br.facisa.si.map.builder;

public class McLancheFelizBuilder extends PedidoBuilder {

	@Override
	public void buildForaCaixa() {
		pedido.addDentroCaixa("Hamburger");
		pedido.addDentroCaixa("Batata Frita");
		
	}

	@Override
	public void buildDentroCaixa() {
		pedido.addForaCaixa("Refrigerante");
		
	}
	

}
