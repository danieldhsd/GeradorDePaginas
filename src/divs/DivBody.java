package divs;

import tagsPadrao.ElementoDecorator;

public class DivBody extends DivDecorator{

	public DivBody() {
		super();
		abreTag("body");
		fechaTag();
	}
}
