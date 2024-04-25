class cyber
{
	static void m1(int a)
	{
	System.out.println(a);
	}
}
class success{
	
	static float m2()
	{
		System.out.println("Inside M2");
		float b=200.5f;
		System.out.println(b);	
	return b;
			
	}
}
class Demo5
{
	public static void main(String args[])
	{
		success sc = new success();
		int a = 100;
		cyber.m1(a);
		sc.m2();
		System.out.println(sc.b);


		}
}