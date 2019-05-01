package tagTabela;

import java.util.ArrayList;

import tagsPadrao.ElementoDecorator;

public class Td extends ElementoDecorator{
	
	private ArrayList<ElementoDecorator> tr;
	
	public Td(String nome) {
		super(nome);
		tr = new ArrayList<ElementoDecorator>();
	}

	@Override
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception {
		//verificar se o elemento é do tipo tr
		if(elementoDecorator instanceof Tr) {
			tr.add(elementoDecorator);
		}
		else {
			throw new Exception("Impossivel adicionar este elemento TD");
		}
	}
	
}
