package Element;

public class Paragraph implements Element {
	
	private String text;
	
	public Paragraph (String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public void addElement(Element e) {}

	@Override
	public Element nextElement() { return null;}
}
