import java.util.Scanner;
class Input
{
	public static void main(String args[])
	{
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number to test and show");
		num=input.nextInt();
		System.out.println("your number is"+num);
	}
}