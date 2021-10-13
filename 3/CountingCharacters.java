import java.util.Scanner;

public class CountingCharacters {
	public static void main(String[] args) {

	
	try(Scanner sc = new Scanner(System.in)){
 	// control+D 終了
		int[] counter = new int[128];

		while(sc.hasNext()){
			 String str = sc.nextLine().toLowerCase();
			 for(int I =0; I < str.length(); I++){
				counter[str.charAt(I)]++;
			 }
		}

		for(char ch='a';ch<='z';ch++){
			System.out.println(ch + " : "+ counter[ch]);
		}

	}
	}

}