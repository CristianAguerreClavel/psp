package serpis.psp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UpdServer {

	private static final int PORT = 12345;
	private static final int MAX_PACKET_SIZE = 2048; // La longitud maxima de un paqueta udp es de 2elevado16 = 65536
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("udpServer");
		
		DatagramSocket datagramSocket = new DatagramSocket(PORT);
		byte[] buf = new byte[MAX_PACKET_SIZE];
		int length = buf.length;
		DatagramPacket inDatagramPacket = new DatagramPacket(buf, length);
	
		datagramSocket.receive(inDatagramPacket); // Llamada bloqueante, es decir, espera hasta recibir, se pueden establecer timeout
		
		System.out.println("updServer Information packet");
		System.out.println("-------------------------------------------");
		System.out.println("Remote ip   ="+inDatagramPacket.getAddress());
		System.out.println("Remote port ="+inDatagramPacket.getPort());
		
		String mensage = new String(buf,0, inDatagramPacket.getLength());
		System.out.println("Mesage      ="+mensage);
		
		System.out.println("-------------------------------------------");
		System.out.println("updServer End Information");
		
		
	}

}
