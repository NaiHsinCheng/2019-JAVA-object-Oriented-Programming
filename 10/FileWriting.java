import java.io.*;
 
public class FileWriting {
    public static void main(String args[]) throws IOException {
	BufferedReader keyboard = null;
        File file = new File(args[0]);
        file.createNewFile();
	FileWriter writer = new FileWriter(file);

     	try {
         	keyboard = new BufferedReader(new InputStreamReader (System.in));
         	System.out.println("Enter sentences, 'End' to quit.");
         	String input;
		input = keyboard.readLine();
        	while(!input.equals("END")){
			writer.write(input);
			writer.write("\n");
		        writer.flush();
			input = keyboard.readLine();
        	}
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
         	String line = null;
         	while ((line = reader.readLine()) != null) {
            		System.out.println(line);
         	}
         	reader.close();
      	}finally {
         	if (keyboard != null) {
           		 keyboard.close();
         	}
      		writer.close();
        }
}
}
