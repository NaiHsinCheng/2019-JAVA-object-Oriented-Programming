class Label{
	public String caption;
	public static String common;

	Label(String s){
		caption = s;
	}
	
	public void output(){
		System.out.println(common + ": " + caption);
	}
}

class LabelTest {
   public static void main(String[] args) {
		Label.common = "図";
		Label l1 = new Label("チーズを好む皇帝ペンギン");
		Label l2 = new Label("人類補完計画達成率");
		l1.output();
		l2.output();
		Label.common = "表";
		l1.output();
		l2.output();
    } 
}
