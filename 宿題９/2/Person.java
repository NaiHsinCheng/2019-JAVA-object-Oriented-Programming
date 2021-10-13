public class Person {

   private final Address address;


   public Person(final String s) {
      address = new Address(s);
   }

   public Address getAddress() {
      return address;
   }

   public String toString() {
      return "Living in " + address.getText().toString();
   }
}
