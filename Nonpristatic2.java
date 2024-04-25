class Nonpristatic2
{
	char a = 'x';
	static Nonpristatic2 ref = new Nonpristatic2();
	public static void main(String args[])
	{
		System.out.println(Nonpristatic2.ref.a);
	}
}