import java.util.*;

public class KamokuSummary2 {
   public static void main(String[] args) {
      Map<String,Integer> kamoku = new HashMap<String,Integer>();
      kamoku.put("高橋",90);
      kamoku.put("山本",90);
      kamoku.put("佐藤",100);
      kamoku.put("田中",80);
      kamoku.put("渡辺",75);


      int count=0;
      for(String name: kamoku.keySet()){
            System.out.println(name + "->" + kamoku.get(name));
            count+= kamoku.get(name);
      }
       System.out.println("合計:"+ count);
       System.out.println("平均:"+ count/5);
   }
}
