public class FutureData implements Data {
   private RealData realdata = null;
   private boolean ready = false;
   public synchronized void setRealData(RealData r) {
      if (ready) {
         return;
      }
      realdata = r;
      ready = true;
      notifyAll();
   }
   public synchronized String getContent() {
      while (!ready) {
         try {
            wait();
         } catch (InterruptedException e) {
         }
      }
      return realdata.getContent();
   }
}

