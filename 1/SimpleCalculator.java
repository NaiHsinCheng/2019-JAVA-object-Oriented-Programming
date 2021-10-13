import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {

   		Scanner sc = new Scanner(System.in);

  		Double a = sc.nextDouble();
  		char op = sc.next().charAt(0);
  		Double b = sc.nextDouble();
		int answer;

		if( op == '+'){
			answer = (int)(a + b);
   		 	System.out.println(answer);
    		   	sc.close();
		}
		else if( op == '-'){
			answer = (int)(a - b);
   		 	System.out.println(answer);
    		   	sc.close();
		}
		else if( op == '*'){
			answer = (int)(a * b);
   		 	System.out.println(answer);
    		   	sc.close();
		}
		else if( op == '/'){
			answer = (int)(a / b);
   		 	System.out.println(answer);
    		   	sc.close();
		}
		else{
    		   	sc.close();
		}

    }
}
