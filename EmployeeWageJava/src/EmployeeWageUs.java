public class EmployeeWageUs 
{
  public void EmployeeWageUC1()
  {
	  int IsPresent=1;
	  double empCheck = Math.floor(Math.random() * 10) % 2;
	  int RatePerHr=20;
	  int Hr=8;
	  int Salary=RatePerHr*Hr;
	  
	  if(IsPresent==empCheck)
	  {
		  System.out.println("Employee is Present");
		  System.out.println("Salary="+Salary);

	  }
	  else
	  {
		  System.out.println("Employee is Abscent");
		  System.out.println("Salary=0");
		  
	  }
  }
  
  
	public static void main(String[] args) 
	{
      System.out.println("Welcometo Employee Wage Computation Program");
      EmployeeWageUs obj=new EmployeeWageUs();
      obj.EmployeeWageUC1();
      
	}

}
