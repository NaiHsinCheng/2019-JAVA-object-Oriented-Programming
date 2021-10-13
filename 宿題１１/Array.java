public class Array {
   public static void main(String[] args) {
      int[] values = new int[]{ 62, 90, 75 };
      int sum = 0;
      int big = values[0];
      int small = values[0];
	  double mean = 0;
      for (int i = 0; i < values.length; i++) {
         sum += values[i];
		if(values[i]>big) big=values[i];
		if(values[i]<small) small=values[i];
      }
	  mean=(double)sum/values.length;
      System.out.println("平均値:"+mean);
      System.out.println("最小値:"+small);
      System.out.println("最大値:"+big);
      System.out.println("全ての値:"+sum);

   }
}
