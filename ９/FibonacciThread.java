public class FibonacciThread extends Thread {
	
	private int value = 0;
	
	public FibonacciThread(int v) {
		value = v;
	}
	
	public void run() {
		printFibonacci(value);
	}
	
	public static long fibonacci(int n) {
		return (n == 0 || n == 1) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void printFibonacci(int n) {
		System.out.println(Thread.currentThread() + "" + fibonacci(n));
	}
	
	public static void main(String[] args) {
		long previousTime = 0;
		
		previousTime = System.currentTimeMillis();

		// HERE
		Thread f0 = new FibonacciThread(30);
		Thread f1 = new FibonacciThread(31);
		Thread f2 = new FibonacciThread(32);
		Thread f3 = new FibonacciThread(33);
		Thread f4 = new FibonacciThread(34);
		Thread f5 = new FibonacciThread(35);
		Thread f6 = new FibonacciThread(36);
		Thread f7 = new FibonacciThread(37);
		Thread f8 = new FibonacciThread(38);
		Thread f9 = new FibonacciThread(39);
		f0.start();
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();
		f6.start();
		f7.start();
		f8.start();
		f9.start();
		try{
			f0.join();
			f1.join();
			f2.join();
			f3.join();
			f4.join();
			f5.join();
			f6.join();
			f7.join();
			f8.join();
			f9.join();
		}catch(InterruptedException e){          }
		// HERE

		System.out.println("Time spent for multi-threaded execution: " 
				+ (System.currentTimeMillis() - previousTime));
		
		previousTime = System.currentTimeMillis();
		for(int i = 30; i < 40; i++) {
			printFibonacci(i);
		}
		System.out.println("Time spent for single-threaded execution: " 
				+ (System.currentTimeMillis() - previousTime));
	}
}
