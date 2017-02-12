package Factory;

public class AbstractFactory {

	public StructuredTextElementFactory getStructuredTextElementFactory(){
		return StructuredTextElementFactory.getInstance();
	}
	
	public ConverterFactory getConverterFactory() {
		return ConverterFactory.getInstance();
	}
	
}