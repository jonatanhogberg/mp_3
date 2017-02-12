package Factory;

public class AbstractFactory {

	public StructuredTextElementFactory getStructuredTextElementFactory(){
		return StructuredTextElementFactory.getInstance();
	}
	
	public MarkdownElementFactory getMarkdownElementFactory(){
		return MarkdownElementFactory.getInstance();
	}
	
	public HTMLElementFactory getHTMLElementFactory(){
		return HTMLElementFactory.getInstance();
	}
	
	public LaTeXElementFactory getLaTeXElementFactory(){
		return LaTeXElementFactory.getInstance();
	}
}
