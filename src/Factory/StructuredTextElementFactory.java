package Factory;

public class StructuredTextElementFactory extends ElementFactory{

	private static StructuredTextElementFactory instance = new StructuredTextElementFactory();
	
	private StructuredTextElementFactory(){}
	
	public static StructuredTextElementFactory getInstance(){
		return instance;
	}
}
