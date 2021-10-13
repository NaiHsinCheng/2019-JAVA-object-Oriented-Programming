package heidi88922;

public class animal{

	//クラス内でのみ使える
	private String name;

	//同一パッケージからのみ
	animal(String n){
		name=n;
	}
	
	//同一パッケージとサブクラスからのみ
	protected void travel(){
		System.out.println(name+" travels");
	}
	
	//あらゆるところから
	public void eat(){
		System.out.println(name+" eats");
	}
	
}
