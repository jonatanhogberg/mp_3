package Element;

import Builder.TextConverter;
import Element.sub.Li;

public class Visitor {
	
	private TextConverter converter;
	
	public Visitor(TextConverter converter) {
		this.converter = converter;
	}
	
	public void visit(Paragraph e) {
		converter.addParagraph(e);
	}
	
	public void visit(Table e) {
		converter.addTable(e);
	}
	
	public void visit(Heading e) {
		converter.addHeading(e);
	}

	public void visit(BulletList e) {
		converter.addBulletList(e);
	}
	
	public void visit(Li e) {
		converter.addLi(e);
	}
}
