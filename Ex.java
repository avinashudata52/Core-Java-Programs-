class Ex
{
	Ex()
	{	this(100);
		System.out.println("Inside 0 arg");
	}
	Ex(int a)
	{ 	System.out.println("Inside 1 arg");
	}

	public static void main(String args[])
	{
		Ex x = new Ex();	
	}
}
