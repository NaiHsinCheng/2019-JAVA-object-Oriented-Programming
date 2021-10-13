import java.io.*;

public class WhileAndString {
   public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try {
         String line;
	 String s;
         while ((line = reader.readLine()) != null) {
            s = line.toUpperCase();
            System.out.println(s);
         }
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
