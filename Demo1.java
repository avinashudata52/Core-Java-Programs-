class Demo1
{
	static char x ='a';
	static void m1()
	{
		System.out.println("Inside the method");
	}
}
class Staticmethod
{
	public static void main(String args[])
	{
		System.out.println(Demo1.x);		
		Demo1.m1();

	}
}