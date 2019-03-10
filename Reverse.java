import java.io.*;
 
class Reverse
{
   public static void main(String args[]) throws Exception
   {
      String org, reverse = "";
      InputStreamReader in = new InputStreamReader(System.in);
 	  BufferedReader br=new BufferedReader(in);
      System.out.println("Enter a string to reverse");
      org = br.readLine();
      int length = org.length();
      for(int i=length-1;i>=0;i--)
      {
        reverse = reverse + org.charAt(i);
      }
      System.out.println("Reverse : "+reverse);
   }
}