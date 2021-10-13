class QueueProducer extends Thread {
   Queue queue = null;
   QueueProducer(Queue q) {
      queue = q;
   }

   public void run() {

      for (int i = 0; i < 30; i++) {
	 synchronized(queue){
		queue.notifyAll();
		if(queue.isFull()){
			try {
		  		  queue.wait();
       			}catch (InterruptedException e) {	}
		}
     		queue.enqueue(i);
     		System.out.println(getName() + " " + i + " 追加");
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
