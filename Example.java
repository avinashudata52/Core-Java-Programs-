class Example
{
	int a ;
	Example(int a)
	{
		System.out.println("Hello MoTo");
		this.a=a;
	}
	void getexp()	
	{
		System.out.println(a);		
	}
	public static void main(String args[])
	{
	Example ex = new Example(10);
	ex.getexp();
	System.out.println("Stop");
	}
}
	