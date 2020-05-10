public class EmpWageBuilder{
	public static void main(String[] args)
		{
		int fulltime=1;
		double empCheck=Math.floor(Math.random()*10)%2;		//multiplied by 10 because Math.random value is between 0 to 1
		if (empCheck == fulltime)
			System.out.println("Employ is present");
		else
			System.out.println("Employ is Abscent");
		}
}
