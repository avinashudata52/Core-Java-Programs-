class Example2
{
	Example2()
	{
	System.out.println("Inside Cons arg 0");
	}
	Example2(int a)
	{
	System.out.println("Inside Cons args 1");
	}
	public static void main(String args[])	
	{
	System.out.println("Start");
	Example2 obj = new Example2();
	Example2 obj1  = new Example2(10);
	System.out.println("Stop");
	}
}