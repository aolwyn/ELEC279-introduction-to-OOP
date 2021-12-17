public class HourlyEmployee extends Employee implements Cloneable, Comparable<HourlyEmployee>, Payable
                                                  
{
    private double wageRate;
    private double hours; //for the month

    public HourlyEmployee( )
    {
        super( );
        wageRate = 0;
        hours = 0;
    }
    //compares the alphabetical order of the employee's names.
    public int compareTo(HourlyEmployee anotherWorker) 
    {	
    return this.getName().compareTo(anotherWorker.getName());	
    }
    //the better clone method
  public Object clone() 
  {
HourlyEmployee newEmployee = (HourlyEmployee) super.clone();
return newEmployee;
    }
  
  public double amountToPay()
	{
	  return wageRate * hours; //a method given to us already does the required calculation (wageRate * hours), so idk why we didn't 
	  						   //just use getPay(), doesn't make much sense to me but whatever
	}
	
	public void printPayment()
	{
		System.out.println("Payment information for an hourly employee. Employee name: "+this.getName()+"; payment: "+this.getPay());
	}																					//might be an improper usage of the this operator
																						//not quite sure but I get the same output so *shrug*
  
  
    
    
    /**
     Precondition: Neither theName nor theDate is null;
     theWageRate and theHours are nonnegative.
    */
    public HourlyEmployee(String theName, Date theDate,
                       double theWageRate, double theHours)
    {
         super(theName, theDate);
         if ((theWageRate >= 0) && (theHours >= 0))
         {
             wageRate = theWageRate;
             hours = theHours;
         }
         else
         {
             System.out.println(
                       "Fatal Error: creating an illegal hourly employee.");
             System.exit(0);
         }
    }

    public HourlyEmployee(HourlyEmployee originalObject)
    {
         super(originalObject);
         wageRate = originalObject.wageRate;
         hours = originalObject.hours;
    }

    public double getRate( )
    {
        return wageRate;
    }

    public double getHours( )
    {
        return hours;
    }

    /**
     Returns the pay for the month.
    */
    public double getPay( )
    {
        return wageRate*hours;
    }

    /**
     Precondition: hoursWorked is nonnegative.
    */
    public void setHours(double hoursWorked)
    {
         if (hoursWorked >= 0)
             hours = hoursWorked;
         else
         {
             System.out.println("Fatal Error: Negative hours worked.");
             System.exit(0);
         }
     }

    /**
     Precondition: newWageRate is nonnegative.
    */
    public void setRate(double newWageRate)
    {
         if (newWageRate >= 0)
             wageRate = newWageRate;
         else
         {
             System.out.println("Fatal Error: Negative wage rate.");
             System.exit(0);
         }
    }

    public String toString( )
    {
        return (getName( ) + " " + getHireDate( ).toString( )
                + "\n$" + wageRate + " per hour for " + hours + " hours");
    }

    public boolean equals(HourlyEmployee other)
    {
       return (getName( ).equals(other.getName( ))
                && getHireDate( ).equals(other.getHireDate( ))
                && wageRate == other.wageRate
                && hours == other.hours);
    }


}
