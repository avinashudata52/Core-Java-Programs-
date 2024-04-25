class Demo6{
char a ='x';
}
class sample{
void m1()
{
	System.out.println("Inside the m1 method");
}
}
class NonstaticMethod
{
	public static void main(String args[])
	{
		Demo6 dm =  new Demo6();
		System.out.println(dm.a);
		
		sample s1 =  new sample();
		s1.m1();
	}
}
	
