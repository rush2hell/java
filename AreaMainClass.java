class Area
{
	public int square(int num1)
	{
		return num1*num1;
	}
	public double circle(int r)
	{
		return 3.14*r*r;
	}
	public int rect(int l,int b)
	{
		return l*b;
	}
	public int cube(int num1)
	{
		return num1*num1*num1;
	}
}
class AreaMainClass
{
	public static void main(String args[])
	{
		Area ar=new Area();
		System.out.println(ar.square(5));
		System.out.println(ar.circle(4));
		System.out.println(ar.rect(4,6));
		System.out.println(ar.cube(3));
	}
}