import java.io.*;
 
public class CopyingFile {
    public static void main(String args[]) throws IOException {
		long timeStart, timeEnd;
		timeStart = System.currentTimeMillis();

        	InputStream is=null;
       		OutputStream os=null;
		int s = 0;
		
     		try {
			if(args[2]=="true"){
				is = new BufferedInputStream(new FileInputStream(args[0]));
        			os = new BufferedOutputStream(new FileOutputStream(args[1]));
				while((s = is.read()) != -1) {
           				 os.write(s);
        			}

			}else{
				 is = new FileInputStream(args[0]);
       				 os = new FileOutputStream(args[1]);
        			 while((s = is.read()) != -1) {
           				 os.write(s);
				 }
			}
    		 } catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
      		 } catch(IOException ioe) {
			ioe.printStackTrace();
     		 }finally{
		  	is.close();
       		 	os.close();
			timeEnd = System.currentTimeMillis();
			System.out.println( (timeEnd - timeStart)/1000 );
		 }

	}
}
