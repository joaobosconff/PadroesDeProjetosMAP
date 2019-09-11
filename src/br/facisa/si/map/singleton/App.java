package br.facisa.si.map.singleton;

public class App {
	public static void main(String[] args) {
		Conexao c = Conexao.getInstance();
		System.out.println(c.toString());
		Conexao c2 = Conexao.getInstance();
		System.out.println(c2.toString());
	}

}
