import java.util.Scanner;

public class TogglingCases {

	public static void main(String[] args) {

	// 標準入力からデータを読み込む準備
	try (Scanner sc = new Scanner(System.in)) {

		String line = sc.nextLine();
		String answer = "";
		int length = line.length();
		for (int i = 0; i < length; i++) {
 			// 文字列(line)からi番目の文字を取り出す
			char ch = line.charAt(i);
			// Character.isLowerCase で小文字かどうか判断可能
			if(Character.isLowerCase(ch))
			{
				answer += Character.toUpperCase(ch);
			}
			else
			{
				answer += Character.toLowerCase(ch);
			}
			// Character.toUpperCase, Character.toLowerCase で変換
			// 記号は上記メソッドで変換にかけても変化しない
		}
		System.out.println(answer);
	}
	}
}