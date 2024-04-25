class Demo12
{	int a = 100;
	static Demo12 ref;
	void m1()
	{
		System.out.println("Inside the M1"+a);
	}
}
class Nonpristatic
{
	public static void main(String args[])
	{
		Demo12 ref =  new Demo12();
		System.out.println(Demo12.ref.a);
		
		Demo12.ref.m1();
	}
}