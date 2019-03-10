class PerSwitch
{
	public static void main(String args[])
	{
		int num1;
		num1=Integer.parseInt(args[0]);
		switch((num1)/10)
		{
			case 9:
			System.out.println("Student is Passed With Distinction");
			break;
			case 8:
			System.out.println("Student is Passed With Distinction");
			break;
			case 7:
			System.out.println("Student is Passed With First Class");
			break;
			case 6:
			System.out.println("Student is Passed With Second Class");
			break;
			case 5:
			System.out.println("Student is Passed With Third Class");
			break;
			default:
			System.out.println("Student is Fail");
			break;
		}
	}
}