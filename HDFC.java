class Sbi
{	int amontBalance;
	Sbi(int amontBalance)
	{	
		System.out.println("Processing your account....!");
		if(amontBalance>=5000)
		{   this.amontBalance=this.amontBalance+amontBalance;
			System.out.println("your amount as successfully credited");
		}
		else
		{   System.out.println("Please deposite valid amount");
		}
	}
	void getamontBalance()
	{
		System.out.println("Your account balance is :"+ amontBalance);
	}

}
class HDFC
{
	public static void main(String args[])	
	{
		System.out.println("Start");
		Sbi sb = new Sbi (600000);
		System.out.println("Stop");
	}
}