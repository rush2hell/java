class Great
{
	public static void main(String args[])
	{
		int num1,num2,num3;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		num3=Integer.parseInt(args[2]);
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is Greater");
			}
			else
			{
				System.out.println(num3+" is Greater");
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println(num2+" is Greater");
			}
			else
			{
				System.out.println(num3+" is Greater");
			}
		}
	}
}