package data;

public class DataClient {

	public static void main(String[] args) {
		Data d = new Data();
		d.set(100,"New");
		System.out.println(d.getNumber());
		System.out.println(d.getText());
	}

}
