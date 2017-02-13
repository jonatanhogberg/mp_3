package Factory;

import Builder.*;

public class ConverterFactory {
	private static ConverterFactory instance = new ConverterFactory();
	
	private ConverterFactory(){}
	
	public static ConverterFactory getInstance(){
		return instance;
	}
	
	public ToHTMLConverter createToHTMLConverter() {
		return new ToHTMLConverter();
	}
	
	public ToLaTeXConverter createToLaTeXConverter() {
		return new ToLaTeXConverter();
	}
	
	public ToMarkdownConverter createToMarkdownConverter() {
		return new ToMarkdownConverter();
	}
}
