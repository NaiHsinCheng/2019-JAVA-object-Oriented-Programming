interface h{
	String[] getperson();
	String[] getpet();
}

class home implements h{
	int countPerson=0;
	int countPet=0;
	String[] person= new String[5];
	String[] pet= new String[20];

	public void setPerson(String name){
		countPerson++;
		if(countPerson*4+countPet>20){
			countPerson--;
			throw new RuntimeException();
		}
		person[countPerson-1]=name;
	}
	public void delPerson(String name){
		int check=0;
		for(int I=0; I<countPerson;I++){
			if(person[I]==name)
				check=I;
		}
		for(int j=0;j<countPerson;j++){
			if(j<check)
				person[j]=person[j];
			else{
				person[j]=person[j+1];
			}

		}
		countPerson--;
	}
	public void setPet(String name){
		countPet++;
		if(countPerson*4+countPet>20){
			countPet--;
			throw new RuntimeException();
		}
		pet[countPet-1]=name;
	}
	public void delPet(String name){
		int check=0;
		for(int I=0; I<countPet;I++){
			if(pet[I]==name)
				check=I;
		}
		for(int j=check;j<countPet-1;j++){
			if(j<check)
				pet[j]=pet[j];
			else
				pet[j]=pet[j+1];
		}
		countPet--;
	}
	public String[] getperson(){
		String[] p= new String[countPerson];
		for(int I=0;I<countPerson;I++){
			p[I]=person[I];
		}
		return p;
	}
	public String[] getpet(){
		String[] p= new String[countPet];
		for(int I=0;I<countPet;I++){
			p[I]=pet[I];
		}
		return p;
	}
	public void print(){
		System.out.println("この家に登録された全ての人：");
		for(int I=0;I<countPerson;I++){
			System.out.println(" "+person[I]);
		}
		System.out.println("この家に登録された全てのペット：");
		for(int I=0;I<countPet;I++){
			System.out.println(" "+pet[I]);
		}
	}
}

public class HouseMain {
   public static void main(String[] args) {
	home a = new home();
	System.out.println("test set():");
	a.setPerson("佐藤");
	a.setPerson("山田");
	a.setPet("犬");
	a.setPet("猫");
	a.print();

	System.out.println("");
	System.out.println("test del():");
	a.delPerson("佐藤");
	a.delPet("猫");
	a.print();

	String[] p;
	p=a.getperson();
	System.out.println("");
	System.out.println("test gepersont():");
	for(int I=0;I<p.length;I++){
		System.out.println(" "+p[I]);
	}	
	p=a.getpet();
	System.out.println("");
	System.out.println("test getpet():");
	for(int I=0;I<p.length;I++){
		System.out.println(" "+p[I]);
	}	

	System.out.println("");
	System.out.println("test over:");
	a.setPerson("田中");
	a.setPerson("花子");
	a.setPerson("松子");
	a.setPerson("村松");

   }
}
