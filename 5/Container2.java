public class Container2 {
	
	int[] a;
	
	Container2(int[] temp) {
		a = temp;
	}
	
	void printArray() {
		for(int i = 0 ; i < a.length; i++ )
		{
			if(i == a.length-1)
				System.out.print(a[i] );
			else
			System.out.print(a[i]+ "," );
		}
		System.out.println();
	}

	int search(int k) {
		int key=-1;
		for(int I=0; I < a.length; I++ )
		{
			if(a[I] == k){
				key=I;
				break;
			}
		}
		return key;
	}

	public static void main(String[] args) {
		int[] array = {
			100, 10, 1000, 50, 10000, 999, 5
		};
		int key = 10000;
		Container2 test = new Container2(array);
		test.printArray();
		System.out.println(key + " at " + test.search(key));
	}
}
