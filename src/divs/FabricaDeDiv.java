package divs;

import tagsPadrao.ElementoDecorator;

/**
 * 
 * @author danieldutra
 * Essa classe gera uma Div de acordo com o nome passado no construtor
 * Se nome for = header retonar uma div no cabecalho com um elemento passado no construtor
 * Padrao Factory Method
 */

public class FabricaDeDiv {
	
	public DivDecorator criaDiv( String nome) {
		switch (nome) {
		
		case "header":
			return new DivHeader();
		
		case "menu":
			return new DivMenu();
		
		case "body":
			return new DivBody();
			
		case "footer":
			return new DivFooter();
		
		default:
			break;
		}
		return null;
	}
}
