public class EmpWageComputaion{
	public static void main(String[] args)
		{
		int fulltime=1;
		int workHour;
		int perHrWage=20;
		double empCheck=(int)Math.floor(Math.random()*10)%2;		//multiplied by 10 because Math.random value is between 0 to 1
		if (empCheck == fulltime)
		{
			System.out.println("Employ is present");
			workHour=8;
		}
		else
		{
			System.out.println("Employ is Abscent");
			workHour=0;	
		}	
		int dailyWage=workHour*perHrWage;
		System.out.println("Daily Wage="+dailyWage);
		}
}

