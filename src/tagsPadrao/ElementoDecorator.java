package tagsPadrao;

/**
 * 
 * @author danieldutra
 * A classe Elemento vai servir de classe base para as tags H1 a H6 e P.
 * Padrão Decorator
 */

public abstract class ElementoDecorator extends InterfaceElemento{
	
	private String elemento;
	private String abreTag;
	private String conteudo;
	private String fechaTag;

	public ElementoDecorator(String nome) {
		this.abreTag = "<" + nome + ">";
		this.conteudo = "";
		this.fechaTag = "</" + nome + ">";
	}
	
	public String getAbreTag() {
		return this.abreTag;
	}
	
	public String getConteudo() {
		return this.conteudo;
	}
	public String getFechaTag() {
		return this.fechaTag;
	}
	
	public void setAbreTag(String abreTag) {
		this.abreTag = abreTag;
	}
	
	public void setFechaTag(String fechaTag) {
		this.fechaTag = fechaTag;
	}
	
	public void addConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public void abreTag() {
		
	}
	public void fechaTag() {
		
	}
	public String geraElemento() {
		this.elemento = this.getAbreTag() + this.getConteudo() + this.fechaTag;
		return this.elemento;
	}
}