package empOOP1;

public class UC1 {
	
void Emp() {
		
		int FULL_TIME = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		
		if (empcheck == FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
	
	
	public static void main(String[] args) {
		
		UC1 a = new UC1();
		a.Emp();
		
	}

}
