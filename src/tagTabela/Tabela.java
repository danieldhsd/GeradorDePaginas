package tagTabela;

import java.util.ArrayList;

import tagsPadrao.ElementoDecorator;

public class Tabela extends ElementoDecorator{
	
	private ArrayList<ElementoDecorator> td;
	
	public Tabela(String nome) {
		super(nome);
		td = new ArrayList<ElementoDecorator>();
	}

	@Override
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception {
		//verificar se o elemento é do tipo td
		if( elementoDecorator instanceof Td) {
			td.add(elementoDecorator);
		}
		else {
			throw new Exception("Impossivel adicionar este elemento na tabela");
		}
	}
}
