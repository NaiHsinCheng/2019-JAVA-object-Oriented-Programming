import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Random ran = new Random();

		double[] a = new double[1000];
		double big=0, small=100, q=0;

		for(int I=0; I<1000; I++){
			a[I]=ran.nextDouble()*100;
			q=q+a[I];
			if(big<a[I])
				big=a[I];
			if(small>a[I])
				small=a[I];
		}
		
		q=q/1000;

		System.out.printf("最大値は%fです。\n",big);
		System.out.printf("最小値は%fです。\n",small);
		System.out.printf("平均値は%fです。\n",q);
	}

}
