import java.util.Random;
public class Room {
   private static int full =0;
   private Random random = new Random();
   public synchronized void rest() {
	if(full==0){
     		System.out.println("Start resting :" + Thread.currentThread().getName());
     		full=1;
      		try {
        		Thread.sleep(random.nextInt(5000));
			wait();
    		} catch (InterruptedException e) {}
   	        System.out.println("End resting :" + Thread.currentThread().getName());
		full=0;
	}else{ notifyAll(); }
   }
}
