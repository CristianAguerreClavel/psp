
public class Lince implements Runnable {

	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Lince");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
