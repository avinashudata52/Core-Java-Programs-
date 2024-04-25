class Nonpristatic1
{
	//static Nonpristatic1 ref;
	public static void main(String args[])
	{
	System.out.println("Start");
	Nonpristatic1  ref = new Nonpristatic1();
	ref.m2();
	ref.m1();
	System.out.println("Stop");
	
}
	void m1()
	{
	System.out.println("Inside m1 Method");
	}
	void m2()
	{
	System.out.println("Outside m1 method");
	}
	}