class parent
{
	static void m1()
	{
	System.out.println("Inside M1 --- parent");
	}
}

class child extends parent
{
	static void m1()
	{
	System.out.println("Inside m1 ----child");
	}
}
class PC
{
	public static void main(String args[])
	{
	parent p = new child();
	p.m1();
	p.m1();
	

}
}