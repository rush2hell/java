/*
class Student
{
	public void show()
	{
		System.out.println("Student class");
	}
}
class Marks extends Student
{
	public void display()
	{
		System.out.println("Mark class");
	}
}
interface SportMarks
{
	public void take();
}
class Result extends Marks implements SportMarks
{
	public void take()
	{
		System.out.println("SportMarks class");
	}
	public static void main(String args[])
	{
		Result r=new Result();
		r.show();
		r.display();
		r.take();
	}
}
*/
class Student
{
	String name;
	int roll_no;
	Student()
	{
		name="Rushabh";
		roll_no=1;
	}
	public void details()
	{
		System.out.println("Name of Student : " +name);
		System.out.println("Roll No of " +name+" " +roll_no);
	}
}
class Marks extends Student
{
	int m_sub1=87,m_sub2=67,m_sub3=89;
	int	total=m_sub1+m_sub2+m_sub3;
	public void marks()
	{
		System.out.println("Marks of Subject 1 : " +m_sub1);
		System.out.println("Marks of Subject 2 : " +m_sub2);
		System.out.println("Marks of Subject 3 : " +m_sub3);
	}
}
interface SportMarks
{
	final int marks=20;
	public void showResult();
}
class Result extends Marks implements SportMarks
{
	public void showResult()
	{
		int total;
		total=m_sub1+m_sub2+m_sub3+marks;
		System.out.println("Total Marks For Student : " +total);
	}
	public static void main(String args[])
	{
		Result r=new Result();
		r.details();
		r.marks();
		r.showResult();
	} 
}