package br.facisa.si.map.factoryabstract;

public class App {
	
	public static void main(String[] args) {
		CapivaraFactory robsob = new KleberFactory(); 
		Capivara roblob = robsob.createCapivara(500);
		System.out.println(roblob);
		
	}

}
