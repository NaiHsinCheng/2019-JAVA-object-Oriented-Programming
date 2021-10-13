import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.printf("10000円札: %d枚\n",a/10000);
		System.out.printf("5000円札: %d枚\n",a%10000/5000);
		System.out.printf("1000円札: %d枚\n",a%10000%5000/1000);
		System.out.printf("500円玉: %d枚\n",a%10000%5000%1000/500);
		System.out.printf("100円玉: %d枚\n",a%10000%5000%1000%500/100);
		System.out.printf("50円玉: %d枚\n",a%10000%5000%1000%500%100/50);
		System.out.printf("10円玉: %d枚\n",a%10000%5000%1000%500%100%50/10);
		System.out.printf("5円玉: %d枚\n",a%10000%5000%1000%500%100%50%10/5);
		System.out.printf("1円玉: %d枚\n",a%10000%5000%1000%500%100%50%10%5);

		
	}
}
