package Element;

public class BulletList implements Element {

	@Override
	public void addElement(Element e) {
		
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
