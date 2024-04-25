final class Demo
{
	void m1()
	{	System.out.println("Inside the m1 method");
	}
}
class Sample extends Demo
{
	void m2()
	{	System.out.println("Inside the m2 Method");
	}
}
class Example22
{
	public static void main(String args[])
	{
	Sample s1 = new Sample();
	s1.m1();
	s1.m2();
	}
}
