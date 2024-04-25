class nonstatic
{
	public static void main(String args[])
	{
	int a =100;
	nonstatic obj  = new nonstatic();
	int result =  obj.test(a);
	System.out.println("The result is"+result);
	}
	int test(int aa)
	{
	System.out.println("Inside the method");
	int result = aa+200;
	return result;
	}
}