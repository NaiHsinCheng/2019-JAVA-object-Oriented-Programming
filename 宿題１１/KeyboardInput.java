import java.io.*;
public class KeyboardInput {
   public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try {
         String line = reader.readLine(); // 文字列の読み込み
         Float number = Float.parseFloat(line); // 整数への変換
         System.out.println("入力された整数: " + number);
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}

//3.5353535353
//入力された整数: 3.5353534