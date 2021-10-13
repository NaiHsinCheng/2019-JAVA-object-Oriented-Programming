import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
 
		int I=0;
		while(true){

			System.out.printf("F[%d]=%d\n",I,F(I));
			if(F(I)>10000)
				break;
			I++;
		}
	}

	private static int F(int n){ 
		if(n==0)
		{	return 0; }
		else if(n==1) 
		{	return 1; }
		else 
		{	return F(n-1)+F(n-2); }
	} 
}

