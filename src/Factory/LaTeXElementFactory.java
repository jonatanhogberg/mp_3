package Factory;

public class LaTeXElementFactory extends ElementFactory{

	private static LaTeXElementFactory instance = new LaTeXElementFactory();
	
	private LaTeXElementFactory(){}
	
	public static LaTeXElementFactory getInstance(){
		return instance;
	}
}
