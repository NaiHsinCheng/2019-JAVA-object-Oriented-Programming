
interface Movable{
	void move();
}

class Animal
	implements Movable{
		public void move(){
			System.out.println("Animal moved.");
		}
	}



class Robot
	implements Movable{
		public void move(){
			System.out.println("Robot moved.");
		}
	}	



class MovableTest {
   public static void main(String[] args) {
       Movable m1 = new Animal();
       Movable m2 = new Robot();
       m2.move();
       m1.move();
       m2.move(); 
   }
}