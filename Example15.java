class Demo1
{
	 void test()
	{
	System.out.println("inside test method - Demo1");
	}
}
class Sample1 extends Demo1
{
	void test()
	{	System.out.println("Inside test method - sample1");
	}
}
class Example15
{
	public static void main(String args[])
	{
	System.out.println("Satrt");
	Sample1 ss = new Sample1();
	ss.test();
	System.out.println("Stop");
	}
}