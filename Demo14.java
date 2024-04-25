class Demo14
{
	int a= 10;
	float a1 = 20;
	void m1(int a)
	{
		System.out.println("Inside M1 method");
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String args[])
	{
		Demo14 dm = new Demo14();
		dm.m1(20);
	}
}