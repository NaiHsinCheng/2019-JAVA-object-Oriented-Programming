public class Sort {
	
	static void printArray(int[] a) {
		for(int i = 0 ; i < a.length; i++ )
		{
			if(i == a.length-1)
				System.out.print(a[i] );
			else
			System.out.print(a[i]+ "," );
		}
		System.out.println();
	}
	
	static int binarySearch(int[] a, int k) {
		int low = 0;
		int high = a.length-1;
		int center = (low+high)/2+1;

		while(low <= high){
			if(k == a[center])
				break;
			else if( k >= a[center])
				low = center+1;
			else if( k <= a[center])
				high = center-1;
			center = (low+high)/2+1;
		}
		return center;
	}
	
	static void sortArray(int a[]) {
		int temp;
		for(int I=0; I<a.length; I++)
		{
			for(int j=I+1; j<a.length; j++)
			{
				if(a[j]<a[I]){
					temp = a[I];
					a[I] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {
			100, 10, 1000, 50, 10000, 999, 5
		};
		int key = 10000;
		printArray(array);
		System.out.println(key + " at " + binarySearch(array, key));
		sortArray(array);
		printArray(array);
		System.out.println(key + " at " + binarySearch(array, key));
	}
}
