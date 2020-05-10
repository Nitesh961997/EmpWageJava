public class EmpWageComputaion{
	public static void main(String[] args)
		{
		int fullTime=1;
		int partTime=2;	
		int workHour;
		int perHrWage=20;
		double empCheck=(int)Math.floor(Math.random()*10)%3;		//multiplied by 10 because Math.random value is between 0 to 1
		if (empCheck == fullTime)
		{
			System.out.println("Employee is working fulltime"+empCheck);
			workHour=8;
		}
		else if (empCheck==partTime)
		{
			System.out.println("Employee is working Parttime"+empCheck);
			workHour=4;
		}
		else
		{
			System.out.println("Employee is Abscent");
			workHour=0;	
		}	
		int dailyWage=workHour*perHrWage;
		System.out.println("Daily Wage="+dailyWage);
		}
}

