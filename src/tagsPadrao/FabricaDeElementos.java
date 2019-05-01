package tagsPadrao;

import tagsTexto.H1;
import tagsTexto.H2;
import tagsTexto.H3;
import tagsTexto.H4;
import tagsTexto.P;
import tagsTexto.Title;

/**
 * 
 * @author danieldutra
 * Essa classe gera as tags de acordo com o nome do elemento passado no construtor
 * Se nome for = h1 cria um novo elemento h1
 * Padrao Factory Method
 */

public class FabricaDeElementos {
	
	public ElementoDecorator criaElemento(String nome) {
		switch( nome) {
		case "h1":
			return new H1(nome);
		
		case "h2":
			return new H2(nome);
				
		case "h3":
			return new H3(nome);
			
		case "h4":
			return new H4(nome);
		
		case "p":
			return new P(nome);
			
		case "title":
			return new Title(nome);
			
		default:
			break;
		}
		return null;
	}
}
