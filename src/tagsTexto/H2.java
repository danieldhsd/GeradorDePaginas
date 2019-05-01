package tagsTexto;

import tagsPadrao.ElementoDecorator;

public class H2 extends ElementoDecorator{

	public H2(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception{
		throw new Exception("Impossivel inserir elemento dentro desta TAG");
	}
}