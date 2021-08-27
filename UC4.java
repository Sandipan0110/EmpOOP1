package empOOP1;

public class UC4 {
	
	int emphrs = 8;
	int wageperhr = 20;
	int salary;
	double empcheck = Math.floor(Math.random() * 10) % 3;
	int num = (int) empcheck;
	
	public UC4() {

		switch(num) {
	
			case 1: System.out.println("Part Time");
			break;
			case 2: System.out.println("Full Time");
			break;
			default: System.out.println(" 0 ");
		}
		
	}
	
	void Emp() {
		
		salary = (emphrs * wageperhr);
		System.out.println("Salary is : " +salary);
	}
	
	
	public static void main(String[] args) {
		
		UC4 a = new UC4();
		a.Emp();
		
		
	}

}
