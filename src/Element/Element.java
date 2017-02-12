package Element;

public interface Element {

	public void addElement(Element e);
	public String getText();
	public void accept(Visitor v);
}
