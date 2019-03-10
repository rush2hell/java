class Arithmetic
{
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	public int multiply(int num1,int num2)
	{
		return num1*num2;
	}
	public int div(int num1,int num2)
	{
		return num1/num2;
	}
}
class ArithmeticMainClass
{
	public static void main(String args[])
	{
		Arithmetic a=new Arithmetic();
		System.out.println(a.add(10,2));
		System.out.println(a.sub(10,2));
		System.out.println(a.multiply(10,2));
		System.out.println(a.div(10,2));
	}
}