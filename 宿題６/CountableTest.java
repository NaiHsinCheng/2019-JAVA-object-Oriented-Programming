interface Countable {
	int count();
}

class Text implements Countable {
	String St;

	Text(String s){
		if(s==null)
			St="";
		else
			St=s;
	}

	public int count(){
		return St.length();
	}
}

class IntArray implements Countable {
	int[] Ar;

	IntArray(int[] a){
		if(a==null)
			Ar=new int[0];
		else
			Ar=a;
	}

	public int count(){
		return Ar.length;
	}
}

public class CountableTest {
   public static void main(String[] args) {
     Countable[] countables = new Countable[3];
     countables[0] = new Text("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
     countables[1] = new Text("100503");
     countables[2] = new IntArray(new int[]{ 100, 50, 3 });
     for(int i = 0; i < countables.length; i++) {
        System.out.println(countables[i].count());
     }
}
}
