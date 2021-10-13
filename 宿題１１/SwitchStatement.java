public class SwitchStatement {
   public static void main(String[] args) {
      char answer = 's';
      switch(answer) {
         case 'y':
            System.out.println("Yes");
            break;
         case 'n':
            System.out.println("No");
            break;
         default:
            System.out.println("エラー");
            break;
      }
   }
}
