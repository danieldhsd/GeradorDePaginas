package tagsPadrao;

/**
 * 
 * @author danieldutra
 * Interface de acesso comum para todos os elementos
 */

public abstract class InterfaceElemento {
	public abstract void abreTag();
	public abstract void fechaTag();
	public abstract String geraElemento();
	public abstract void addElemento(ElementoDecorator elementoDecorator) throws Exception;
	public abstract void addConteudo(String conteudo);
}