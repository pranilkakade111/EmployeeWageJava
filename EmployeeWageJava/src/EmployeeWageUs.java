
public class EmployeeWageUs 
{
  public void EmployeeWageUC1()
  {
	  int IsPresent=1;
	  double empCheck = Math.floor(Math.random() * 10) % 2;
	  
	  if(IsPresent==empCheck)
	  {
		  System.out.println("Employee is Present");
	  }
	  else
	  {
		  System.out.println("Employee is Abscent");
	  }
  }
	public static void main(String[] args) 
	{
      System.out.println("Welcometo Employee Wage Computation Program");
      EmployeeWageUs obj=new EmployeeWageUs();
      obj.EmployeeWageUC1();
	}

}
