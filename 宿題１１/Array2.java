public class Array2 {
	public static void main(String[] args) {
		int[][] vs = new int[][]{
			{ 62, 90, 75 },
			{ 100, 0, 50 },
			{ 30, 40 }
		};
		int sum = 0;
		int big=vs[0][0];
		int small=vs[0][0];
		double mean;
		int count =0;
		for (int i = 0; i < vs.length; i++) {
			for (int j = 0; j < vs[i].length; j++){
				count++;
				sum += vs[i][j];
				if(vs[i][j]>big) big=vs[i][j];
				if(vs[i][j]<small) small=vs[i][j];
			}
		}
		mean=(double)sum/count;
		System.out.println("平均値:"+mean);
      		System.out.println("最小値:"+small);
     		System.out.println("最大値:"+big);
     		System.out.println("全ての値:"+sum);

	}
}
