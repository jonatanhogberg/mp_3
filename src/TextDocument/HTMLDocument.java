package TextDocument;

public class HTMLDocument extends PlainTextDocument {
	
	private StringBuilder documentText;
	
	public HTMLDocument(StringBuilder dokumentText) {
		this.documentText = dokumentText;
	}
	
	@Override
	public String toString() {
		return documentText.toString();
	}
}
