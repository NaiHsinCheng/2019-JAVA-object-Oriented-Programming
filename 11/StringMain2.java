
public class StringMain2 {
   static String text = "helloworld";
   public void sort() {
	char[] t = text.toCharArray();
	char temp;
	for(int I=0; I<t.length;I++){
		for(int j=I+1;j<t.length;j++){
			if(t[I]>t[j]){
				temp = t[I];
				t[I]=t[j];
				t[j]=temp;
			}
		}
	}
	
	for(int I=0; I<t.length;I++){
		System.out.print(t[I]);
	}
	System.out.print("\n");
   }
   public static void main(String[] args) {
     StringMain2 s = new StringMain2();
     s.sort();
} }