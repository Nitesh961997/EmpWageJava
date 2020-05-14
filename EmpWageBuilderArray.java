 
class CompanyEmpWage
{
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage=totalEmpWage;
	}
	@Override
	public String toString() 
	{
		return "Total Emp Wage for Company:" +company+"is:"+totalEmpWage;
	}
}
interface IComputeEmpWage
{
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
}
public class EmpWageBuilderArray implements IComputeEmpWage 
{
	public final int partTime=1;
	public final int fullTime=2;

	private int numOfCompany=0;
	public CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray () 
	{
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
	numOfCompany=numOfCompany+1;
	}
	public void computeEmpWage()
	{
		for (int i=0;i<numOfCompany;i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	public int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
		//Variables 
		int empHrs = 0, totalEmpHrs=0 , totalWorkingDays=0;
		while (totalEmpHrs<=companyEmpWage.maxHoursPerMonth &&
				totalWorkingDays< companyEmpWage.numOfWorkingDays)
		{
			totalWorkingDays=totalWorkingDays+1;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch (empCheck) 
			{
				case partTime:
					empHrs=4;
					break;
				case fullTime:
					empHrs=8;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day#:"+totalWorkingDays+"EmpHr:"+empHrs);	
		}
		return totalEmpHrs*companyEmpWage.empRatePerHour;
	}
	public static void main(String[] args)
	{
		EmpWageBuilderArray empWageBuilder=new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Reliance",10,4,20);
		empWageBuilder.computeEmpWage();
		
	}
}
