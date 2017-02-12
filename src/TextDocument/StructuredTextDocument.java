package TextDocument;

import java.util.*;
import Element.Element;

public class StructuredTextDocument extends TextDocument {
	
	private List<Element> elements;
	
	public StructuredTextDocument() {
		elements = new ArrayList<Element>();
	}

	public void addElement(Element element) {
		elements.add(element);
	}
	
	public List<Element> getList() {
		return elements;
	}
}
