package Element;


public class Table implements Element {
	
	private String text;

	public Table(String text) {
		this.text = text;
	}
	
	public void addElement(Element e) {
		
	}
	
	@Override
	public Element nextElement() {
		return null;
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
