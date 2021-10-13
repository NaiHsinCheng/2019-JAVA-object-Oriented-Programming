class File{
	public String name;
	public int size;
	File(String n, int s){
		name = n;
		size = s;
	}
	String getName(){ return name; }
	int getSize(){ return size; }
}

class Directory{
	public String name;
	public int size;
	Directory[] DirectoryList = new Directory[10];
	int li=0;
	Directory(String n){
		name=n;
		size=1;
	}
	int count=0;
	void add(File f){
		if(count<10){
			size+=f.getSize();
		}
		count++;
	}
	void add(Directory d){
		if(count<10){
			DirectoryList[li]=d;
			li++;
		}
		count++;
	}
	String getName(){ return name; }
	int getSize(){ 
		for(int I=0;I<li;I++)
		{
			size+=DirectoryList[I].getSize();
		}
		return size;
	 }
}

public class FileTest {
   public static void main(String[] args) {
      Directory d1 = new Directory("docs");
      Directory d2 = new Directory("excels");
      File f1 = new File("aaa.xls", 850);
      File f2 = new File("temp.txt", 100);
      d1.add(d2);
      d2.add(f1);
      d1.add(f2);
      System.out.println(d1.getSize());
      System.out.println(d1.getName());
      Directory d3 = new Directory("test");
      for(int i = 0; i < 20; i++) {
         d3.add(new File("dummy" + i, 10));
      }
      System.out.println(d3.getSize());
   }
}