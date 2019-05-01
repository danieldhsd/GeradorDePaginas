package tagsTexto;

import tagsPadrao.ElementoDecorator;

public class H4 extends ElementoDecorator{

	public H4(String nome) {
		super(nome);
	}
	
	@Override
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception{
		throw new Exception("Impossivel inserir elemento dentro desta TAG");
	}
}
