public class Point {
	
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public static void main(String[] args) {
		Point[] test = {
			new Point(100,10), new Point(-5,20), new Point(0,0)
		};
		int allx = 0;
		int ally = 0;
		for(int I=0;I<3;I++){
			System.out.println(test[I].toString());
			allx += test[I].x;
			ally += test[I].y;
		}
		System.out.println("x座標値の合計 = "+allx);
		System.out.println("y座標値の合計 = "+ally);

	}
}