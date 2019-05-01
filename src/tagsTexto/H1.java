package tagsTexto;

import tagsPadrao.ElementoDecorator;

public class H1 extends ElementoDecorator{

	public H1(String nome) {
		
		super(nome);
	}

	@Override
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception{
		throw new Exception("Impossivel inserir elemento dentro desta TAG");
	}
}
