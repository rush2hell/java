//Progrma to know the IP address of website
import java.io.*;
import java.net.*;
class Address
{
	public static void main(String args[]) throws IOException
	{
		//accept name of website from keyboard
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Name of website : ");
		String site_name=in.readLine();
		try
		{
			//getByName() method accepts site name and returns its IP-Address
			InetAddress ip=InetAddress.getByName(site_name);
			System.out.println("The IP Address of Website : " + ip);
		}
		catch(UnknownHostException ue)
		{
			System.out.println("Website not found");
		}
	}
}