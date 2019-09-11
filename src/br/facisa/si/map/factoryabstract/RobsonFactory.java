package br.facisa.si.map.factoryabstract;

public class RobsonFactory extends CapivaraFactory {

	@Override
	public Capivara createCapivara(Integer status) {
		return new Robson(status);
	}

}
