package ejer2;

public class Hilo2 implements Runnable {
	
	
	public void run(){
		System.out.println("Hilo2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(){
		/*Hilo2 h = new Hilo2();
		h.run();*/
		
	
		
	}
	
}
