import java.io.*;
import java.net.*;
public class DisplayURL {
   public static void main(String[] args) {
      try {
         URL url = new URL(args[0]);
         BufferedReader reader =
         new BufferedReader(new InputStreamReader(url.openStream()));
         while (true) {
            String line = reader.readLine();
            if (line == null) {
               break;
            }
            System.out.println(line);
         }
         reader.close();
      } catch (MalformedURLException mue) {
         System.out.println("URLの形式が誤っています:" + mue);
      } catch (IOException ioe) {
         System.out.println("I/Oエラーです:" + ioe);
      }
   } }