class Register extends WorkVariables
{	
	public void obs() 
	{
		int totalSalary=0;
		int daysWorked=0;
		int workHour=0;
		int perHrWage=20;
		while(daysWorked<maxdays)
		{
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			System.out.println(empCheck);
			switch (empCheck)
			{
			case 1:
				System.out.println("Fulltime");
				workHour=fulltimeHrs;
				daysWorked=daysWorked+1;
				;
				break;
			case 2:
				System.out.println("Parttime");
				workHour=parttimeHrs;
				daysWorked=daysWorked+1;
				;
				break;
			case 0:
				System.out.println("Abscent");
				workHour=abscentHrs;
				;
				break;
			default:
				System.out.println("invalid");
			}
		
		int dailyWage=workHour*perHrWage;
		totalSalary=totalSalary+dailyWage;
		}
		System.out.println(totalSalary);
	}
}
	
class WorkVariables
{
	int fulltime=1;
	int abscent=0;
	int parttime=2;
	int parttimeHrs;
	int fulltimeHrs;
	int abscentHrs;
	int perHrWage;
	int maxdays;
	public WorkVariables()
	{
		fulltimeHrs=8;
		abscentHrs=0;
		perHrWage=20;
		parttimeHrs=4;
		maxdays=20;
				
		
	}
}

public class EmpWageBuilder {
	public static void main(String[] args)
		{
			Register observation=new Register();
			observation.obs();
		}
}
