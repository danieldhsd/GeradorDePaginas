package tagsCorpaPagina;

import java.util.ArrayList;

import divs.DivDecorator;
import tagsPadrao.ElementoDecorator;
import tagsTexto.Title;

/**
 * 
 * @author danieldutra
 * A classe tem o construtor privado, somente uma instancia da classe poder ser criada
 * atraves do metodo getInstance()
 * Padrão Singleton
 */

public final class Body {
	private static Body instance;
	private String abreTag;
	private String fechaTag;
	private String resultado;
	public ArrayList<DivDecorator> divDecorators = new ArrayList<>();
	
	private Body() {
		this.abreTag = "\n<body>\n";
		this.fechaTag = "\n</body>\n";
	}
	
	public static Body getInstance() {
		if ( instance == null) {
			instance = new Body();
		}
		return instance;
	}
	
	public String getAbreTag() {
		return this.abreTag;
	}
	public String getFechaTag() {
		return this.fechaTag;
	}
	
	public void adicionaDiv(DivDecorator divDecorator) {
		this.divDecorators.add(divDecorator);
	}
	
	public String geraResultado() {
		this.resultado = getAbreTag();
		
		if (divDecorators.size() > 0) {
			for(int i = 0; i < divDecorators.size(); i++) {
				this.resultado += divDecorators.get(i).geraResultado();
			}
		}
		
		this.resultado += getFechaTag();
		return this.resultado;
	}
}