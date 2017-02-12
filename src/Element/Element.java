package Element;

public interface Element {

	public void addElement(SubElement e);
	public String getText();
	public void accept(Visitor v);
}
