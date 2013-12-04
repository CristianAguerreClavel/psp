package hilos;

public class PHilos2 implements Runnable{

	String identificador = null;
	int tiempo = 0;
	
	public PHilos2 (String identificador, int tiempo){
		this.identificador = identificador;
		this.tiempo = tiempo;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				System.out.println(identificador);
				Thread.sleep(tiempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Runnable hilo1 = new PHilos2("Hilo1",1000);
		Runnable hilo2 = new PHilos2("Hilo2",2000);
		
		/*De esta forma solo ejecuta el metodo dentro del run, es decir 
		 * aunk implemente runnable es como si se comportara como un simple metodo*/
		//hilo1.run();
		//hilo2.run();
		
		//Aqui si que se produce el funcionamiento de hilos
		new Thread(hilo1).start();
		new Thread(hilo2).start();
	}

	

}
