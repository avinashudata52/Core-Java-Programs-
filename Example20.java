class Example20
{
	int a;
	Example20()
	{	this(10);
		System.out.println("Inside 0 arg const a value");
		this.a=100;
	}
	Example20(int a)
	{
		System.out.println("Inside 1 arg const value");
		this.a=a;
	}
	void m1(int a)
	{	this.a=a;
		System.out.println("inside m1 Method a value ");
	}
	public static void main(String args[])	
	{	new Example20().m1(100);
	}
}