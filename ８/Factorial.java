public class Factorial {
	public static int factorial1(int n){
		int count=1;
		if(n>1){
			for(int I=2;I<=n;I++){
				count=count*I;
			}
		}
		return count;
	}
	public static int factorial2(int n){
		if(n<=1){return 1;}
		return n * factorial2(n-1);
	}
	public static int factorial3(int n){
		long count=1;
		try{
			for(int I=2;I<=n;I++){
				if(count*I>Integer.MAX_VALUE)
					throw new RuntimeException("RuntimeException");
				else
					count=count*I;
			}

		}catch(RuntimeException r){
			System.out.println(r);
			return -1;
		}

		return (int)count;
	}
	public static void main(String[] args) {
		System.out.println(factorial1(0));
		System.out.println(factorial2(0));
		System.out.println(factorial1(10));
		System.out.println(factorial2(10));
		System.out.println(factorial3(13));
    }
}
