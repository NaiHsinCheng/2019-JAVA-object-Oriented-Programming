class A{
	static int count=0;
	static String s="";

	A(){
		s="a";
		++count;
	}
	A(String st){  }

	public String m(){
		return s;
	}

	static int getCounter(){
		return count;
	}
}

class B extends A{
	B(){ }
	B(A a){
		super(s);
		s="b"+s;
		s+="b";
		++count;
	}
	B(B b){
		super(s);
		s="b"+s;
		s+="b";
		++count;
	}
	public String m(){
		return s;
	}
}

public class ABClient {
	public static void main(String[] args) {
		System.out.println( A.getCounter() );
		System.out.println( new A().m() );
		System.out.println( new B( new A() ).m() );
		System.out.println( new B( new B( new A() ) ).m() );
		System.out.println( A.getCounter() );
	}
}
