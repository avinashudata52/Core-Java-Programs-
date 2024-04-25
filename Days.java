class Days
{
	public static void main(String args[])
	{
		int day = 3 ;
		String dayString;
		
		switch(day)		
		{
			case 1: 
			dayString = "Monday";  
			break;
	
			case 2: 
			dayString = "Tuesday";
			break;
	
			case 3: 	
			dayString = "wendsday";
			
			break;
			
			case 4: 
			dayString = "Thuesday";
			
			break;
	
			case 5: 
			dayString = "Friday";
			
			break;
			
			case 6: 
			dayString = "saturday";
			
			break;
			
			default:
			dayString = "Invalid Day";
			break;
		}
		
		System.out.println("This is Day is :"+ dayString);
	}
}