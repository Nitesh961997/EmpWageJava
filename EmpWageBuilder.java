class Register 
{
        public int obs(String s,int n, int d,int h)
        {		final int fulltime=1;
        		final int abscent=0;
        		final int parttime=2;
        		int parttimeHrs=4;
        		int fulltimeHrs=8;
        		int abscentHrs=0;
                int days=0;
                int totalWorkHrs=0;
                int totalSalary=0;
                int maxdays=d;
                int daysWorked=0;
                int maxWorkHrs=h;

                while(daysWorked<=maxdays && totalWorkHrs<=maxWorkHrs && days<=30 )
                {
                        int empCheck=(int)Math.floor(Math.random()*10)%3;          //class method
                        int perHrWage=n;
                        int workHour=0;
                        int dailyWage;
                        System.out.println(empCheck+"  "+totalWorkHrs+"  "+daysWorked+"  "+days);
                        switch (empCheck)
                        {
                        case fulltime:
                                //System.out.println("Fulltime");
                                workHour=fulltimeHrs;
                                daysWorked=daysWorked+1;
                                days=days+1;
                                break;
                        case parttime:
                                //System.out.println("Parttime");
                                workHour=parttimeHrs;
                                daysWorked=daysWorked+1;
                                days=days+1;
                                break;
                        case abscent:
                                //System.out.println("Abscent");
                                workHour=abscentHrs;
                                days=days+1;
                                break;
                        }
                dailyWage=workHour*perHrWage;
                totalSalary=totalSalary+dailyWage;
                totalWorkHrs=totalWorkHrs+workHour;
                }
                System.out.println("Total Salary"+s+"="+ totalSalary);
                return totalSalary;
        }

		
		}

public class EmpWageBuilder {
        public static void main(String[] args)
                {
                        Register companyOne=new Register();
                        companyOne.obs("companyOne",30,10,80);
                        Register companyTwo=new Register();
                        companyTwo.obs("companyTwo",20,20,100);

                }
}
