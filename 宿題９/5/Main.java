public class Main {
   public static void main(String[] args) {
      Host host = new Host();
      Data data1 = host.request(10);
      Data data2 = host.request(20);
      Data data3 = host.request(30);
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
      }
      System.out.println(data1.getContent());
      System.out.println(data2.getContent());
      System.out.println(data3.getContent());
   }
}

