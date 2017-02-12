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
		this.textConverter = textConverter;
		this.structuredTextDocument = structuredTextDocument;
		this.visitor = new Visitor(textConverter);
	}
	
	public void parse() {
		List<Element> elements = structuredTextDocument.getList();
		
		textConverter.preamble();
		
		for (Element e : elements) {
			e.accept(visitor);
		}
		
		textConverter.postamble();
	}
	
	public TextDocument getDocument() {
		return textConverter.returnDocument();
	}
	
}
