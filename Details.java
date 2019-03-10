//connecting to yahoo.com and getting details about it
import java.io.*;
import java.net.*;
import java.util.*;
class Details
{
	public static void main(String args[]) throws Exception
	{
		//pass the site url to url object 
		URL obj=new URL("http://yahoo.com/index.html");
		//open connecction with site on Internet
		URLConnection conn=obj.openConnection();
		//display the date
		System.out.println("Date : " +new Date(conn.getDate()));
		//display content type whether text or HTML
		System.out.println("Content-type : " +conn.getContentType());
		//display expiry Date
		System.out.println("Expiry : " +conn.getExpiration());
		//display last modified date
		System.out.println("Last Modified : " +new Date(conn.getLastModified()));
		//display total byte of index.html page has
		int l=conn.getContentLength();
		System.out.println("Length of Contents (in Bytes) : " +l);
		if(l==0)
		{
			System.out.println("Contents are not Available ");
		}
		else
		{
			int ch;
			InputStream in=conn.getInputStream();
			//display content of the index.html page
			while((ch=in.read())!=-1)
			{
				System.out.print((char)ch);
			}
		}
	}
}