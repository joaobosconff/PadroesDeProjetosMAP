package br.facisa.si.map.factorymethod;



public class Veiculo {


	private double valor;
	
	private int qntRodas;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQntRodas() {
		return qntRodas;
	}

	public void setQntRodas(int qntRodas) {
		this.qntRodas = qntRodas;
	}

	@Override
	public String toString() {
		return "Veiculo [valor=" + valor + ", qntRodas=" + qntRodas + "]";
	}
	
	
	
}
