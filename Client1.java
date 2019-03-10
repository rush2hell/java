//client1 to receive strings
import java.io.*;
import java.net.*;
class Client1
{
	public static void main(String args[]) throws Exception
	{
		//create client socket with same port number 
		Socket s=new Socket("localhost",777);
		//to read data coming from server,attach InputStream to the socket
		InputStream obj=s.getInputStream();
		//to read data from the socket into client, use Buffered Reader 
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		//receive Strings
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println("From server : " +str);
			//close connection by closing stream and sockets
			br.close();
			s.close();
		}
	}
}