package Builder;

import Element.*;
import Element.sub.Li;
import TextDocument.PlainTextDocument;

public interface TextConverter {

	public void preamble();
	public void postamble();
	public void addHeading(Heading heading);
	public void addParagraph(Paragraph paragraph);
	public void addTable(Table table);
	public void addBulletList(BulletList bulletlist);
	public void addLi(Li li);
	public PlainTextDocument returnDocument();
	
}
