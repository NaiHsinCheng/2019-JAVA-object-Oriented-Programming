class ExceptionExam {
	
	public static void main(String[] args) {
		int[] array = new int[3];

        	try{
			for(int i = 0; i < 4; i++){
				array[i] = 0;
			}
        	}catch(ArrayIndexOutOfBoundsException e){
			System.out.println( e );
		}
		System.out.println("プログラムを終了します。");
	}
	
}
