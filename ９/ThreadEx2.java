class ThreadXX2 extends Thread {
   MessagePrint m = null;

   public ThreadXX2(MessagePrint nm) {
      super();
      m = nm;
   }

   public void run() {
     	while(true) {
		synchronized(m){
			m.notifyAll();
        		m.message("XX");
			try {
		  	  m.wait();
       			}
       			catch (InterruptedException e) {
               		}
		}
        }
   }

}

class ThreadYY2 extends Thread {
   static boolean available = true;

   MessagePrint m = null;

   public ThreadYY2(MessagePrint nm) {
      super();
      m = nm;
   }

   public void run() {
     	while(true) {
		synchronized(m){
			m.notifyAll();
        		m.message("YY");
			try {
			    m.wait();
       			}
       			catch (InterruptedException e) {
               		}
		}
      	}

   }
}

class MessagePrint {
   public void message(String text) {
      System.out.println(text);
   }
}

public class ThreadEx2 {
   public static void main(String[] args) {
      MessagePrint m = new MessagePrint();
      new ThreadXX2(m).start();
      new ThreadYY2(m).start();
   }
}
