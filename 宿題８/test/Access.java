package test;

class Access {
	String name = null;
	private Access() {
		super();
	}
	public Access(String s) {
		this();
		name = s;
	}
	public void dosome() {
		System.out.println(name);
	}
}
