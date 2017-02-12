package Factory;

public class HTMLElementFactory extends ElementFactory{

	private static HTMLElementFactory instance = new HTMLElementFactory();
	
	private HTMLElementFactory(){}
	
	public static HTMLElementFactory getInstance(){
		return instance;
	}
}
