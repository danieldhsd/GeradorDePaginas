package divs;

import java.util.ArrayList;

import tagsPadrao.ElementoDecorator;

/**
 * 
 * @author danieldutra
 * A classe Div vai servir de classe base para as divs de header, footer, menu e body.
 * Padrão Decorator
 */

public abstract class DivDecorator implements InterfaceDiv{
	
	private String resultado;
	private String abreTag;
	private String fechaTag;
	public ArrayList<ElementoDecorator> listaElementos = new ArrayList<>();
	public ArrayList<DivDecorator> divDecorators = new ArrayList<>();
	
	public DivDecorator() {
		this.abreTag = "";
		this.fechaTag = "";
	}
	
	public String getAbreTag() {
		return abreTag;
	}
	public void setAbreTag(String abreTag) {
		this.abreTag = abreTag;
	}
	public String getFechaTag() {
		return fechaTag;
	}
	public void setFechaTag(String fechaTag) {
		this.fechaTag = fechaTag;
	}
	
	public void adicionaElemento(ElementoDecorator elementoDecorator) {
		listaElementos.add(elementoDecorator);
	}
	
	public void addDiv(DivDecorator divDecorator) {
		this.divDecorators.add(divDecorator);
	}
	
	public String geraResultado() {
		this.resultado = getAbreTag();
		
		for( int i = 0; i < listaElementos.size(); i++) {
			this.resultado += listaElementos.get(i).geraElemento();
		}
		
		this.resultado += getFechaTag();
		return resultado;
	}

	@Override
	public void abreTag(String nome) {
		this.abreTag = "<div id='" + nome + "'>\n";
	}

	@Override
	public void fechaTag() {
		this.fechaTag = "\n</div>\n";
	}
	
}