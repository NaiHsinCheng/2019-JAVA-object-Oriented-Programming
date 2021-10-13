import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int r = ran.nextInt(1000);
		int c=0;

		for(int I=1; I<=10; I++){
			System.out.printf("%d回目: 0～999までの整数を入力してください。 \n",I);
			int a = sc.nextInt();
			if(a<r)
				System.out.printf("入力は正解よりも小さいです。\n");
			else if (a>r)
				System.out.printf("入力は正解よりも大きいです。\n");
			else
			{	System.out.printf("%d回目で正解です。 \n",I); c=1; break;}

		}

		if(c==0)
			System.out.printf("正解は %d でした。Game Over\n",r);
	}
}
