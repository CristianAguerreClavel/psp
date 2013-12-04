
public class PHilos {//xk no sale lince

	public static void main(String[] args) {
		Caracol caracol = new Caracol();
		Lince lince = new Lince();
		//caracol.run();
		//lince.run();
		
		new Thread(caracol).start();
		new Thread(lince).start();
		
	}

}


