class Shop{
	public String name;
	Shop(String n){ name = n; }
	String sell(){
		return null;
	}
}
class Bakery extends Shop{
	Bakery(){
		super("パン屋");
	}
	String sell(){
		return "パン";
	}
}
class FlowerShop extends Shop{
	FlowerShop(){
		 super("花屋");
	 }
	String sell(){
		return "花";
	}
}

class ShopTest {
   public static void main(String[] args) {

     Shop[] mall = new Shop[] {
        new FlowerShop(),
        new Bakery(),
        new FlowerShop()
     };

     for(int i = 0; i < mall.length; i++) {
	System.out.println(mall[i].name + "の" + mall[i].sell()); 
     }

   }
}
