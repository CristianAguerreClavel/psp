package aguerre.cristian.psp;
import java.util.Hashtable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ServerJson {
	//private static final String SERVER_IP = "127.0.0.1";
		
		public static void main(String[] args) throws IOException {
			ObjectInputStream objectInput = null;
			ObjectOutputStream objectOutput = null;
			
			Socket socket = null;
			ServerSocket serverSocket;
			serverSocket = new ServerSocket(8080);
			
			
			while (true){
				try{
					System.out.println("Iniciada escucha...");
					socket = serverSocket.accept();
					
					System.out.println("Recibida conexion");
					objectInput = new ObjectInputStream(socket.getInputStream());
					objectOutput = new ObjectOutputStream(socket.getOutputStream());
					
					//Leo el mensaje del cliente
					String mensaje = (String) objectInput.readObject();
					getParameters(mensaje);
					
					//Envio la respuesta 
					//TODO
					//objectOutput.writeObject(CATEGORIA);
				}catch(Exception exception){
					exception.printStackTrace();
				}
			}
		}
		
		public static void getParameters(String mensaje){
			String filtrado1 = mensaje.substring(5);//Quitamos el GET;
			int indice = mensaje.indexOf("HTTP/1.0");
			String filtrado2 = filtrado1.substring(0,indice-6);
//			System.out.println(mensaje);
//			System.out.println(filtrado1);
//			System.out.println(filtrado2);
			int indiceParametros = filtrado2.indexOf("?");
			String parametros = filtrado2.substring(indiceParametros+1);
			System.out.println(parametros);
			System.out.println("----------------------------");
			
			Hashtable<String, String> parametro = new Hashtable<String, String>();//Realizado con diccionario para probalos en java
			//Separo los dos parametros
			int indice2 = parametros.indexOf("&");
			String p1 = parametros.substring(0,indice2);
			System.out.println(p1);
			int lenght = parametros.length();
			String p2 = parametros.substring(indice2+1,lenght);
			System.out.println(p2);
			//parametro.put("España","Madrid");
		    
			
		}
}

