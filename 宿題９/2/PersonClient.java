public class PersonClient {

   public static void main(String[] args) {
     Person p = new Person("Tokyo");
      System.out.println(p);

      // HERE
	Address a = p.getAddress();
	a = new Address("Pairs");
	
      // HERE

      System.out.println(p);
   }

}
