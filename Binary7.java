//display binary number in other number system
class Binary7
{
	public static void main(String args[])
	{
		int num=0b1010; //binary
		System.out.printf("\n In Decimal = %d",num);
		System.out.printf("\n In Octal =%o",num);
		System.out.printf("\n In Hexadecimal =%x",num);
		System.out.printf("\n In Binary =%s",Integer.toBinaryString(num));
	}
}