public class Scanner extends Thread {
   String data = null;

   public void run() {
      while(true) {
	    synchronized(this){
		notifyAll();
         	if(data == null) {
           		 data = "値が設定されています";
           		 System.out.println("scan: " + data);
			 try {
				   this.wait();
       			 }	
       			 catch (InterruptedException e) {}
	    	}
            }
      }
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner();
      Fax fax = new Fax(scanner); 
      scanner.start();
      fax.start();
   }
}
