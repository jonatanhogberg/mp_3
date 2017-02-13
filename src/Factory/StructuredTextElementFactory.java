package Factory;

import Element.BulletList;
import Element.Heading;
import Element.Paragraph;
import Element.Table;

public class StructuredTextElementFactory implements ElementFactory {

	private static StructuredTextElementFactory instance = new StructuredTextElementFactory();
	
	private StructuredTextElementFactory(){}
	
	public static StructuredTextElementFactory getInstance(){
		return instance;
	}
	
	@Override
	public Heading createHeading(String text) {
		return new Heading(text);
	}

	@Override
	public Paragraph createParagraph(String text) {
		return new Paragraph(text);
	}

	@Override
	public BulletList createBulletList(String text) {
		return new BulletList();
	}

	@Override
	public Table createTable(String text) {
		return new Table(text);
	}
}
