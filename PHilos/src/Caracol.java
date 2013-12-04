
public class Caracol implements Runnable {

	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Caracol");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
