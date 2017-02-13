package Element.sub;

import Element.Element;
import Element.Visitor;

public class Li implements Element {
	
	private String text;
	private Element e;
	
	public Li(String text) {
		this.text = text;
	}

	@Override
	public void addElement(Element e) {
		this.e = e;
	}

	@Override
	public Element nextElement() {
		return e;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
