class Register extends WorkVariables
{	
	public void obs() 
	{
		int days=1;
		int totalWorkHrs=0;
		int totalSalary=0;
		int daysWorked=0;
		int workHour=0;
		int perHrWage=20;
		while(daysWorked<=maxdays && totalWorkHrs<=maxWorkHrs && days<=30 )
		{
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			System.out.println(empCheck+"  "+totalWorkHrs+"  "+daysWorked+"  "+days);
			switch (empCheck)
			{
			case fulltime:
				System.out.println("Fulltime");
				workHour=fulltimeHrs;
				daysWorked=daysWorked+1;
				days=days+1;
				break;
			case parttime:
				System.out.println("Parttime");
				workHour=parttimeHrs;
				daysWorked=daysWorked+1;
				days=days+1;
				break;
			case abscent:
				System.out.println("Abscent");
				workHour=abscentHrs;
				days=days+1;
				break;
			}
		
		int dailyWage=workHour*perHrWage;
		totalSalary=totalSalary+dailyWage;
		totalWorkHrs=totalWorkHrs+workHour;
		System.out.println("Total Salary="+ totalSalary);
		}
	}
}
	
class WorkVariables
{
	final int fulltime=1;
	final int abscent=0;
	final int parttime=2;
	int parttimeHrs;
	int fulltimeHrs;
	int abscentHrs;
	int perHrWage;
	int maxdays;
	int maxWorkHrs;
	public WorkVariables()
	{
		fulltimeHrs=8;
		abscentHrs=0;
		perHrWage=20;
		parttimeHrs=4;
		maxdays=20;
		maxWorkHrs=100;		
		
	}
}

public class EmpWageBuilder {
	public static void main(String[] args)
		{
			Register observed=new Register();
			observed.obs();
		}
}
