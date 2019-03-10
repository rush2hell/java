class Percentage
{
	public static void main(String args[])
	{
		int num1;
		num1=Integer.parseInt(args[0]);
		if(num1>=80)
		{
			System.out.println("Student is Passed With Distinction");
		}
		else if(num1>=70)
		{
			System.out.println("Student is Passed With First Class");	
		}
		else if(num1>=60)
		{
			System.out.println("Student is Passed With Second Class");
		}
		else if(num1>=50)
		{
			System.out.println("Student is Passed With Third Class");
		}
		else
		{
			System.out.println("Student is Fail");
		}
	}
}