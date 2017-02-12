package TextDocument;

public interface Element {

	public void addElement(Element e);
	public String getText();
	public Visitor accept(Visitor v);
}
