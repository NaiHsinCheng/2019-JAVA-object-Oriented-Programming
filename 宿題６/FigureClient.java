class Point extends Figure{
	int x,y;
	Point(){}
	Point(int X, int Y){
		x=X;
		y=Y;
	}

	public String draw(){
		return "("+x+","+y+")";
	}

	public void move(int mx, int my){
		x+=mx;
		y+=my;
	}
}

class Line extends Point{

	Point p1,p2;

	Line(Point P1, Point P2){
		p1=P1;
		p2=P2;
	}

	public String draw(){
		return "(" + p1.draw() + "," + p2.draw() + ")";
	}
	public void move(int mx, int my){
		p1.move(mx,  my);
		p2.move(mx, my);
	}
}
abstract class Figure{
	abstract String draw();
	abstract void move(int x, int y);
}

public class FigureClient {
   public static void main(String[] args) {
     Figure[] figures = new Figure[2];
     figures[0] = new Point(0,0);
     figures[1] = new Line(new Point(5,8), new Point(10,20));
     for(int i = 0; i < figures.length; i++) {
        figures[i].move(100,200);
        System.out.println(figures[i].draw());
     }
  }
}