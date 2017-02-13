package Element;

public class BulletList implements Element {
	
	private Element e;

	
	public void addElement(Element e) {
		this.e = e;
	}
	
	public Element nextElement() {
		return e;
	}

	@Override
	public String getText() {
		return "";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
