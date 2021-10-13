abstract class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }

    public abstract void speak();
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void speak() {
        System.out.println("ワン");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void speak() {
        System.out.println("ニャー");
    }
}

public class Abstract {
   public static void main(String[] args) {
	Dog d = new Dog("太郎");
	Cat c = new Cat("空");
	d.speak();
	c.speak();
	System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());

	System.out.println("gcを呼び出します。");

	d = null;
        System.gc();
	System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
	d.speak();
   }
}
