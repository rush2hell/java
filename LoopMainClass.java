class Loop
{
	public void armStrong(int num)
	{
		int org;
		org=num;
		while(num!=0)
		{
			int remainder=num%10;
			int ans=0;
			ans=ans+remainder+remainder+remainder;
			num/=10;
		}
		if(org==num)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}
	}
	public void reverse(int n)
	{
		while(n!=0)
		{
			int remainder=n%10;
			int ans=0;
			ans=ans%10+remainder;
			n/=10;
			System.out.print(ans);
		}
	}
	public void sumDigit(int num)
	{
		while(num>0)
		{
			int remainder=num%10;
			int sum=0;
			sum=sum+remainder;
			num/=10;
			System.out.print(sum);
		}
	}
	public void palindrome(int n)
	{
		int real;
		real=n;
		int rev=0;
		while(n>0)
		{
			int t=n%10;
			rev=10*rev+t;
			n/=10;
		}
		if(real==rev)
		{	
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
class LoopMainClass
{
	public static void main(String args[])
	{
		Loop l=new Loop();
		l.armStrong(123);
		l.reverse(321);
		l.sumDigit(123);
		l.palindrome(123);
	}
}