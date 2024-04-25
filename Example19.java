class Demo1
{
	int a=100; 
}
class Sample1 extends Demo1
{
	float b=200.5f;
}

class Example19{
	public static void main(String args[])
	{	System.out.println("Start");

		Demo1 d1 = new Sample1();
		
		Sample1 s1 = (Sample1)d1;
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println("Stop");
	}
}

