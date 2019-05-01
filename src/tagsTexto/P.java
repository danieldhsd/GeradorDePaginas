package tagsTexto;

import java.util.ArrayList;

import tagsPadrao.ElementoDecorator;

public class P extends ElementoDecorator{
	
	public ArrayList<ElementoDecorator> elementoDecorators = new ArrayList<>();
	
	public P(String nome) {
		super(nome);
	}

	@Override
	public void addElemento(ElementoDecorator elementoDecorator) {
		elementoDecorators.add(elementoDecorator);
	}
	
}
