class parent
{	
	void m1()
	{	System.out.println("Inside the m1 method ----> parent");
	}

	void m2()
	{	System.out.println("Inside the m2 method ----> parent");
	}
}
class child extends parent
{
	
	void m1()
	{	System.out.println("Inside the m1 method ----> child");
	}
	
	void m2()
	{	System.out.println("Inside the m3 method ----> child");
	}
}
class Exp2
{
	public static void main(String ars[])
	{
		//upcasting
		parent p = new child();
		p.m1();
		

		//downcasting
	//	child ch = (child) p;
		//ch.m1();
		//ch.m2();
		//sch.m3();

	}
}