package Factory;

import TextDocument.*;

public abstract class ElementFactory {
	
	public Header createHeader(String text){
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
