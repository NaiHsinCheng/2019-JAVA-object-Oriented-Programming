class Fax extends Thread {
   Scanner scanner = null;

   public Fax(Scanner s) {
      super();
      scanner = s;
   }

   public void run() {
      while(true) {
	    synchronized(scanner){
		scanner.notifyAll();
       		if(scanner.data != null) {
            		System.out.println("fax : " + scanner.data);
            		scanner.data = null;
			try {
			   scanner.wait();
       			}
       			catch (InterruptedException e) {}
	    	}
         }
      }
   }
}

