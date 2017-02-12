package Element;


public class Table implements Element {

	@Override
	public void addElement(Element e) {
		// TODO Auto-generated method stub
		
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
