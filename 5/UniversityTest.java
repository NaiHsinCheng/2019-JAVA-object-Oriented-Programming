class Student{

	String name;
	int credit;
	
	public Student(String n, int c) {
		name = n;
		credit = c;
	}
	
	public String getName() {
		return name;
	}

	public boolean isOK(){
		if(credit>=100)
			return true;
		else
			return false;
	}

}


class University{
	public Student[] students;
	void list(){
		for(int I=0; I<students.length; I++)
		{
			System.out.println(students[I].getName() + "は卒業できる: " + students[I].isOK());
		}
	}
}

class UniversityTest {
	
	public static void main(String[] args) {
		University waseda = new University();
		Student[] s = new Student[] {
				new Student("田中", 100), 
				new Student("山本", 50),
				new Student("森", 68),
		};
		waseda.students = s;
		waseda.list();
	}

}
