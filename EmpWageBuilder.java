public class EmpWageComputaion{
	public static void main(String[] args)
		{
		int fullTime=1;
		int partTime=2;	
		int workHour=0;
		int perHrWage=20;
		int empCheck=(int)Math.floor(Math.random()*10)%3;		//multiplied by 10 because Math.random value is between 0 to 1
		switch (empCheck)
		{
		case 1:
			System.out.println("Fulltime");
			workHour=8
			;
			break;
		case 2:
			System.out.println("Parttime");
			workHour=4
			;
			break;
		case 0:
			System.out.println("Abscent");
			workHour=0
			;
			break;
		default:
			System.out.println("invalid");
		}	
		int dailyWage=workHour*perHrWage;
		System.out.println("Daily Wage="+dailyWage);
		}
}
