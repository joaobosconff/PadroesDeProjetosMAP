package br.facisa.si.map.adapter.pagamento;

public class App {

	public static void main(String[] args) {
		AmericanExpress american = new AmericanExpress();
		AmericanExpressAdapter adapter = new AmericanExpressAdapter(american);
		Compra compra = new Compra();
		compra.pagar(adapter);
	}
}
