package tagsTexto;

import tagsPadrao.ElementoDecorator;

public class Title extends ElementoDecorator{

	public Title(String nome) {
		super(nome);
	}
	
	@Override
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception{
		throw new Exception("Impossivel inserir elemento dentro desta TAG");
	}
}