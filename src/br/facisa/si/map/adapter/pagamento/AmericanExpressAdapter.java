package br.facisa.si.map.adapter.pagamento;

public class AmericanExpressAdapter extends CartaoDeCredito {
	
	
	private AmericanExpress cartao;

	public AmericanExpressAdapter(AmericanExpress cartao) {
		this.cartao = cartao;
	}

	public void pagar() {
		cartao.pagar();
	}
	
	

}
