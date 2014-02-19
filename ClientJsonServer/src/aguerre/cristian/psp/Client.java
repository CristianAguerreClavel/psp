package aguerre.cristian.psp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client {

	public static void main(String[] args) {
		ObjectOutputStream objectOutput = null;
		ObjectInputStream objectInput = null;
		Socket socket = null;
		
		try{
			socket = new Socket("127.0.0.1",8080);
			objectOutput = new ObjectOutputStream(socket.getOutputStream());
			objectInput = new ObjectInputStream(socket.getInputStream());
			
			//TODO Enviar la peticion
			String mensaje = buildMessage();
			objectOutput.writeObject(mensaje);
			
			//Recibo la respuesta
			String respuesta = (String)objectInput.readObject();
			
			//Muestro la respuesta
			System.out.println(respuesta);
			
			//TODO CERRAR
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
//	GET /index.html HTTP/1.1
//	Host: www.example.com
//	User-Agent: nombre-cliente
//	[Línea en blanco]
	public static String buildMessage(){
		String peticion;
		peticion="GET /index.html?objeto=categoria&id=1 HTTP/1.0\n";
		peticion+="HOST: 127.0.0.1\n";
        peticion+="User-Agent: Client.java\n";
        peticion+="";
       return peticion;
	}

}
