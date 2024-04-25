class parent
{	void m1()
	{
	System.out.println("Multilple class");
}
}

class child extends parent implements multiple
{	void m2()
	{
	System.out.println("Multilple class 1");
}
	public static void main(String args[])
	{
		child c = new child();
		c.m1();
		c.m2();
	}
}

interface multiple 
{
	void m3()
	{
		System.out.println("Interface");
	}
}

