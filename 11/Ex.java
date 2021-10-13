class One {
	public int value;
	public int get(){ return value; }
}

class Two extends One {
	public int get(){ return value*2; }
}

class Three extends One {
	public int get(){ return value*3; }
}

public class Ex {
   public static void main(String[] args) {
    	One o = new One();
	Two t = new Two();
	Three th = new Three();
	o.value=10;
	t.value=10;
	ths.value=10;
	System.out.println(o.get());
	System.out.println(t.get());
	System.out.println(th.get());
   }
}
