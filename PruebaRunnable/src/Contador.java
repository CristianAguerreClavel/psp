import java.util.Random;


public class Contador implements Runnable{

	
	private int hilo;
	
	public Contador(int hilo){
		this.hilo = hilo;
	}
	
	@Override
	public void run() {
		for (int contador =1; contador <=10;contador ++){
			//System.out.println("Hilo "+hilo+"contador "+contador);
			System.out.printf("hilo=%s contador=%s\n", hilo, contador );
			sleep(getMilis(1000,3000));
		}
	}
	
	public int getMilis ( int low , int hight){
		Random random = new Random();
		return low+random.nextInt(hight);
	}
	
	private void sleep(int milis){
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}