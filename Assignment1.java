class X
{
}
class Y
{
}
class Demo1
{
	X test()
	{	System.out.println("inside test method - Demo -->");
		return new X();
	}
}
class Sample1 extends Demo1
{
	Y test()
	{
		System.out.println("Inside test method - Sample1 -->");
		return new Y();
	}
}
class Assignment1

{
	public static void main(String args[])
	{
		System.out.println("Start");
		Sample1 ss = new Sample1();
		ss.test();
		System.out.println("Stop");
	}
}