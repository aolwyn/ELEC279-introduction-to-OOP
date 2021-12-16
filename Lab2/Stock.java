
public class Stock {
	//input some private instance variables
private int day;
private int month;
private int year;
private String name; 
private int previousValue;
private int currentValue;

Stock()
{

	day = 1;
	month = 1;
	year = 1;
	name  = "";
	previousValue = 0;
	currentValue = 0;
	
}

 Stock(int day, int month, int year, String name, int previousValue, int currentValue)
 {
	
	 if (day <= 0 || day > 31) //check if the user inputs something outside the bounds of a day
	 {
		 System.out.println("Error: invalid entry");
		 this.day = 1;
	 }//end if
	 else
	 {
		 this.day= day;
	 }//end else
	
	
	if(month <= 0 || month > 12) //check if the user inputs something outside the bounds of a month
	{
		System.out.println("Error: invalid entry");
		this.month = 1;
	}//end if
	else
	{
		this.month = month;
	}//end else
	
	if(year < 0) //check if the user inputs something outside the bounds of a year
	{
		System.out.println("Error: invalid entry");
		this.year = 1;
	}//end if
	
	else {
		this.year = year;
	}//end else
	
	if (previousValue < 0) 
	{
		System.out.println("Error: invalid entry");
		this.previousValue = 0;
	}//end if
	else
	{
		this.previousValue = previousValue;
	}//end else
	 
	if(currentValue < 0)
	{
		System.out.println("Error: invalid entry");
		this.currentValue = 0;
	}//end if
	else
	{
		this.currentValue = currentValue;
	}//end else
	
	if(name.isEmpty() == true)
	{
		System.out.println("Error: invalid entry");
	}//end if
	
	else
	{
		this.name = name;
	}//end else
	
}//end stock 

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

public String getName() 
{
	return this.name;
}

public int getPreviousValue() 
{
	return this.previousValue;
}

public int getCurrentValue()
{
	return this.currentValue;
}


public void setDate(int day, int month, int year) {
	
	 if (day <= 0 || day > 31) //check if the user inputs something outside the bounds of a day
	 {
		 System.out.println("Error: invalid entry");
		 this.day = 1;
	 }
	 else
	 {
		 this.day= day;
	 }//end else
	
	
	if(month <= 0 || month > 12) //check if the user inputs something outside the bounds of a month
	{
		System.out.println("Error: invalid entry");
		this.month = 1;
	}
	else
	{
		this.month = month;
	}//end else
	
	if(year < 0) //check if the user inputs something outside the bounds of a year
	{
		System.out.println("Error: invalid entry");
		this.year = 1;
	}
	
	else {
		this.year = year;
	}//end else
	
	
}//end method

public void setName(String name)
{
	if (name.isEmpty() == true)
	{
		System.out.println("Error: invalid entry");
	}//end if
	else 
	{
		this.name = name;
	}//end else
	
}//end setName

public void setCurrentValue (int currentValue)
{
	if (currentValue < 0)
	{
		this.previousValue = this.currentValue;
		this.currentValue = 0;
		System.out.println("Error: invalid value");
	}//end if
	else
	{
		this.previousValue = this.currentValue;
		this.currentValue = currentValue;
	}//end else
}//end setCurrentValue

public void printStock()
{
	System.out.println(""+name+": "+day+"."+month+"."+year+" curr:"+currentValue+" prev:"+previousValue+" ");
}

public int getChange()
{
	int difference = currentValue - previousValue;
	return Math.abs(difference);
			
			
}//end getChange
}//end class
