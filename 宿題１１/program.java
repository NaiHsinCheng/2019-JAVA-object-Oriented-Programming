import java.util.*;

public class program {
    public static void main(String[] args){
	List<Integer> list = new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
	while(true){
        	System.out.print("> ");
        	String work = s.next();
		if(work.equals("add")){
			int number = s.nextInt();
			list.add(number);
		}else if(work.equals("remove")){
			int number = s.nextInt();
			int size = list.size();
       	 		for(int i = size - 1; i >= 0; i--){
            			int item = list.get(i);
            			if(number==item){
                			list.remove(Integer.valueOf(item));
            			}
        		}
		}else if(work.equals("list")){
			for(int n: list) System.out.print(n+",");
			System.out.println("");
		}else if(work.equals("mean")){
			int mean=0;
			for(int n: list) mean+=n;
			System.out.println(mean/list.size());
		}else if(work.equals("sum")){
			int sum=0;
			for(int n: list) sum+=n;
			System.out.println(sum);
		}else if(work.equals("sort")){
			Collections.sort(list);
		}else{
			break;
		}
	}
        s.close();
    }
}