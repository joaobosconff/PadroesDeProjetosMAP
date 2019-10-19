package br.facisa.si.map.proxy;

public class AcessoBancoBrasilProxy  extends AcessoBancoBrasil{
	
	private String username;
	
	private String password;
	
	private boolean isAdmin;

	public AcessoBancoBrasilProxy(String username, String password,boolean isAdmin) {
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
	@Override
	public void abrirConta(int conta,int agencia, double saldo) {
		if(isAdmin) {
			super.abrirConta(conta, agencia, saldo);
		} else {
			System.out.println("invalido");
		}
	}
	
	
	

}
