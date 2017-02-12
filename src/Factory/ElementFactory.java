package Factory;

import Element.BulletList;
import Element.Heading;
import Element.Paragraph;
import Element.Table;
import TextDocument.*;

public abstract class ElementFactory {
	
	public Heading createHeader(String text){
		return null;	
	};
	
	public Paragraph createParagraph(String text){
		return null;
	};
	
	public BulletList createBulletList(){
		return null;	
	};
	
	public Table createTable(){
		return null;	
	};
	
}
