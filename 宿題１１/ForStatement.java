public class ForStatement {
   public static void main(String[] args) {
      int i=0;
      while(i < 10) {
         int j=0;
         System.out.print(i + ":"); //改行なし文字列表示
         while(j < i) {
            System.out.print("*");
	    j++;
         }
         System.out.println("");
	 i++;
      }
   }
}
