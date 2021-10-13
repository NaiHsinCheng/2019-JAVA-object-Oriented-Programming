class Parents extends Thread {
   Kouza m = null;

   public Parents(Kouza nm) {
      super();
      m = nm;
      int money = (int) (Math.random() * 10000);
      Kouza.plus(money);
      m.message("親が共有口座に"+money+"を振り込んだ。口座は残り："+Kouza.money);
   }

   public void run() {
     	while(true) {
		synchronized(m){
			if(Kouza.money<10000)
				m.notifyAll();
        		int money = (int) (Math.random() * 10000);
			Kouza.plus(money);
        		m.message("親が共有口座に"+money+"を振り込んだ。口座は残り："+Kouza.money);
			try {
			    if(Kouza.money>10000)
			        m.wait();
       			}
       			catch (InterruptedException e) {
               		}
		}
        }
   }

}

class Child extends Thread {
   static boolean available = true;

   Kouza m = null;

   public Child(Kouza nm) {
      super();
      m = nm;
   }

   public void run() {
     	while(true) {
		synchronized(m){
			//if(Kouza.money>0)
				m.notifyAll();
			int money = (int) (Math.random() * Kouza.money+1);
			Kouza.spend(money);
        		m.message("子供が共有口座に"+money+"を消費した。口座は残り："+Kouza.money);
			try {
			    if(Kouza.money==0)
			        m.wait();
       			}
       			catch (InterruptedException e) {
               		}
		}
      	}

   }
}

class Kouza {
   static public int money =0;
   public void message(String text) {
      System.out.println(text);
   }
   static public void plus(int n){
	money+=n;
   }
   static public void spend(int n){
	money-=n;
   }
}

public class KouzaThread {
   public static void main(String[] args) {
      Kouza m = new Kouza();
      new Parents(m).start();
      new Child(m).start();
   }
}
