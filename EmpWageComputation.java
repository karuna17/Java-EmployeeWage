
public class EmpWageComputation {

	int empCheck = (int) (Math.floor(Math.random()*10)%2);
	public void empChecking() {
		if(empCheck==1)
		{
			System.out.println("Emloyee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}	
	}

	public static void main(String[] args) {
		EmpWageComputation e = new EmpWageComputation();
		e.empChecking();
	}

}
