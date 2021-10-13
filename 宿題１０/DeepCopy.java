import java.io.*;
public class DeepCopy {

   public static void main(String[] args) {
      copyFileOrDirectory(args[0], args[1]);
   }

   public static void copyFileOrDirectory(String srcName, String dstName) {

      File srcFile = new File(srcName);

      if( srcFile.isFile() ) {
         copyFile(srcFile.getAbsolutePath(), dstName);

      } else if( srcFile.isDirectory() ) {

         File dstDir = new File(dstName);
         dstDir.mkdirs();
	 String[] dir = srcFile.list();
	 File[] dirlist = srcFile.listFiles();
	 for (int i = 0; i < dirlist.length; i++) {
 		  copyFileOrDirectory( dirlist[i].getAbsolutePath(), dstName+"/"+dir[i]);
	 }

      }
   }

   public static void copyFile(String srcName, String dstName){
      		InputStream is=null;
       		OutputStream os=null;
		int s = 0;
		
     		try {

			is = new BufferedInputStream(new FileInputStream(srcName));
        		os = new BufferedOutputStream(new FileOutputStream(dstName));
			while((s = is.read()) != -1) {
           			os.write(s);
        		}
		  	is.close();
       		 	os.close();

    		 } catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
      		 } catch(IOException ioe) {
			ioe.printStackTrace();
     		 }

  }
} 
