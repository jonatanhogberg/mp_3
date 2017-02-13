package Builder;

import java.util.*;

import Element.Element;
import Element.Visitor;
import TextDocument.StructuredTextDocument;
import TextDocument.TextDocument;

public class StructuredTextDocumentParser {

	private TextConverter textConverter;
	private StructuredTextDocument structuredTextDocument;
	private Visitor visitor;
	
	public StructuredTextDocumentParser(TextConverter textConverter, StructuredTextDocument structuredTextDocument){
		this.structuredTextDocument = structuredTextDocument;
		this.visitor = new Visitor(textConverter);
		this.textConverter = textConverter;
	}
	
	public void parse() {
		List<Element> elements = structuredTextDocument.getList();
		
		textConverter.preamble();
		
		for (Element e : elements) {
			e.accept(visitor);
			
			Element current = e.nextElement();
		    while (current != null) {
		        current.accept(visitor);
		        current = current.nextElement();
		    }
		}
		
		textConverter.postamble();
	}
	
	public TextDocument getDocument() {
		return textConverter.returnDocument();
	}
	
}
