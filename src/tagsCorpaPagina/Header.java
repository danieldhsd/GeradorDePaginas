package tagsCorpaPagina;

import java.util.ArrayList;

import tagsPadrao.ElementoDecorator;
import tagsTexto.Title;

/**
 * 
 * @author danieldutra
 * A classe tem o construtor privado, somente uma instancia da classe poder ser criada
 * atraves do metodo getInstance()
 * Padrão Singleton
 */

public final class Header {
	private static Header instance;
	private String abreTag;
	private ArrayList<ElementoDecorator> elementoDecorator;
	private String fechaTag;
	private String resultado;
	
	private Header() {
		this.abreTag = "<head>\n";
		this.fechaTag = "\n</head>\n";
	}
	
	public static Header getInstance() {
		if ( instance == null) {
			instance = new Header();
		}
		return instance;
	}
	
	public String getAbreTag() {
		return this.abreTag;
	}
	public String getFechaTag() {
		return this.fechaTag;
	}
	
	public void addElemento(ElementoDecorator elementoDecorator) throws Exception{
		if ( elementoDecorator instanceof Title) {
			this.elementoDecorator.add(elementoDecorator);
		}
		else {
			throw new Exception("Impossivel adicionar este elemento");
		}
	}
	
	public String geraResultado() {
		this.resultado = this.getAbreTag();
		
		for ( int i = 0; i < this.elementoDecorator.size(); i++) {
			this.resultado += this.elementoDecorator.get(i).geraElemento();
		}
		
		this.resultado += this.getFechaTag();
		return this.resultado;
	}
}