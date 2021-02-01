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
      EmployeePartTime obj2=new EmployeePartTime();
      obj2.EmployeeUC3();
      
	}

}

class EmployeePartTime
{
	public void EmployeeUC3()
	{
		int PartTime=1;
		int FullTime=2;
		int RatePerHr=20;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(FullTime==empCheck)
		{
			int Hr=8;
			int Salary=RatePerHr*Hr;
			System.out.println("Salary for Full Time="+Salary);
		}
		else if(PartTime==empCheck)
		{
			int Hrs=4;
			int Salary=RatePerHr*Hrs;
			System.out.println("Salary for Part Time="+Salary);
			
		}
		else
		{
			System.out.println("Salary=0");
		}
	}
}
