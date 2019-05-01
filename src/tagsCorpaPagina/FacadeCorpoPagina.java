package tagsCorpaPagina;

import divs.DivDecorator;
import divs.FacadeDiv;

public class FacadeCorpoPagina {
	
	private Header header;
	private Body body;
	private Html html;
	private FacadeDiv fachadaDiv;
	private DivDecorator divDecorator;
	
	public Html criaCorpoDaPagina() {
		header = Header.getInstance();
		body = Body.getInstance();
		html = Html.getInstance();
		html.addHeader(header);
		html.addBody(body);
		return html;
	}
	
	public void addDivNoBody(String nome) {
		this.divDecorator = fachadaDiv.criaNovaDiv(nome);
		this.body.adicionaDiv(this.divDecorator);
	}
}
