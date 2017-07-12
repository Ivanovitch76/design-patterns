package TCPIP;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		String msg = "Tagada Boum Boum Tsoin Tsoin";
//		MulticastSocket socket = new MulticastSocket(8084);
//		InetAddress group = InetAddress.getByName("239.255.80.84");
//		socket.joinGroup(group);
//		byte[] bytes = msg.getBytes("UTF-8");
//		DatagramPacket packet = new DatagramPacket(bytes, bytes.length, group, 8084);
//		socket.send(packet);
//		byte[]buf = new byte[1000];
//		DatagramPacket recv;
//		for (int i = 0; i < 25; i++) {
//		    byte[] buf2 = new byte[256];
//		    packet = new DatagramPacket(buf, buf.length);
//		    socket.receive(packet);
//
//		    String received = new String(packet.getData());
//		    System.out.println("Quote of the Moment: " + received);
//		}
//
//		
//		socket.leaveGroup(group);
//		socket.close();
		
		String msg = "Vais devenir dingue avec ces trucs!";
		String IP = "239.255.80.84";
		int port = 8084;		
		
		NetworkGroup nwG = new NetworkGroup(IP, port);
		nwG.send(msg);
		
//		socket.joinGroup(address);
//		byte[] bytes = msg.getBytes("UTF-8");
//		DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, 8084);
//		socket.send(packet);
//		byte[]buf = new byte[1000];
//		DatagramPacket recv;
//		for (int i = 0; i < 25; i++) {
//		    byte[] buf2 = new byte[256];
//		    packet = new DatagramPacket(buf, buf.length);
//		    socket.receive(packet);
//
//		    String received = new String(packet.getData());
//		    System.out.println("Quote of the Moment: " + received);
//		}
//
//		
//		socket.leaveGroup(address);
//		socket.close();


	}
		
}
