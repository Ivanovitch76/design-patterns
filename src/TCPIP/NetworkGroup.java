package TCPIP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class NetworkGroup {
	
	private int port;
	InetAddress adresse;
	MulticastSocket se;
	MulticastSocket sr;
	
	public NetworkGroup(String adress, int port) throws IOException {
		adresse = InetAddress.getByName(adress);
		this.port = port;
		se = new MulticastSocket(port);
		
	}
	
	public void send(String message) throws IOException {
		DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), adresse, port);
		se.send(packet);
		byte[]buf = new byte[1000];
	}
	
	public MessageNetwork receive() throws IOException {
		return null;
		
	}
	
	
	
	
}
