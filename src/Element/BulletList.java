package Element;

public class BulletList implements Element {

	public BulletList(String text) {
		
	}
	
	@Override
	public void addElement(SubElement e) {
		
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
