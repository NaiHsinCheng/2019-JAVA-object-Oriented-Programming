import java.util.Scanner;

public class SmallLargeEqual{
    public static void main(String[] args) {

    // 標準入力からデータを読み込む準備
    Scanner sc = new Scanner(System.in);

    // 2つの文字の固まりを整数値と想定して読み込む
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a<b){
	System.out.println("a < b");
    }else if(a==b){
	System.out.println("a == b");
    }else{
	System.out.println("a > b");
    }

    
    sc.close();
} 
}