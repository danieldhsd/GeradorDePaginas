package divs;

import tagsPadrao.ElementoDecorator;

/**
 * 
 * @author danieldutra
 * Interface de acesso comum para todas as divs. Padrão Composite.
 */

public interface InterfaceDiv {
	public void abreTag(String nome);
	public void fechaTag();
	public String geraResultado();
	public void adicionaElemento(ElementoDecorator elementoDecorator);
	public void addDiv(DivDecorator divDecorator);
}