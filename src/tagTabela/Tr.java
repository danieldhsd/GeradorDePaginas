package tagTabela;

import tagsPadrao.ElementoDecorator;

public class Tr extends ElementoDecorator{

	public Tr(String nome) {
		super(nome);
	}

	@Override
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception {
		throw new Exception("Impossivel add elemento nesta Tag!");
	}

}
