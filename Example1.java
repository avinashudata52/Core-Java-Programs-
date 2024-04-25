class Example1
{
	Example1(int a)
	{
	System.out.println("Inside the Constructor"+ a);
	return;
	}
	public static void main(String args[])	
	{
	System.out.println("Start");
	Example1 obj =  new Example1(100);
	System.out.println("Stop");
	}
}