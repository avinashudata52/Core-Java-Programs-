class Demo13
{
	int a = 100;
	void m1()
	{
	System.out.println("Inside m1 method");
	System.out.println(a);
	}
	public static void main(String args[])
	{
		Demo13 dd = new Demo13();
		dd.m1();

		//m1(new Demo13);
	}
}