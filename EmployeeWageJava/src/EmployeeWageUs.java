import java.util.Scanner;

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
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the choice=");
      int ch=sc.nextInt();
      
      switch(ch) 
      {
    	  case 1: System.out.println("To calculate the Employee Wage");
    		      EmployeeWageUs obj=new EmployeeWageUs();
    	  		  obj.EmployeeWageUC1();
    	  		  break;
    	  		  
    	  case 2:  System.out.println("To calculate The part-full time Employee Wage"); 
    		       EmployeePartTime obj2=new EmployeePartTime();
                   obj2.EmployeeUC3();
                   break;
                   
    	  case 3: System.out.println("To calculate Monthly employee wage");
    	          CalculateMonthWage obj3=new CalculateMonthWage();
    	          obj3.EmployeeUC5();
    	          break;
    	          
    	  case 4: System.out.println("To calulate employee wage hours ");
    	          EmployeeWageHrs obj4=new EmployeeWageHrs();
    	          obj4.employeeWageUC6();
    	          break;
    	          
    	  default: System.out.println("Wrong Selection");
    	           break;
      }  
      
      
	}
	
}

class EmployeePartTime
{
	public void EmployeeUC3()
	{
		int PartTime=1;
		int FullTime=2;
		int RatePerHr=20;
		int Hr=0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(FullTime==empCheck)
		{
			 Hr=8;
		}
		else if(PartTime==empCheck)
		{
			 Hr=4;
		}
		else
		{
			System.out.println("Salary=0");
		}
		 int Salary=RatePerHr*Hr;
		 System.out.println("Salary="+Salary);
	}   
}

class CalculateMonthWage
{
	public void EmployeeUC5() 
	{
		int PartTime=1;
		int FullTime=2;
		int RatePerHr=20;
		int Hr=0;
		int DaysInMonth=20;
		int totalEmpWage=0;
		for(int days=0;days<DaysInMonth;days++)
		{
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(FullTime==empCheck)
		{
			 Hr=8;
		}
		else if(PartTime==empCheck)
		{
			 Hr=4;
		}
		else
		{
			System.out.println("Salary=0");
		}
		 int Salary=RatePerHr*Hr;
		 totalEmpWage += Salary;
		 System.out.println("Salary="+Salary);
	  }
		System.out.println("Total Employee Wage"+totalEmpWage);
 }
}

class EmployeeWageHrs
{
	public void employeeWageUC6()
	{
		int PartTime=1;
		int FullTime=2;
		int RatePerHr=20;
		int Hr=0;
		int DaysInMonth=20;
		int MaxHrs=100;
		int totalEmpWage=0;
		int totalhrs=0;
		int totalworkingday=0;
		int totalemphr=0;
		while(totalhrs <= MaxHrs && totalworkingday < DaysInMonth)
		{
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(FullTime==empCheck)
		{
			 Hr=8;
		}
		else if(PartTime==empCheck)
		{
			 Hr=4;
		}
		else
		{
			System.out.println("Salary=0");
		}
		 totalemphr += Hr;
		 System.out.println("Days="+ totalworkingday + "Employee Hrs=" +Hr);
	  }
		totalEmpWage = totalemphr*RatePerHr;
		System.out.println("Total Employee Wage"+totalEmpWage);	
	}
}