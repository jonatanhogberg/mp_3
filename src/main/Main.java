package main;


import Builder.StructuredTextDocumentParser;
import Builder.ToHTMLConverter;
import Element.Paragraph;
import TextDocument.StructuredTextDocument;

public class Main {
	public static void main(String [] args) {
		StructuredTextDocument std = new StructuredTextDocument();
		
		Paragraph p = new Paragraph("Hej");
		Paragraph p1 = new Paragraph("Hej");
		Paragraph p2 = new Paragraph("Hej");
		
		std.addElement(p);
		std.addElement(p1);
		std.addElement(p2);
		
		StructuredTextDocumentParser parser = new StructuredTextDocumentParser(new ToHTMLConverter(), std);
		
		parser.parse();
		System.out.println(parser.getDocument().toString());
		
	}
}
