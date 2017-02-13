package Builder;

import Element.*;
import Element.sub.Li;
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
		documentText.append("<h1>").append(heading.getText()).append("</h1>");
	}

	@Override
	public void addParagraph(Paragraph paragraph) {
		documentText.append("<p>").append(paragraph.getText()).append("</p>");
	}

	@Override
	public void addTable(Table table) {
		documentText.append("<table>");
		documentText.append("</table>");
	}

	@Override
	public PlainTextDocument returnDocument() {
		return new HTMLDocument(documentText);
	}

	@Override
	public void addBulletList(BulletList bulletlist) {
		documentText.append("<ul>");
		documentText.append("</ul>");
	}

	@Override
	public void addLi(Li li) {
		documentText.append("<li>");
		documentText.append(li.getText());
		documentText.append("</li>");
	}
}
