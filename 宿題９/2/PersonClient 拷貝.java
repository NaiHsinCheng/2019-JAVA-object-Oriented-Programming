
import java.lang.reflect.Field;  

public class PersonClient {

   public static void main(String[] args)  throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
      Person p = new Person("Tokyo");
      System.out.println(p);

      // HERE
	Field field = Person.class.getDeclaredField("address");
	field.setAccessible(true);   
	field.set(p, new Address("Paris"));
      // HERE


      System.out.println(p);
   }

}