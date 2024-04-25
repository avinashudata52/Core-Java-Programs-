class parent
{
	void homekey()
	{
		System.out.println("Inside homekey in -----> Parent");
	}
}
class child extends parent
{
	void homekey()
	{	System.out.println("Inside the homekey in -----> Child");
	}
}
class Exp1
{	public static void main(String agd[])
	{
		parent p = new child();
		p.homekey();
	}
}