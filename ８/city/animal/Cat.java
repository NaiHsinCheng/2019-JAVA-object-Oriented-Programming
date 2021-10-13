package animal;

public class Cat extends Animal{
	String koe;

	Cat(){
		koe="ニャー";
	}
	static public Animal getInstance(){
		return new Cat();
	}

	public String say(){
		return koe;
	}
}
