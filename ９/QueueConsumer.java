class QueueConsumer extends Thread {
   Queue queue = null;
   QueueConsumer(Queue q) {
      queue = q;
   }

   public void run() {
      while (true) {
	synchronized(queue){
		queue.notifyAll();
		if(queue.isEmpty()){
			try {
		  		  queue.wait();
       			}catch (InterruptedException e) {	}
		}
        	 int x = queue.dequeue();
        	 System.out.println(getName() + " " + x + " を消費");
        	 sleepRandomly();
	 }                
      }
   }

   void sleepRandomly() {
      try {
         int n = (int)(Math.random() * 1000);
         Thread.sleep(n);
      } catch (InterruptedException e) {
      }
   }
}
