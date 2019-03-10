//server1 - to send Strings
import java.io.*;
import java.net.*;
class Server1
{
	public static void main(String args[]) throws Exception
	{
		//create server socket with some port number
		ServerSocket ss=new ServerSocket(777);
		//let the server wait till client accepts connection
		Socket s=ss.accept();
		System.out.println("connection Establised ");
		//attach output stream to the server socket
		OutputStream obj=s.getOutputStream();
		//attach print stream to send data to socket
		PrintStream ps=new PrintStream(obj);
		//send 2 Strings to the client
		String str="Hello User its Rushabh";
		ps.println(str);
		ps.println("Bye");
		//close connection by closing the streams and sockets 
		ps.close();
		ss.close();
		s.close();
	}
}