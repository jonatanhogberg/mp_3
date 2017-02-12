package Element;

import Builder.TextConverter;

public class Visitor {
	
	private TextConverter converter;
	
	public Visitor(TextConverter converter) {
		this.converter = converter;
	}
	
	public void visit(Paragraph e) {
		converter.addParagraph(e);
	}
	
	public void visit(BulletList e) {
		converter.addBulletList(e);
	}
	
	public void visit(Table e) {
		converter.addTable(e);
	}
	
	public void visit(Heading e) {
		converter.addHeading(e);
	}
}
