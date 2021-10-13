class Factory{
	public String name;
	Factory(){}
	Factory(String s){
		name = s;
	}
	
	public String produce(){
		return null;
	}
}

class CarFactory extends Factory{
	CarFactory(){
		name = "車工場";
	}
	public String produce(){
		return "車";
	}
}

class BikeFactory extends Factory{
	BikeFactory(){
		name = "自転車工場";
	}
	public String produce(){
		return "自転車";
	}
}

class FactoryTest {
   public static void main(String[] args) {
     Factory[] factories = new Factory[] {
        new BikeFactory(),
        new CarFactory(),
        new CarFactory()
     };
     for(int i = 0; i < factories.length; i++) {
		System.out.println(factories[i].name + "の" + factories[i].produce());
     }
}
}
