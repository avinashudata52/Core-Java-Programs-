class parent
{
	void m1()
	{
		System.out.println("This is Hybrid class");
	}
}
class child1 extends parent
{
	void m2()
	{
		System.out.println("This is Hybrid class 1");
	}
}
class child2 extends parent
{
	void m3()
	{
		System.out.println("This is Hybrid class 2 ");
	} 
}
class Hybrid extends child2,child1
{
	void m4()
	{
		System.out.println("This is Hybrid class 3");
	}
	public static void main(String arg[])
	{
		Hybrid h = new Hybrid();
		h.m1();
		h.m2();
		h.m3();
		h.m4();
		}
}