package city;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class House {
	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		animals[0] = new Dog();
		animals[1] = new Dog();
		animals[2] = new Dog();
		animals[3] = Cat.getInstance();
		// animals[3] = new Cat(); 
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].say());
		}	
	}
}
