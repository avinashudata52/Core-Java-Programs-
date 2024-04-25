class A
{	void m1()
	{
		System.out.println("Inside of the m1 method");
	}
}
class B extends A
{
	void m2()
	{	System.out.println("Inside M2 method");
	}
}

class Exmple2
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.m1();
		B b1 = new B();
		b1.m2();
	}
}