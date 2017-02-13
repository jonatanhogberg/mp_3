package main;


import Builder.StructuredTextDocumentParser;
import Builder.ToHTMLConverter;
import Element.BulletList;
import Element.Heading;
import Element.Paragraph;
import Element.sub.Li;
import TextDocument.StructuredTextDocument;

public class Main {
	public static void main(String [] args) {
		StructuredTextDocument std = new StructuredTextDocument();
		
		Heading heading = new Heading("Heading¢");
		Paragraph p1 = new Paragraph("Paragraph1");
		Paragraph p2 = new Paragraph("Paragraph2");
		
		std.addElement(heading);
		std.addElement(p1);
		std.addElement(p2);
		
		StructuredTextDocumentParser parser = new StructuredTextDocumentParser(new ToHTMLConverter(), std);
		
		parser.parse();
		System.out.println(parser.getDocument().toString());
		
	}
}
