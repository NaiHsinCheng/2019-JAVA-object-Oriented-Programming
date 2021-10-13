class ThreadXX extends Thread{
	public void run(){
		while(true){
			System.out.println("XX");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadYY implements Runnable{
	public void run(){
		while(true){
			System.out.println("YY");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		new ThreadXX().start();
		new Thread(new ThreadYY()).start();
	}
}
