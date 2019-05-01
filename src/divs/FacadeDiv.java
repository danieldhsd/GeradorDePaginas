package divs;

public class FacadeDiv {
	
	public DivDecorator criaNovaDiv(String nome) {
		DivDecorator novaDiv;
		FabricaDeDiv fabricaDeDiv = new FabricaDeDiv();
		novaDiv = fabricaDeDiv.criaDiv(nome);
		return novaDiv;
	}
}