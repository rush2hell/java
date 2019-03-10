import java.io.*;
class InputDemo
{
	public static void main(String args[]) throws Exception
	{
			int n1,n2,sum;
			InputStreamReader in =new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(in);
			System.out.println("Enter value for 2 values : ");
			n1=Integer.parseInt(br.readLine());
			n2=Integer.parseInt(br.readLine());
			sum=n1+n2;
			System.out.println("Addition of Numbers : " +sum);
	}
}