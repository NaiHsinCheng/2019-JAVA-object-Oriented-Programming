class X {
   void doX(int i) throws InterruptedException {
      Thread.sleep(100);
      System.out.println(Thread.currentThread() + " doX(" + i + ")");
   }
}

class Y {
   void doY(int i) throws InterruptedException {
      Thread.sleep(100);
      System.out.println(Thread.currentThread() + " doY(" + i + ")");
   }
}

class ThreadA extends Thread{
   X x;
   Y y;
   ThreadA(X x, Y y){
      this.x = x;
      this.y = y;
   }

   public void run(){
      for(int i = 0; i < 10; i++) {
         try {
            synchronized(x) {
               x.doX(i);
               y.doY(i);
            }		
         } catch(InterruptedException ie) {}
      }
   }
}

class ThreadB extends Thread{
   X x;
   Y y;
   ThreadB(X x, Y y){
      this.x = x;
      this.y = y;
   }

   public void run(){
      for(int i = 0; i < 10; i++) {
         try {
            synchronized(x) {
               x.doX(i);
               y.doY(i);
            }			
         } catch(InterruptedException ie) {   			
         }
      }
   }
}

public class LockTest{
   public static void main(String args[]){
      X x = new X();
      Y y = new Y();
      ThreadA a = new ThreadA(x, y);
      ThreadB b = new ThreadB(x, y);
      a.start();
      b.start();
      try {
         a.join();
         b.join();
      } catch(InterruptedException ie) {
      }
   }
}
