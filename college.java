class college
{
	int studid;
	String studname;
	static String Institute= "Cyber Success";
	
	college(int studid, String studname)
	{
		this.studid=studid;
		this.studname=studname;	
	}
	void getStudentinfo()
	{
	System.out.println("Student id is: "+studid+"Student name is : "+studname + "Student institute is : "+Institute);
	}

	public static void main(String args[])
	{
		college clg = new college(101, "avinash"); 
		college clg1 = new college (202, "Vinayak");
		clg.getStudentinfo();
		clg.getStudentinfo();
		clg1.getStudentinfo();
	}
}
