package tagsCorpaPagina;

/**
 * 
 * @author danieldutra
 * A classe tem o construtor privado, somente uma instancia da classe poder ser criada
 * atraves do metodo getInstance()
 * Padrão Singleton
 */

public final class Html {
	
	private static Html instance;
	private Header header;
	private Body body;
	private String abreTag;
	private String fechaTag;
	private String resultado;
	
	private Html() {
		this.abreTag = "<html>\n";
		this.fechaTag = "\n</html>\n";
	}
	
	public static Html getInstance() {
		if (instance == null) {
			instance = new Html();
		}
		return instance;
	}
	
	public String getAbreTag() {
		return this.abreTag;
	}
	
	public String getFechaTag() {
		return this.fechaTag;
	}
	
	public void addHeader( Header header){
		this.header = header;
	}
	
	public void addBody(Body body) {
		this.body = body;
	}
	
	public String geraResultado() {
		this.resultado = this.abreTag + this.header.geraResultado() + this.body.geraResultado() + this.fechaTag;
		return resultado;
	}
}