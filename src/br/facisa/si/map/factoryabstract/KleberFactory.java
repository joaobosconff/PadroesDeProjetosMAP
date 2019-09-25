package br.facisa.si.map.factoryabstract;

public class KleberFactory extends CapivaraFactory{
	
	@Override
	public Capivara createCapivara(Integer status) {
		return new Kleber(status);
	}

}
