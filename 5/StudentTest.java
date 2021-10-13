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

class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("青木", 80);
		Student s2 = new Student("田中", 120);
		System.out.println(s1.getName() + "は卒業できる: " + s1.isOK());
		System.out.println(s2.getName() + "は卒業できる: " + s2.isOK());
	}

}
