class item {

	public String name;
	public int price;
	static int count = 0 ;

	item(String name, int price){
		this.name = name;
		this.price = price;
		count++;
	}
	
	public String toString(){
		return name + "," + price;
	}
	
	static int getNumberOfInstances(){
		return  count;
	}
	
}

class Cart {

	item[] items= new item[10];
	int count = 0;

	void addItem(item I){
		if(count<10)
		{
			items[count]=I;
			count++;
		}
	}
	
	void info(){
		for(int I=0 ; I<count;I++)
		{
			System.out.println(items[I].toString());
		}
	}

	
	public static void main(String[] args) {
		System.out.println(item.getNumberOfInstances());
		Cart cart = new Cart();
		item i1 = new item("PC", 98000);
		item i2 = new item("Display", 40000);
		cart.addItem(i1);
		cart.addItem(i2);
		cart.info();
		System.out.println(item.getNumberOfInstances());
	}
}