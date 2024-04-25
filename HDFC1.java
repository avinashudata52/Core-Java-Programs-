class HDFC1
{
	int accnum;
	String custname;
	int accbalance;
	String branch="Goodluck Chowk";
	
	static 
	{
		System.out.println("Coonection Establisated successfully");
	}
	{
		System.out.println("Please wait creating your account");
	}
	HDFC1(int accnum,String custname,int accbalance)
	{
		this.custname=custname;
		this.accnum=accnum;

		if(accbalance>=5000)
		{
			this.accbalance=accbalance;
		}

		else
		{	System.out.println("Please enter grater than 5000rs");
		}
	}
	void getaccdetails(){
	System.out.println("Accout Number " +accnum+ " Customer Name :"+custname+"  Account Balance "+accbalance+" Branch "+branch);
	}

	public static void main(String args[])
	{
		HDFC1 obj = new HDFC1(1000,"Chutya",4999); 
		obj.getaccdetails();
	}
	
}