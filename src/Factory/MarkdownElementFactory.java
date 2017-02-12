package Factory;

public class MarkdownElementFactory extends ElementFactory{

	private static MarkdownElementFactory instance = new MarkdownElementFactory();
	
	private MarkdownElementFactory(){}
	
	public static MarkdownElementFactory getInstance(){
		return instance;
	}
}
