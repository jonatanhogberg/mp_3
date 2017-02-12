package Element;


public class Table implements Element {
	
	private String text;

	public Table(String text) {
		this.text = text;
	}
	
	@Override
	public void addElement(SubElement e) {
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
