package main;

import java.util.ArrayList;

import divs.DivDecorator;
import divs.FabricaDeDiv;
import divs.FacadeDiv;
import tagsCorpaPagina.Body;
import tagsCorpaPagina.FacadeCorpoPagina;
import tagsCorpaPagina.Header;
import tagsCorpaPagina.Html;
import tagsPadrao.ElementoDecorator;
import tagsPadrao.FabricaDeElementos;

public class Main {

	public static void main(String[] args) {
//		PageMannager mannager = new PageMannager();
//		mannager.mannagerWindow();
//		ArrayList<Div> div = new ArrayList<>();
//		Header header = null;
//		Body body = null;
//		Html html = null;
//		html = Html.getInstance();
//		header = Header.getInstance();
//		body = Body.getInstance();
//		FabricaDeElementos fabrica = new FabricaDeElementos();
//		FabricaDeDiv fabrica2 = new FabricaDeDiv();
//		Elemento elemento = fabrica.criaElemento("title");
//		
//		div.add(fabrica2.criaDiv("header"));
//		div.add(fabrica2.criaDiv("footer"));
//		div.add(fabrica2.criaDiv("menu"));
//		div.add(fabrica2.criaDiv("body"));
//		
//		for(int i = 0; i < div.size(); i++) {
//			body.adicionaDiv(div.get(i));
//		}
//		header.addTitulo(elemento);
//		
//		html.addHeader(header);
//		html.addBody(body);
//		System.out.println(html.geraResultado());
		
		//System.out.println( header.geraResultado());
		
//		for (int i = 0; i < div.size(); i++) {
//			System.out.println(div.get(i).geraResultado());
//		}
		
		FacadeCorpoPagina fachada = new FacadeCorpoPagina();
		Html html;
		html = fachada.criaCorpoDaPagina();
		
		System.out.println(html.geraResultado());
		
		SalvarArquivo salvar = new SalvarArquivo();
		salvar.salvarArquivo(html);
		
	}
}
