package br.facisa.si.map.adapter;

public class XPTOAdapter extends PoolObjetos{
	
	private XPTO object = new XPTO();
	
	

	@Override
	public void abrirConexao() {
		object.openConection();
		
	}

	@Override
	public Object obterConexao() {
		
		return object.getObjectPool();
	}

}
