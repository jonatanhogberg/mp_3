package Factory;

import Element.BulletList;
import Element.Heading;
import Element.Paragraph;
import Element.Table;
import TextDocument.*;

public interface ElementFactory {
	
	public Heading createHeading(String text);
	public Paragraph createParagraph(String text);
	public BulletList createBulletList(String text);
	public Table createTable(String text);
	
}
