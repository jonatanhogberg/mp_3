package Element;

public class SubElement {
	
	private String text;
	private SubElement e;

	public SubElement(String text) {
		this.text = text;
	}
	
	public void addElement(SubElement e) {
		this.e = e;
	}
	
	public SubElement nextElement() {
		return e;
	}

	public String getText() {
		return text;
	}
}
