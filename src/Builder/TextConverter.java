package Builder;

import Element.*;
import TextDocument.PlainTextDocument;

public interface TextConverter {

	public void preamble();
	public void postamble();
	public void addHeading(Heading heading);
	public void addParagraph(Paragraph paragraph);
	public void addTable(Table table);
	public void addBulletList(BulletList bulletlist);
	public PlainTextDocument returnDocument();
	
}
