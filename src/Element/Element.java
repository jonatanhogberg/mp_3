package Element;

public interface Element {

	public void addElement(Element e);
	public Element nextElement();
	public String getText();
	public void accept(Visitor v);
}
