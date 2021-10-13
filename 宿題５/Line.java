public class Line {

	double x1,x2,y1,y2;

	Line(double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public String toString(){
		return "(" + x1 + "," + y1 + ")-(" + x2 + "," + y2 + ")";
	}
	
	public double getLength(){
		return  Math.abs( Math.sqrt( Math.pow(x1-x2,2) + Math.pow(y1-y2,2)));
	}
	
	public static void main(String[] args) {
		Line line1 = new Line(10.5, 20.1, 100.0, 50.0);
		Line line2 = new Line(-1.0, 0.0, 0.0, 1.0);
		System.out.println(line1);
		System.out.println(line1.getLength());
		System.out.println(line2);
		System.out.println(line2.getLength());
	}
}
