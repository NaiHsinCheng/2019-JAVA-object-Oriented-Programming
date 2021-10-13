abstract class Element{
	abstract public void print();
	public void add(Element E){}
	
}

class Paragraph extends Element{
	static int count=0;
	int number;
	int inter=0;
	Element[] ins = new Element[10];

	Paragraph(){
		count++;
		number=count;
	}
	public void add(Element E){
		if(inter<=10){
			ins[inter]=E;
			inter++;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void print(){
		System.out.println("<p"+(char)(number+48)+">");
		for(int I=0;I<count;I++){
			if(ins[I]!=null)
				ins[I].print();
		}
		System.out.println("</p"+(char)(number+48)+">");
	}
}

class Text extends Element{
	String t;
	Text(String T){
		t=T;
	}
	public void print(){
		System.out.println("<t>"+t+"</t>");
	}
}

public class TagMain {
	public static void main(String[] args) {
		Element p1 = new Paragraph();
		Element p2 = new Paragraph();
		Element t1 = new Text("aabbcc");
		Element t2 = new Text("XYZ");
		Element t3 = new Text("10000");
		try {
			p1.add(t1);
			p1.add(t2);
			p2.add(t3);
			p1.add(p2);
			while(true) {
				p1.add(new Paragraph());
			}
		} catch(RuntimeException re) {
		}
		p1.print();
	}
}
