public class Host {
   public Data request(final int number) {
      final FutureData future = new FutureData();
      new Thread() {
         public void run() {
            RealData realdata = new RealData(number);
            future.setRealData(realdata);
         }
      }.start();
      return future;
   }
}

