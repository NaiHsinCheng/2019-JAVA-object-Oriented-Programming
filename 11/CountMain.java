import java.io.*;
import java.util.*;
 
public class CountMain {
    public static void main(String args[]) throws IOException {
		
		TreeMap<String,Integer> treeMap = new TreeMap<>();		

        	BufferedReader reader = null;

		try {
  			reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
			String str = null;
  			while ((str = reader.readLine()) != null) {
				str=str.replace(",","");
				str=str.replace(".","");
				String[] ss = str.split(" ");
				for(int I=0;I<ss.length;I++){
					ss[I]=ss[I].toLowerCase();
					if (treeMap.containsKey(ss[I])) {
               				 	int value = treeMap.get(ss[I]);
               				 	value ++;
               				 	treeMap.put(ss[I], value);
           				 } else {
                				treeMap.put(ss[I], 1);
           			 	 }	
				}
 			}
			for (String name : treeMap.keySet()) {
           			 System.out.println( name + "," + treeMap.get(name));
      			}
		} catch (FileNotFoundException e) {
		  	e.printStackTrace();
		} catch (IOException e) {
		 	 e.printStackTrace();
		} finally {
		 	 try {
			   	 reader.close();
		 	 } catch (IOException e) {
		   		 e.printStackTrace();
			 }
		}
     }
}
