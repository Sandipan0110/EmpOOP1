package empOOP1;

public class UC7 {
	
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHr = 20;
	public static final int numofWorkingDays = 2;
	public static final int maxHrsInMonth = 10;

	
	public static int computeEmpWage() {
		
		int totalEmpHrs = 0;
		int emphrs = 0;
		int totalWorkingDays = 0;
		
		while(totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numofWorkingDays ) {
			totalWorkingDays++;
			
			int empcheck = (int) (Math.floor(Math.random() * 10) % 3);
			
			switch(empcheck) {
			case isPartTime :
				emphrs =4;
				break;
			case isFullTime :
				emphrs = 8;
				break;
			default :
				emphrs = 0;
			}
			
			totalEmpHrs += emphrs;
			System.out.println("Days: " +totalWorkingDays + "Emp Hr: " +emphrs);
		}
		
		int totalEmpWage = totalEmpHrs * empRatePerHr;
		System.out.println("Total Emp Wage: " +totalEmpWage);
		return totalEmpWage;		
	}
	
	public static void main(String[] args) {
		
		computeEmpWage();
	}

}
