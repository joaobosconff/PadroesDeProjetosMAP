package br.facisa.si.map.proxy;

public class App {

	public static void main(String[] args) {
		AcessoBancoBrasilProxy connection = new AcessoBancoBrasilProxy("joao@joao.com", "123456", true);
		
		connection.abrirConta(123, 123, 0.0);
		
	}
}
