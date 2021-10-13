public class Length {
	
	public static char[] encode(char[] data) {

		char[] check = new char[data.length];

		char temp=data[0];
		int count =1;
		int key=0;

		for(int j=1;j<data.length;j++){
			if(data[j]==temp && count<9)
				count++;
			else{
				check[key]=(char)(count+48);
				count=1;
				check[key+1]=temp;
				temp=data[j];
				key+=2;
			}
		}

		check[key]=(char)(count+48);
		check[key+1]=temp;
		key+=2;
		char[] result=new char[key];

		for(int i=0;i<result.length;i++){
			result[i]=check[i];
		}
		return result;
		
	}
	
	public static char[] decode(char[] data) {

			int temp=0;
			String check="";
			for(int I =0;I<data.length;I++){
				if(I%2==0){
					temp = (int)(data[I]-48);
					for(int j=0;j<temp;j++){
						check+=data[I+1];
					}
				}
			}
			char[] result = check.toCharArray();

			return result;
	}
	
	public static void print(char[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		char input[] = {
				'a','a','a','a','a','a','a','a','a','a',
				'b','b','b','b','b',
				'c','c',
		};
		print(input);

		try{
			print(encode(input));
			print(decode(encode(input)));
			print(decode(input)); 
					

		}catch(java.lang.NumberFormatException e){
			System.out.println(e);
		}
	}
}
