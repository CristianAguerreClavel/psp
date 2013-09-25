package serpis.psp;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.SocketException;


public class UdpClient {

	
	public static void main(String[] args) throws SocketException {
		
		System.out.println("updClient");

		DatagramSocket  datagramSocket = new DatagramSocket();
		
		String mesage = " Hola udp ";
		byte[] buf = mesage.getBytes();
		int lenght = buf.length;
		
		DatagramPacket outDatagramPackete = new DatagramPacket(null, 0, 0, null, 0);
		
	}

}
