package Builder;

import Element.*;
import TextDocument.HTMLDocument;
import TextDocument.PlainTextDocument;

public class ToHTMLConverter implements TextConverter {
	
	private StringBuilder documentText = new StringBuilder();

	@Override
	public void preamble() {
		documentText.append("<html>");
	}

	@Override
	public void postamble() {
		documentText.append("</html>");
	}

	@Override
	public void addHeading(Heading heading) {
		documentText.append("<h1>").append(heading.toString()).append("</h1>");
	}

	@Override
	public void addParagraph(Paragraph paragraph) {
		documentText.append("<p>").append(paragraph.getText()).append("</p>");
	}

	@Override
	public void addBulletList(BulletList bulletlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTable(Table table) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PlainTextDocument returnDocument() {
		return new HTMLDocument(documentText);
	}
}
