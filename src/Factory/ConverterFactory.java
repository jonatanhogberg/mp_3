package Factory;

public class ConverterFactory {
	private static ConverterFactory instance = new ConverterFactory();
	
	private ConverterFactory(){}
	
	public static ConverterFactory getInstance(){
		return instance;
	}
}
