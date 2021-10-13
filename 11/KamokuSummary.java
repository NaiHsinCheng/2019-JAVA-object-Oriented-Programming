import java.util.*;

public class KamokuSummary {
   public static void main(String[] args) {
      ArrayList kamoku = new ArrayList();
      kamoku.add(new Integer(80));
      kamoku.add(new Integer(100));
      kamoku.add(new Integer(90));
      kamoku.add(new Integer(75));
      kamoku.add(new Integer(90));

      int count=0;
      for(int I=0;I<kamoku.size();I++){
            System.out.println(kamoku.get(I));
            count+= (int)kamoku.get(I);
      }
       System.out.println("合計:"+ count);
       System.out.println("平均:"+ count/5);
   }
}
