public class Activity {
	//input some private instance variables
private int day;
private int month;
private int year;

Activity(){
	
	day = 1;
	month = 1;
	year = 1;
	
} 
Activity(int day, int month, int year)
{
	 if (day <= 0 || day > 31) //check if the user inputs something outside the bounds of a day
	 {
		 System.out.println("Error: Date invalid.");
	 }
	 else
	 {
		 this.day= day;
	 }//end else
	
	
	if(month <= 0 || month > 12) //check if the user inputs something outside the bounds of a month
	{
		System.out.println("Error: Date invalid.");
	}
	else
	{
		this.month = month;
	}//end else
	
	if(year < 0) //check if the user inputs something outside the bounds of a year
	{
		System.out.println("Error: Date invalid.");
	}
	
	else {
		this.year = year;
	}//end else
}//end activity

public int getDay()
{
	return this.day; 
}

public int getMonth() 
{
	return this.month;
}

public int getYear()
{
	return this.year;
}


public void setDate(int day, int month, int year) {
	
	 if (day <= 0 || day > 31) //check if the user inputs something outside the bounds of a day
	 {
		 System.out.println("Error: Date invalid.");
		 this.day = 1;
	 }
	 else
	 {
		 this.day= day;
	 }//end else
	
	
	if(month <= 0 || month > 12) //check if the user inputs something outside the bounds of a month
	{
		System.out.println("Error: Date invalid.");
		this.month = 1;
	}
	else
	{
		this.month = month;
	}//end else
	
	if(year < 0) //check if the user inputs something outside the bounds of a year
	{
		System.out.println("Error: Date invalid.");
		this.year = 1;
	}
	
	else {
		this.year = year;
	}//end else
	
	
}//end method

public void printDate()
{
	System.out.println(""+day+"."+month+"."+year+""); //print the stuff out
}//close printDate method

}