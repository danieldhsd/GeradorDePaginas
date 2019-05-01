package tagsPadrao;

public class FacadeElemento {
	public ElementoDecorator criaNovoElemento(String nome) {
		ElementoDecorator novoElemento;
		FabricaDeElementos fabricaDeElementos = new FabricaDeElementos();
		novoElemento = fabricaDeElementos.criaElemento(nome);
		return novoElemento;
	}
}
