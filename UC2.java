package empOOP1;

public class UC2 {
	
	int fulltime =1;
	int emphrs = 8;
	int wageperhr = 20;
	int salary;
	
	public UC2() {
		
		double empcheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Random Check : " +empcheck);
		
		if (fulltime == empcheck)
			System.out.println("Employee Hours is : "+emphrs);
		else
			System.out.println("Employee Hours is : 0");
	}
	
	void Emp() {
		
		salary = (emphrs * wageperhr);
		System.out.println("Salary is : " +salary);
	}
	
	public static void main(String[] args) {
		
		UC2 a = new UC2();
		a.Emp();
				
	}

}
