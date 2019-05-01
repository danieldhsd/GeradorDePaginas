package tagImagem;

import tagsPadrao.ElementoDecorator;

public class Imagem extends ElementoDecorator{
	
	public Imagem(String nome) {
		super(nome);
		this.setAbreTag("<img src=\"");
		this.setFechaTag("\">");
	}

	@Override
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception{
		throw new Exception("Impossivel inserir elemento dentro desta TAG");
	}
}