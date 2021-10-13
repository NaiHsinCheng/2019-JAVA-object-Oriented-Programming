
public class Address {
	
	private final StringBuffer text;
	
	public Address(final String s) {
		text = new StringBuffer(s);
	}
	
	public StringBuffer getText() {
		return text;
	}
}
