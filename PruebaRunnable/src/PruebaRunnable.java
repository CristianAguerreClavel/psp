
public class PruebaRunnable {

	public static void main(String[] args) {
	
		
		for (int hilo =1 ;hilo <= 4; hilo ++){
			Thread thread = new Thread(new Contador(hilo));
			
			thread.start();
		}
	}

}
