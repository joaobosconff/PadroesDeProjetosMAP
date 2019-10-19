package br.facisa.si.map.adapter.pagamento;

public class Compra implements IPagamentoIF {


	@Override
	public void pagar(CartaoDeCredito cartao) {
		cartao.pagar();
	}

}
