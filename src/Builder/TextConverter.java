package Builder;

import Element.*;
import TextDocument.PlainTextDocument;

public interface TextConverter {

	public void preamble();
	public void postamble();
	public void addHeading(Heading heading);
	public void addParagraph(Paragraph paragraph);
	public void addBulletList(BulletList bulletlist);
	public void addTable(Table table);
	public PlainTextDocument returnDocument();
	
}
